package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page loginPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage = new tc_001Page(driver);
        loginPage.navigateToLoginPage();
    }

    @When("the user enters correct username and password")
    public void the_user_enters_correct_username_and_password() {
        loginPage.enterUsername("validUsername");
        loginPage.enterPassword("validPassword");
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        loginPage.verifyUserIsOnHomePage();
    }
}