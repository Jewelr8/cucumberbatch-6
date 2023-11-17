package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class AlertPage {
    /*
    All pageObject class should have the following ---
    i.Constructor
    ii.Page Elements
    iii. Methods according to actions

     */

    public AlertPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@class = 'onclick']")
    WebElement tryItPath;

    public void clickOnTryIt (){
    tryItPath.click();
}

public void validateAlertBox (){

    String alertText =  BaseClass.getDriver().switchTo().alert().getText();
    if (alertText.contains("knowledge"))
        System.out.println("alert box is present");
    else
        System.out.println("alert box is Not present");

}

public void acceptAlert() throws InterruptedException {

    Thread.sleep(3000);
    BaseClass.getDriver().switchTo().alert().accept();
}


}
