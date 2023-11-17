package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    private static WebDriver driver;

    public  BaseClass() throws InterruptedException, IOException {

        // code below will only establish the connection to the external file.
        FileInputStream fis = new FileInputStream("/Users/jewel/Desktop/UprightTechSolutions/IntelliJ_SeleniumProject/Maven/cucumberbatch-6/src/test/java/env.properties");

        Properties prop = new Properties(); // then this code will read the file
        prop.load(fis);

        String myURl = prop.getProperty("url"); // getting information from the external file(env. properties)
        System.out.println(myURl);

        String myBrowser = prop.getProperty("browser"); // getting information from the external file(env. properties)
        System.out.println(myBrowser);

        if (myBrowser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if (myBrowser.equalsIgnoreCase("firefox")
        ) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else {
            System.out.println("Check the driver");
        }

        driver.get(myURl); // navigate to the base URl
        driver.manage().window().maximize(); // maximize the window
        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

    }



    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver() throws InterruptedException, IOException {
        BaseClass obj = new BaseClass();

    }





}
