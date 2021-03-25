package StepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.fcibdemo.qa.base.TestBase;
import com.fcibdemo.qa.pages.HomePage;
import com.fcibdemo.qa.pages.LoginPage;
import com.fcibdemo.qa.util.Windowhandle;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;


public class Hooks extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	Windowhandle win;

	
	  @Before public void startBrowser(Scenario scenario) 
	  {
		  Initialization();
		  win=new Windowhandle(driver); loginPage = new LoginPage();
		  homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	  }
	 

	@After
	public void quitBrowser() {

		driver.quit();
	}

	@AfterStep() 	
	public void afterSite(Scenario scenario) { 
		
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}


}
