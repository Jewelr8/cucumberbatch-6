package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.WindowPage;
import utilities.BaseClass;

public class WindowHandling {

    WindowPage windowPage; /// Need to know teh functionality


//   @Given("browser is open and navigate to the URL")
//
//    public void browser_is_open_and_navigate_to_the_URL() throws InterruptedException {
//
//    }

    @When("User click on the open window")
    public void user_click_on_the_open_window() {
        windowPage = new WindowPage(BaseClass.getDriver()); /// Need to know
        windowPage.clickOnWindow();
    }

    @Then("Validate that user can switch to the second window")
    public void validate_that_user_can_switch_to_the_second_window() throws InterruptedException {
     windowPage.switchingToNewWindow();
    }

    @Then("Validate that user can switch to the first window")
    public void validate_that_user_can_switch_to_the_first_window() {
    windowPage.switchingToFirstWindow ();
    }


}
