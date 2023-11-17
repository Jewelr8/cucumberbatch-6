package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"/Users/jewel/Desktop/UprightTechSolutions/IntelliJ_SeleniumProject/Maven/cucumberbatch-6/src/test/java/features/dropDown.feature"}, glue ={"stepDefinition"},
            plugin ={"pretty","json:target/cucumber-reports/Cucumber.json",
"junit:target/cucumber-reports/Cucumber.xml"},
//plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, // It will give you report here
monochrome = true,
publish = true
        )


/*
Cucumber option is on annotations.....it takes two parameters one is feature location another is step def location
if you have 100 features file is package ...give path only up-to package level. Like src/test/java/features/
or if you want to run a specific feature file give src/test/java/feature/Login.feature
 */

public class RunnerClass {



}