package stepDefinations;

import amazonImplementations.Product;
import amazonImplementations.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {

    Product product;
    Search search;

    @Given("I have a search field on Amazon Page")
    public void i_have_a_search_field_on_amazon_page() {
        System.out.println("Step 1: I have a search field on Amazon Page");
    }

    @When("^I search a product with name \"([^\"]+)\" and price (\\d+)$")
    public void i_search_a_product_with_name_and_price(String productName, Integer price) {
        System.out.println("Step 2: I search a product with name : " + productName + " and price : " + price);

        //Calling constructor of product class
        product = new Product(productName, price);

    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step 3: I have a search field on Amazon Page: " + productName);

        // Searching the product in the Product list of Passing object of Product class in Search class
        search = new Search();

        //Search and display
        String name_Product = search.displayProduct(product);
        System.out.println("searched product is: " + name_Product);

        //Assertion
        Assert.assertEquals(product.getProductName(), name_Product);
    }

}
