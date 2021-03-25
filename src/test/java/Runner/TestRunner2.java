package Runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features="src/test/resources/Features/TC02-Validating_Inward_Clearing_message_Neg.feature"
		,glue= {"StepDefinition"}
		,monochrome=true
		,dryRun=false
//		,tags="@TC_01_01_ImportMessage"
		,plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)
public class TestRunner2 {

}
