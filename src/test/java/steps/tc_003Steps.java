package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_003Page;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {

    WebDriver driver;
    tc_003Page logoutPage;

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        driver = new ChromeDriver();
        logoutPage = new tc_003Page(driver);
        // Assume user login steps are performed here
        driver.get("http://application-url.com/dashboard");
    }

    @When("the user clicks on the logout button")
    public void the_user_clicks_on_the_logout_button() {
        logoutPage.clickLogoutButton();
    }

    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        assertTrue(logoutPage.isAtLoginPage());
        driver.quit();
    }
}