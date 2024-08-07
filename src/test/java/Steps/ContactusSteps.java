package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ContactusSteps {
	
	WebDriver driver;
	
	
	@Given("Open the browser, enter the sparsh hospital url")
	public void open_the_browser_enter_the_sparsh_hospital_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sparshhospital.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@Given("click the contactus button")
	public void click_the_contactus_button() {
		driver.findElement(By.linkText("Contact Us")).click();	
		
	   
	}

	@When("user enters firstname lastname phno email textbox")
	public void user_enters_firstname_lastname_phno_email_textbox() {
		driver.findElement(By.id("contact_first_name")).sendKeys("shubhama");
		driver.findElement(By.id("contact_last_name")).sendKeys("gaikwad");
		driver.findElement(By.id("contact_phone")).sendKeys("9373723529");
		driver.findElement(By.id("contact_email")).sendKeys("shubha@gmail.com");
	   
	}

	@When("select yashwantpur hospital from hospital dropdown")
	public void select_yashwantpur_hospital_from_hospital_dropdown() {
		WebElement hos = driver.findElement(By.id("contact_hospital"));
		Select da = new Select(hos);
		da.selectByVisibleText("SPARSH Hospital, Yeswanthpur");
		

		WebElement enqtype = driver.findElement(By.id("contact_enquiry_type"));
		Select enq = new Select(enqtype);
		enq.selectByVisibleText("Suggestion");
		
	   
	}

	@When("write a message and click on send button")
	public void write_a_message_and_click_on_send_button() {
		driver.findElement(By.id("contact_message")).sendKeys("hello my name is shubham");
		
		driver.findElement(By.id("contact_submit")).click();
	  
	}

	@Then("thank you meassage should be displayed")
	public void thank_you_meassage_should_be_displayed() {
		
		
	   
	}

	@Then("bank info should available in the page")
	public void bank_info_should_available_in_the_page() {
		
	  
	}


}
