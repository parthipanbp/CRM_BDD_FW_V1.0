package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver","F:/Git_repo/CRM_BDD_FW_V1.0/FreeCrmBddFramework/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	}

	@Then("^I should login into the application$")
	public void I_should_login_into_the_application() {
		WebElement LoginBtn = driver.findElement(By.xpath("//*[contains(text(),'Log In')]"));
		System.out.print("Login button is : " + LoginBtn.isDisplayed());
		LoginBtn.click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("parthipanbp@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Parthi@24");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}

	@And("^close the applciation$")
	public void close_the_applciation() {
		driver.close();
	}
}
