package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStepDefinition {
	WebDriver driver = null;
	
	@Given("^launch the facebook$")
	public void launch_the_facebook() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	/*@When("^Enter the username without password and click Login$")
	public void enter_the_username_without_password_and_click_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#email")).sendKeys("aumesh@gmail.com");
		driver.findElement(By.cssSelector("input#u_0_a")).click();
		
	}*/
	
	@When("^Enter the username \"([^\"]*)\" without password and click Login$")
	public void enter_the_username_without_password_and_click_Login(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#email")).sendKeys(arg1);
		driver.findElement(By.cssSelector("input#u_0_a")).click();
	}

	@Then("^Validate the new page and quit the browser$")
	public void validate_the_new_page_and_quit_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Boolean bb = driver.findElement(By.cssSelector("input#pass")).isDisplayed();
		System.out.println("The element isdisplayed :"+bb);
		// size
		int ii = driver.findElements(By.cssSelector("input#pass")).size();
		System.out.println("The element SIZE IS :"+ii);
		// is Visible
		bb = driver.findElement(By.cssSelector("input#pass")).isEnabled();
		System.out.println("The element is Enabled :"+bb);
		//assertEqual()
		driver.quit();
	}

}
