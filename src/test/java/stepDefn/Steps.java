package stepDefn;


    import static org.testng.AssertJUnit.assertEquals;
	import org.openqa.selenium.By;

// TOPIC : Step Definition

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.*;

public class Steps {
	
	
	WebDriver driver;
	@Given("^Open Chrome Browser$")
	public void openBrowser() throws Throwable
	{
		driver = new ChromeDriver();
	}
	
	 @When("^Enter the Application URL$")
	 public void Application() throws Throwable
	 {
		 driver.get("https://demo.guru99.com/V1/index.php");
	 }
	
	 @Then("^Enter the UserId \"([^\"]*)\"$")
		public void enterUserId(String userId) throws Throwable
		{
			driver.findElement(By.name("uid")).sendKeys(userId);
		}
		
		@When("^Enter the Password \"([^\"]*)\"$")
		public void enterPassword(String pwd) throws Throwable
		{
			driver.findElement(By.name("password")).sendKeys(pwd);
		}
		
		@And("^Click LogIn button$")
		public void clickLogIn() throws Throwable
		{
			driver.findElement(By.name("btnLogin")).click();
		}
		
		
		@And("^Verify that User in LogIn Page$")
		public void verifyUserInLogInPage() throws Throwable
		{
			Assert.assertEquals("https://demo.guru99.com/V1/html/Managerhomepage.php", driver.getCurrentUrl()); // Checking URL
			Assert.assertEquals("GTPL Bank Manager HomePage",driver.getTitle().trim());	// Checking title  , Trim - Remove the empty spaces in front and back 
		}
		
		@And("^Verify that User not in LogIn Page$")
		public void verifyUserNotInLogInPage() throws Throwable
		{
			Assert.assertEquals("User is not valid", driver.switchTo().alert().getText());
			
		}
		

}
