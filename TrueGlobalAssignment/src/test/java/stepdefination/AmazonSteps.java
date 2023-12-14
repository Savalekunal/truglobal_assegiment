package stepdefination;

import io.cucumber.java.en.*;

public class AmazonSteps {

    @Given("User is on the Amazon.in homepage")
    public void userIsOnAmazonHomepage() {
        // Implementation for navigating to the homepage
    }

    @When("User registers on Amazon with valid details")
    public void userRegistersOnAmazon() {
        // Implementation for user registration
    }

    @And("User searches for {string}")
    public void userSearchesForProduct(String searchProduct) {
        // Implementation for searching the product
    }

    @And("User selects the first {string} from the list")
    public void userSelectsProductFromList(String product) {
        // Implementation for selecting a product from the list
    }

    @And("User goes to the product details page")
    public void userGoesToProductDetailsPage() {
        // Implementation for navigating to the product details page
    }

    @And("User selects and stores the price in a variable")
    public void userStoresPriceInVariable() {
        // Implementation for storing the product price in a variable
    }

    @And("User adds the {string} to the cart")
    public void userAddsProductToCart(String product) {
        // Implementation for adding the product to the cart
    }

    @Then("User verifies the {string} is added to the cart successfully")
    public void userVerifiesProductAddedToCart(String product) {
        // Implementation for verifying the product is added to the cart successfully
    }
}
