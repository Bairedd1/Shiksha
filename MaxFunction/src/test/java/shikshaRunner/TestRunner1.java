package shikshaRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner1 {
	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\BBAIREDD\\Desktop\\Shiksha\\MaxFunction\\src\\test\\resource\\Feature\\MaxFunction().feature",
	glue="shikshaStep",
	tags="@RatingFeedback",
	plugin= {"pretty", 
			"html:target/HTMLReports/ShikshaReport.html",	
			"json:target/JSONReports/ShikshaReport.json",
			"junit:target/JUNITReports/ShikshaReport.xml",
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	})
	public class TestRunner extends AbstractTestNGCucumberTests{
	}

}
