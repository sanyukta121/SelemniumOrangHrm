package StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LogInSteps {
    @Given("User navigating to login page")
    public void userNavigatingToLoginPage() {
        // Write code here that turns the phrase above into concrete actions

        //throw new PendingException();
    }

    @When("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("click on the login button")
    public void clickOnTheLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("user directed to the dashboard")
    public void userDirectedToTheDashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
