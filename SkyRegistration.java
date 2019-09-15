package cucumber.features;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkyRegistration {
	
	WebDriver driver = null;
	@Given("^Luanch the Sky Page$")
	public void luanch_the_Sky_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skyid.sky.com/signup/skycom");   
	}

	@Given("^Enter the Registration details$")
	public void enter_the_Registration_details(DataTable arg1) throws Throwable {
	  
		List<List<String>> data = arg1.raw();
		WebElement titleDropDown = driver.findElement(By.xpath("//*[@id='title']"));
		Select titledd = new Select(titleDropDown);
		titledd.selectByValue("Mr");
		// Find Element Firstname and enter detils
		driver.findElement(By.xpath(".//input[@id='firstname']")).sendKeys(data.get(1).get(1));
		// Find Element Lastname and enter detils
		driver.findElement(By.xpath(".//input[@name='lastname']")).sendKeys(data.get(2).get(1));
		// Find Element Email address and enter detils
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys(data.get(3).get(1));
		// Find Element Confirm email address and enter detils
		driver.findElement(By.xpath(".//input[@id='confirmEmail']")).sendKeys(data.get(4).get(1));
		// Find Element password address and enter detils
		driver.findElement(By.xpath(".//input[@id='password']")).sendKeys(data.get(5).get(1));
		// Find Element Confirm password address and enter detils
		driver.findElement(By.xpath(".//input[@id='confirmPassword']")).sendKeys(data.get(6).get(1));
		// Find Element First checkbox and enter detils
		driver.findElement(By.xpath(".//input[@name='termsAndConditions']")).click();
		// Find Element Second Checkbox and select
		driver.findElement(By.xpath(".//input[@name='marketingOptOut']")).click();
		// Find Element Second Checkbox and enter detils
		
	    
	}

	@When("^Click on Cancel link New Page is launched$")
	public void click_on_Cancel_link_New_Page_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.className("cancelLink")).click();
		String hp = driver.getTitle();
	    
	}

	@Then("^Verify the new page as any element$")
	public void verify_the_new_page_as_any_element() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String hp = driver.getTitle();
		String hpc = "Sky TV, Broadband & Mobile | News, Sports & Movies | Sky.com";
		WebDriverWait wait = new WebDriverWait (driver, 20);
		//wait.until(ExpectedConditions.ci)
	//	WebDriver wait = new WebDriverwait(driver,20);
		
		assertEquals(hp,hpc);
	}

	@Then("^Quit the browser$")
	public void quit_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	    
	}



}
