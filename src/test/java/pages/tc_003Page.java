package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {

    WebDriver driver;

    By logoutButton = By.id("logoutButton");
    By loginPageIdentifier = By.id("loginPage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    public boolean isAtLoginPage() {
        return driver.findElement(loginPageIdentifier).isDisplayed();
    }
}