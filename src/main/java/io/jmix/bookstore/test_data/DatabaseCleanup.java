package io.jmix.bookstore.test_data;

import io.jmix.bookstore.customer.Customer;
import io.jmix.bookstore.employee.Employee;
import io.jmix.bookstore.employee.Position;
import io.jmix.bookstore.employee.Region;
import io.jmix.bookstore.employee.Territory;
import io.jmix.bookstore.entity.User;
import io.jmix.bookstore.order.Order;
import io.jmix.bookstore.order.OrderLine;
import io.jmix.bookstore.product.Product;
import io.jmix.bookstore.product.ProductCategory;
import io.jmix.bookstore.product.supplier.Supplier;
import io.jmix.bookstore.product.supplier.SupplierOrder;
import io.jmix.bookstore.product.supplier.SupplierOrderLine;
import io.jmix.bookstore.product.supplier.SupplierOrderRequest;
import io.jmix.bpm.entity.UserGroup;
import io.jmix.bpm.entity.UserGroupRole;
import io.jmix.core.DataManager;
import io.jmix.core.Metadata;
import io.jmix.core.MetadataTools;
import io.jmix.core.SaveContext;
import io.jmix.core.querycondition.PropertyCondition;
import io.jmix.core.security.SystemAuthenticator;
import io.jmix.securitydata.entity.RoleAssignmentEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Component
public class DatabaseCleanup {

    @Autowired
    DataManager dataManager;

    @Autowired
    Metadata metadata;
    @Autowired
    MetadataTools metadataTools;
    @Autowired
    DataSource dataSource;
    @Autowired
    SystemAuthenticator systemAuthenticator;

    public <T> void removeAllEntities(Class<T> entityClass) {

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        performDeletion(entityClass, jdbcTemplate);
    }

    private <T> void performDeletion(Class<T> entityClass, JdbcTemplate jdbcTemplate) {
        String tableName = metadataTools.getDatabaseTable(metadata.getClass(entityClass));

        jdbcTemplate.update("DELETE FROM " + tableName);
    }

    public void removeAllEntities() {

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        performDeletion(Employee.class, jdbcTemplate);

        performDeletion(UserGroupRole.class, jdbcTemplate);
        performDeletion(UserGroup.class, jdbcTemplate);
        performDeletion(Position.class, jdbcTemplate);
        performDeletion(OrderLine.class, jdbcTemplate);
        performDeletion(Order.class, jdbcTemplate);
        performDeletion(Customer.class, jdbcTemplate);
        performDeletion(SupplierOrderLine.class, jdbcTemplate);
        performDeletion(SupplierOrder.class, jdbcTemplate);
        performDeletion(SupplierOrderRequest.class, jdbcTemplate);
        performDeletion(Product.class, jdbcTemplate);
        performDeletion(ProductCategory.class, jdbcTemplate);
        performDeletion(Supplier.class, jdbcTemplate);
        performDeletion(Territory.class, jdbcTemplate);
        performDeletion(Region.class, jdbcTemplate);
    }

    public void removeAllEntities(List<?> entities) {
        SaveContext entitiesToRemove = new SaveContext();
        entities.forEach(entitiesToRemove::removing);
        dataManager.save(entitiesToRemove);
    }

    public void removeNonAdminUsers() {
        PropertyCondition notAdmin = PropertyCondition.notEqual("username", "admin");
        List<RoleAssignmentEntity> allRoleAssignmentExceptAdmin = dataManager.load(RoleAssignmentEntity.class).condition(notAdmin).list();
        List<User> allUsersExceptAdmin = dataManager.load(User.class).condition(notAdmin).list();
        removeAllEntities(Stream.concat(allRoleAssignmentExceptAdmin.stream(), allUsersExceptAdmin.stream()).collect(Collectors.toList()));
    }
}