package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.AlertPage;
import utilities.BaseClass;

import java.util.List;

import static utilities.BaseClass.getDriver;

public class Alert {
    AlertPage alertPage;

    /*driver.switchto().alert().accept();
    driver.switchto().alert().dismiss();
    driver.switchto().alert().getText();
     */

    @Given("browser is open and navigate to the Base URL")
    public void browser_is_open_and_navigate_to_the_base_url() {

    }
    @When("user click on Try it")
    public void user_click_on_Try_it() {
     alertPage = new AlertPage(BaseClass.getDriver());
     alertPage.clickOnTryIt();
    }

    @Then("Alert box is present")
    public void Alert_box_is_present() throws InterruptedException {
       Thread.sleep(3000);
        alertPage.validateAlertBox();
    }

    @Then("user should be able to click on OK")
    public void  user_should_be_able_to_click_on_OK() throws InterruptedException {
alertPage.acceptAlert();
    }


//    @When("user navigate inside the iframe")
//    public void user_navigate_inside_the_iframe() {
//    WebElement findIframePath = driver.findElement(By.xpath("//iframe[@src ='https://uprightforum.tech']"));
//    driver.switchTo().frame(findIframePath);
//    }
//
//    @Then("user should be able to click on practice page")
//    public void user_should_be_able_to_click_on_practice_page() {
//        WebElement practiceLink = driver.findElement(By.xpath("//a[text() ='Practice']"));
//        practiceLink.click();
//    }
//
//    @Then("user can click on alert inside the iframe")
//    public void user_can_click_on_alert_inside_the_iframe() {
//
//
//
//    }




}