package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Login {

    WebDriver driver;

   @Given("user navigate to the Login page")

    public void user_navigate_to_the_Login_page() throws InterruptedException {
        WebElement loginLinkPath = driver.findElement(By.xpath("//io[@class='fas fa-user']"));
        loginLinkPath.click();
    }
//
//    @When("user navigate to the Login page")
//    public void user_navigate_to_the_Login_page() {
//        Select dropDown = new Select(driver.findElement(By.xpath("i[@class = 'fas fa-user'")));
//        dropDown.selectByVisibleText("Select an option");
//    }

    @When("user enter valid {string}")
    public void user_enter_valid_username(String username) {
        WebElement userNamePath = driver.findElement(By.xpath("//input[@id='username-44'"));
        userNamePath.sendKeys(username);
    }

    @When("user enter a valid {string}")
    public void user_enter_valid_password(String password) {

        WebElement passwordPath = driver.findElement(By.xpath("//input[@id = 'user_password-44'"));
        passwordPath.sendKeys(password);
    }

    @When("user click on Login button")
    public void user_click_on_Login_button() {
        WebElement loginButtonPath = driver.findElement(By.xpath("//input[@id ='um-submit-btn'"));
        loginButtonPath.click();

    }

    @Then("Validate that user is navigated to the Home page")
    public void Validate_that_user_is_navigated_to_the_Home_page() {
        WebElement image = driver.findElement(By.xpath("//img[contains(@class, 'gravatar avatar avatar-96')]"));
        image.click();

        WebElement myAccountPath = driver.findElement(By.xpath("//a[text() = 'My Account]"));
        myAccountPath.click();


        List<WebElement> names = driver.findElements(By.xpath("//div[(@class = 'um-account-name')/a']"));
        String myName = names.get(0).getText();


        if (myName.equalsIgnoreCase("Upright Tech")){
            System.out.println("I logged in");
        }

        else {
            System.out.println("Having login issue");
        }


    }
}