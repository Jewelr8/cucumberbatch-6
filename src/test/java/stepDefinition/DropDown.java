package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pageObjects.DropDownPage;
import utilities.BaseClass;

import java.sql.Driver;
import java.util.List;

public class DropDown {
    Select dropDown;

    DropDownPage dropDownPage;
    WebDriver driver;

//    @Given("browser is open and navigate to the Base URL")
//    public void browser_is_open_and_navigate_to_the_base_url() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://uprightforum.tech");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//
//    }


    @Given("user navigate to the Practice page")
    public void user_navigate_to_the_Practice_page() {
        dropDownPage = new DropDownPage(BaseClass.getDriver());
        dropDownPage.clickOnPractice();

    }



//    @Given("user navigate to Practice page")
//    public void user_navigate_to_Practice_page(){
//        WebElement practiceLink = driver.findElement(By.xpath("//a[text() = 'Practice']"));
//        practiceLink.click();
//    }



    @When("user click on the dropdown icon")
    public void user_click_on_the_dropdown_icon() {
        dropDownPage.clickOnSelectOption();
    }



    @Then("user can select option one")
    public void user_can_select_option_one() {
     dropDownPage.clickOnOptionOne();

        }


    @Then("user can select option two")
    public void user_can_select_option_two() {
    dropDownPage.clickOnOptionTwo();

    }


    @Then("user can select option three")
    public void user_can_select_option_three() {
        dropDownPage.clickOnOptionThree();

    }




}
