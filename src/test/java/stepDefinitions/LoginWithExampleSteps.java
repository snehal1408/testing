package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithExampleSteps {
    private WebDriver driver;
    @Given("user is on Home page")
    public void userIsOnHomePage() {
        System.out.println("user is on Home page");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
    }

    @When("User navigate to login page")
    public void userNavigateToLoginPage() {
        System.out.println("User navigate to login page.....");
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        System.out.println("user name is: "+ username+" & password is: "+password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("Message displayed login successfully")
    public void messageDisplayedLoginSuccessfully() throws InterruptedException {
        System.out.println("login successfully");
        Thread.sleep(2000);
        driver.close();
    }
}
