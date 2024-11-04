package StepDef;


import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.input.NullReader;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.PageObjects;
import Sear.searchimplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testdata.data;

public class Search {



	searchimplementation s=new searchimplementation();
	WebDriver driver;
	

	@Given("Enter Search Criteria sheetname {string} and rownumber {int}")
	public void enter_search_criteria_sheetname_and_rownumber(String Sheetname, Integer rownumber)  throws IOException, Exception  {
	    // Write code here that turns the phrase above into concrete actions
		data d=new data();
		List<Map<String,String>> testdata=d.getData("C:\\Users\\Amith\\Desktop\\testdata.xlsx", Sheetname);
		String str=testdata.get(rownumber).get("searchoption");
		System.out.println(str);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amith\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		PageObjects p=new PageObjects(driver);
		p.datatable();
		p.EnterSearchCriteria(str);
		//p.AmazonSearchValidation();
		
		
	    //s.Enter();
	}

	@When("Verify Title page")
	public void verify_title_page() {
	  //s.EnterSearch();
	}

	@Then("Validate Title Page")
	public void validate_title_page() {
	   // s.Enter();
	}



}
