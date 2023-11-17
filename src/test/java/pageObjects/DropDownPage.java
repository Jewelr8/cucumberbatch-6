package pageObjects;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPage {
Select obj;

    public DropDownPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "https://uprightforum.tech/practice/")
    WebElement practiceLinkPath;

@FindBy(xpath = "//select[@class='form-control'])")
    WebElement SelectPath;


public void clickOnPractice(){
    practiceLinkPath.click();

}






    public void clickOnSelectOption (){

        obj = new Select(SelectPath);
        List<WebElement>myOptions = obj.getOptions();
        int size = myOptions.size();

        for (int i = 0;i <size; i++){

            String myText = myOptions.get(i).getText();
            System.out.println(myText);
        }

        obj.selectByVisibleText("Select an option");

    }


    public void clickOnOptionOne(){
        obj.selectByIndex(0);
    }

    public void clickOnOptionTwo(){
        obj.selectByIndex(1);
    }

    public void clickOnOptionThree(){
        obj.selectByIndex(2);
    }



}