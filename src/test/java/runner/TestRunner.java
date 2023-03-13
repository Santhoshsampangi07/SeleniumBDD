package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= ".\\src\\test\\resources\\Feature",glue = {"stepDefn"})
public class TestRunner extends AbstractTestNGCucumberTests {
	

}     
