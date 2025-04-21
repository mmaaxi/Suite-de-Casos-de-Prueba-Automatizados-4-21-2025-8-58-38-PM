package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page loginPage;

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        driver = new ChromeDriver();
        driver.get("https://www.example.com/login");
        loginPage = new tc_002Page(driver);
    }

    @When("el usuario ingresa credenciales incorrectas")
    public void el_usuario_ingresa_credenciales_incorrectas() {
        loginPage.enterUsername("nombre_incorrecto");
        loginPage.enterPassword("contraseña_incorrecta");
        loginPage.clickLoginButton();
    }

    @Then("se muestra un mensaje de error de inicio de sesión")
    public void se_muestra_un_mensaje_de_error_de_inicio_de_sesión() {
        Assert.assertTrue("El mensaje de error no se mostró", loginPage.isErrorMessageDisplayed());
        driver.quit();
    }
}