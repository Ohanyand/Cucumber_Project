package StepDefiniton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLogin {
    @Given("user is in login page")
    public void user_is_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("I am in login page");
    }
    @When("user enters a valid data")
    public void user_enters_a_valid_data() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("I entered a valid data");

    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("I clicked on login button");
    }
    @Then("user is navigated into home page")
    public void user_is_navigated_into_home_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("I navigated into home page");
    }

}
