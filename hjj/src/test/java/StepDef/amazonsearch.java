package StepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.PageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testdata.data;

public class amazonsearch {
     WebDriver driver;
	PageObjects p=new PageObjects(driver);
	@Given("Launch Amazon website")
	public void launch_amazon_website() {
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
	    
	}

	@When("Enter the product to Search from sheetname\"data\" and rownumber0")
	public void enter_the_product_to_search_from_sheetname_data_and_rownumber0() {

	}

	@Then("Validate Search Result")
	public void validate_search_result() {
	    
	}



}
