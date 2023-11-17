package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoverOver {
    // With the help of Action Class we can do right click, double click, drag and drop. Also with the help of this class we can perform some keyboard handling/functionalities.
    // Like Ctrl C, Ctrl V, press on Shift,
    WebDriver driver;
//
//    @Given("browser is open and navigate to the Base URL")
//    public void browser_is_open_and_navigate_to_the_base_url() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.amazon.com"); // Navigating to the Base URl
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//    }


    @When("user hover the mouse over the option")
    public void user_hover_the_mouse_over_the_option() {
        WebElement hoverPathForAmazon = driver.findElement(By.xpath("//span[@id ='nav-link-accountList-nav-line-1']"));
        new Actions(driver).moveToElement(hoverPathForAmazon).build().perform();
    }

    @Then("user can select option one using Actions class")
    public void user_can_select_option_one_using_Actions_class() throws InterruptedException {
        WebElement ordersPath = driver.findElement(By.xpath("//span[text()='Orders']"));
        ordersPath.click();

        // Executing double and right click----
        WebElement emailPath = driver.findElement(By.xpath("//input [@name = 'email']"));
        ordersPath.click();

            // Right click on email field----
            new Actions(driver).contextClick(emailPath).build().perform();
        Thread.sleep(3000);
            new Actions(driver).sendKeys("Jewel").build().perform();
            // Double click on continue-----
            WebElement continuePath = driver.findElement(By.xpath("//input [@id ='continue']"));
        Thread.sleep(3000);
            new Actions(driver).doubleClick(continuePath).build().perform();



    }


        @Then("user can select option two using Actions class")
        public void user_can_select_option_two_using_Actions_class () {





    }
}