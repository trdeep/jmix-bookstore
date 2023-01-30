package io.jmix.bookstore.product;

import java.util.Objects;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;

/**
 * {@link Product} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class ProductAssert extends AbstractObjectAssert<ProductAssert, Product> {

  /**
   * Creates a new <code>{@link ProductAssert}</code> to make assertions on actual Product.
   * @param actual the Product we want to make assertions on.
   */
  public ProductAssert(Product actual) {
    super(actual, ProductAssert.class);
  }

  /**
   * An entry point for ProductAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myProduct)</code> and get specific assertion with code completion.
   * @param actual the Product we want to make assertions on.
   * @return a new <code>{@link ProductAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static ProductAssert assertThat(Product actual) {
    return new ProductAssert(actual);
  }

  /**
   * Verifies that the actual Product's active is equal to the given one.
   * @param active the given active to compare the actual Product's active to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's active is not equal to the given one.
   */
  public ProductAssert hasActive(Boolean active) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting active of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Boolean actualActive = actual.getActive();
    if (!Objects.deepEquals(actualActive, active)) {
      failWithMessage(assertjErrorMessage, actual, active, actualActive);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's category is equal to the given one.
   * @param category the given category to compare the actual Product's category to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's category is not equal to the given one.
   */
  public ProductAssert hasCategory(ProductCategory category) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting category of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    ProductCategory actualCategory = actual.getCategory();
    if (!Objects.deepEquals(actualCategory, category)) {
      failWithMessage(assertjErrorMessage, actual, category, actualCategory);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's createdBy is equal to the given one.
   * @param createdBy the given createdBy to compare the actual Product's createdBy to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's createdBy is not equal to the given one.
   */
  public ProductAssert hasCreatedBy(String createdBy) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting createdBy of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCreatedBy = actual.getCreatedBy();
    if (!Objects.deepEquals(actualCreatedBy, createdBy)) {
      failWithMessage(assertjErrorMessage, actual, createdBy, actualCreatedBy);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's createdDate is equal to the given one.
   * @param createdDate the given createdDate to compare the actual Product's createdDate to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's createdDate is not equal to the given one.
   */
  public ProductAssert hasCreatedDate(java.util.Date createdDate) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting createdDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.Date actualCreatedDate = actual.getCreatedDate();
    if (!Objects.deepEquals(actualCreatedDate, createdDate)) {
      failWithMessage(assertjErrorMessage, actual, createdDate, actualCreatedDate);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's deletedBy is equal to the given one.
   * @param deletedBy the given deletedBy to compare the actual Product's deletedBy to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's deletedBy is not equal to the given one.
   */
  public ProductAssert hasDeletedBy(String deletedBy) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting deletedBy of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualDeletedBy = actual.getDeletedBy();
    if (!Objects.deepEquals(actualDeletedBy, deletedBy)) {
      failWithMessage(assertjErrorMessage, actual, deletedBy, actualDeletedBy);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's deletedDate is equal to the given one.
   * @param deletedDate the given deletedDate to compare the actual Product's deletedDate to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's deletedDate is not equal to the given one.
   */
  public ProductAssert hasDeletedDate(java.util.Date deletedDate) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting deletedDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.Date actualDeletedDate = actual.getDeletedDate();
    if (!Objects.deepEquals(actualDeletedDate, deletedDate)) {
      failWithMessage(assertjErrorMessage, actual, deletedDate, actualDeletedDate);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's description is equal to the given one.
   * @param description the given description to compare the actual Product's description to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's description is not equal to the given one.
   */
  public ProductAssert hasDescription(String description) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting description of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualDescription = actual.getDescription();
    if (!Objects.deepEquals(actualDescription, description)) {
      failWithMessage(assertjErrorMessage, actual, description, actualDescription);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's id is equal to the given one.
   * @param id the given id to compare the actual Product's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's id is not equal to the given one.
   */
  public ProductAssert hasId(java.util.UUID id) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.UUID actualId = actual.getId();
    if (!Objects.deepEquals(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's lastModifiedBy is equal to the given one.
   * @param lastModifiedBy the given lastModifiedBy to compare the actual Product's lastModifiedBy to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's lastModifiedBy is not equal to the given one.
   */
  public ProductAssert hasLastModifiedBy(String lastModifiedBy) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting lastModifiedBy of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualLastModifiedBy = actual.getLastModifiedBy();
    if (!Objects.deepEquals(actualLastModifiedBy, lastModifiedBy)) {
      failWithMessage(assertjErrorMessage, actual, lastModifiedBy, actualLastModifiedBy);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's lastModifiedDate is equal to the given one.
   * @param lastModifiedDate the given lastModifiedDate to compare the actual Product's lastModifiedDate to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's lastModifiedDate is not equal to the given one.
   */
  public ProductAssert hasLastModifiedDate(java.util.Date lastModifiedDate) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting lastModifiedDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.Date actualLastModifiedDate = actual.getLastModifiedDate();
    if (!Objects.deepEquals(actualLastModifiedDate, lastModifiedDate)) {
      failWithMessage(assertjErrorMessage, actual, lastModifiedDate, actualLastModifiedDate);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's name is equal to the given one.
   * @param name the given name to compare the actual Product's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's name is not equal to the given one.
   */
  public ProductAssert hasName(String name) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualName = actual.getName();
    if (!Objects.deepEquals(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's orderLines contains the given io.jmix.bookstore.order.entity.OrderLine elements.
   * @param orderLines the given elements that should be contained in actual Product's orderLines.
   * @return this assertion object.
   * @throws AssertionError if the actual Product's orderLines does not contain all given io.jmix.bookstore.order.entity.OrderLine elements.
   */
  public ProductAssert hasOrderLines(io.jmix.bookstore.order.entity.OrderLine... orderLines) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // check that given io.jmix.bookstore.order.entity.OrderLine varargs is not null.
    if (orderLines == null) failWithMessage("Expecting orderLines parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getOrderLines(), orderLines);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's orderLines contains the given io.jmix.bookstore.order.entity.OrderLine elements in Collection.
   * @param orderLines the given elements that should be contained in actual Product's orderLines.
   * @return this assertion object.
   * @throws AssertionError if the actual Product's orderLines does not contain all given io.jmix.bookstore.order.entity.OrderLine elements.
   */
  public ProductAssert hasOrderLines(java.util.Collection<? extends io.jmix.bookstore.order.entity.OrderLine> orderLines) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // check that given io.jmix.bookstore.order.entity.OrderLine collection is not null.
    if (orderLines == null) {
      failWithMessage("Expecting orderLines parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getOrderLines(), orderLines.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's orderLines contains <b>only</b> the given io.jmix.bookstore.order.entity.OrderLine elements and nothing else in whatever order.
   * @param orderLines the given elements that should be contained in actual Product's orderLines.
   * @return this assertion object.
   * @throws AssertionError if the actual Product's orderLines does not contain all given io.jmix.bookstore.order.entity.OrderLine elements.
   */
  public ProductAssert hasOnlyOrderLines(io.jmix.bookstore.order.entity.OrderLine... orderLines) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // check that given io.jmix.bookstore.order.entity.OrderLine varargs is not null.
    if (orderLines == null) failWithMessage("Expecting orderLines parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getOrderLines(), orderLines);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's orderLines contains <b>only</b> the given io.jmix.bookstore.order.entity.OrderLine elements in Collection and nothing else in whatever order.
   * @param orderLines the given elements that should be contained in actual Product's orderLines.
   * @return this assertion object.
   * @throws AssertionError if the actual Product's orderLines does not contain all given io.jmix.bookstore.order.entity.OrderLine elements.
   */
  public ProductAssert hasOnlyOrderLines(java.util.Collection<? extends io.jmix.bookstore.order.entity.OrderLine> orderLines) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // check that given io.jmix.bookstore.order.entity.OrderLine collection is not null.
    if (orderLines == null) {
      failWithMessage("Expecting orderLines parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getOrderLines(), orderLines.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's orderLines does not contain the given io.jmix.bookstore.order.entity.OrderLine elements.
   *
   * @param orderLines the given elements that should not be in actual Product's orderLines.
   * @return this assertion object.
   * @throws AssertionError if the actual Product's orderLines contains any given io.jmix.bookstore.order.entity.OrderLine elements.
   */
  public ProductAssert doesNotHaveOrderLines(io.jmix.bookstore.order.entity.OrderLine... orderLines) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // check that given io.jmix.bookstore.order.entity.OrderLine varargs is not null.
    if (orderLines == null) failWithMessage("Expecting orderLines parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getOrderLines(), orderLines);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's orderLines does not contain the given io.jmix.bookstore.order.entity.OrderLine elements in Collection.
   *
   * @param orderLines the given elements that should not be in actual Product's orderLines.
   * @return this assertion object.
   * @throws AssertionError if the actual Product's orderLines contains any given io.jmix.bookstore.order.entity.OrderLine elements.
   */
  public ProductAssert doesNotHaveOrderLines(java.util.Collection<? extends io.jmix.bookstore.order.entity.OrderLine> orderLines) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // check that given io.jmix.bookstore.order.entity.OrderLine collection is not null.
    if (orderLines == null) {
      failWithMessage("Expecting orderLines parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getOrderLines(), orderLines.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product has no orderLines.
   * @return this assertion object.
   * @throws AssertionError if the actual Product's orderLines is not empty.
   */
  public ProductAssert hasNoOrderLines() {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have orderLines but had :\n  <%s>";

    // check
    if (actual.getOrderLines().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getOrderLines());
    }

    // return the current assertion for method chaining
    return this;
  }


  /**
   * Verifies that the actual Product's supplier is equal to the given one.
   * @param supplier the given supplier to compare the actual Product's supplier to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's supplier is not equal to the given one.
   */
  public ProductAssert hasSupplier(io.jmix.bookstore.product.supplier.Supplier supplier) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting supplier of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    io.jmix.bookstore.product.supplier.Supplier actualSupplier = actual.getSupplier();
    if (!Objects.deepEquals(actualSupplier, supplier)) {
      failWithMessage(assertjErrorMessage, actual, supplier, actualSupplier);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's tenant is equal to the given one.
   * @param tenant the given tenant to compare the actual Product's tenant to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's tenant is not equal to the given one.
   */
  public ProductAssert hasTenant(String tenant) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting tenant of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTenant = actual.getTenant();
    if (!Objects.deepEquals(actualTenant, tenant)) {
      failWithMessage(assertjErrorMessage, actual, tenant, actualTenant);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's unitPrice is equal to the given one.
   * @param unitPrice the given unitPrice to compare the actual Product's unitPrice to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's unitPrice is not equal to the given one.
   */
  public ProductAssert hasUnitPrice(io.jmix.bookstore.entity.Money unitPrice) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting unitPrice of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    io.jmix.bookstore.entity.Money actualUnitPrice = actual.getUnitPrice();
    if (!Objects.deepEquals(actualUnitPrice, unitPrice)) {
      failWithMessage(assertjErrorMessage, actual, unitPrice, actualUnitPrice);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's unitsInStock is equal to the given one.
   * @param unitsInStock the given unitsInStock to compare the actual Product's unitsInStock to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's unitsInStock is not equal to the given one.
   */
  public ProductAssert hasUnitsInStock(Integer unitsInStock) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting unitsInStock of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualUnitsInStock = actual.getUnitsInStock();
    if (!Objects.deepEquals(actualUnitsInStock, unitsInStock)) {
      failWithMessage(assertjErrorMessage, actual, unitsInStock, actualUnitsInStock);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's unitsOnOrder is equal to the given one.
   * @param unitsOnOrder the given unitsOnOrder to compare the actual Product's unitsOnOrder to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's unitsOnOrder is not equal to the given one.
   */
  public ProductAssert hasUnitsOnOrder(Integer unitsOnOrder) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting unitsOnOrder of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualUnitsOnOrder = actual.getUnitsOnOrder();
    if (!Objects.deepEquals(actualUnitsOnOrder, unitsOnOrder)) {
      failWithMessage(assertjErrorMessage, actual, unitsOnOrder, actualUnitsOnOrder);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Product's version is equal to the given one.
   * @param version the given version to compare the actual Product's version to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Product's version is not equal to the given one.
   */
  public ProductAssert hasVersion(Integer version) {
    // check that actual Product we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting version of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualVersion = actual.getVersion();
    if (!Objects.deepEquals(actualVersion, version)) {
      failWithMessage(assertjErrorMessage, actual, version, actualVersion);
    }

    // return the current assertion for method chaining
    return this;
  }

}
