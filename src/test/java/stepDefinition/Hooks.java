package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;

import java.io.IOException;

public class Hooks {

    @Before
    public void appInit () throws IOException, InterruptedException {
        BaseClass.setDriver();
        Thread.sleep(3000);
    }
    @After
public void tearDown(){
        //BaseClass.getDriver().quit();
}


}
