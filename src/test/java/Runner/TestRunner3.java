package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features="src/test/resources/Features/TC03-Accounting_and_Charge_collection.feature"
		,glue= {"StepDefinition"}
		,monochrome=true
		,dryRun=false
	//	,tags="@TC_03_02_NegativePayment1Scenario"
		,plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)
public class TestRunner3 {

}
