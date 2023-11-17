package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.sql.SQLOutput;
import java.util.Set;

public class WindowPage {
    String firstWindowID;
    public WindowPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }



    WebElement OpenWindowPath;
@FindBy(xpath = "//a[text()= [@id = 'Access all our courses']")
WebElement allCourses;

    @FindBy(xpath = "//h1[text() = 'Practice Page']")
            WebElement practicePage;
    @FindBy(xpath = "//span[text() = 'info@gaclickacademy.com']")
    WebElement email;

    @FindBy(xpath = "//input[@id = 'name']")
    WebElement input;




public void clickOnWindow(){
    OpenWindowPath.click();
}



public void switchingToNewWindow() throws InterruptedException {
  firstWindowID = BaseClass.getDriver().getWindowHandle();
    System.out.println(firstWindowID);
    Set<String> multiplesIDs = BaseClass.getDriver().getWindowHandles();
    System.out.println(multiplesIDs.size());



    for (String m:multiplesIDs){
        if (!m.equalsIgnoreCase(firstWindowID)){
            BaseClass.getDriver().switchTo().window(m  );
        }

    }


    Thread.sleep(3000);

   String myText = email.getText();
    System.out.println(myText);
    BaseClass.getDriver().close();
}


public void switchingToFirstWindow (){
BaseClass.getDriver().switchTo().window(firstWindowID);
input.sendKeys("Jewel");
BaseClass.getDriver().close();
}







}
