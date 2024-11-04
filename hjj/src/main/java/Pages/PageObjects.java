package Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class PageObjects {
	
	WebDriver driver;
	public PageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	//By input_serachbox=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	//By Searchicon=By.xpath("//*[@id=\"nav-search-submit-button\"]");
	//By txt_searchvalidate=By.xpath("//*[contains(text(),\"Results\")]");
	//By SelectOptions=By.xpath("//*[@id=\"searchDropdownBox\"]");
	By column=By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td");
	By row=By.xpath("//*[@id=\"countries\"]/tbody/tr");
	
	
	public void datatable()
	{
		List<WebElement> rown=driver.findElements(row);
		int rowsize= rown.size();
		List<WebElement> columnn=driver.findElements(column);
		int colsize=columnn.size();
		for (int i=1;i<rowsize;i++)
		{
			for(int j=1;j<colsize;j++)
			{
				String col=
				driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				Map<String,String> Country=new HashMap<String, String>();

				
				
				
				
				
				
				
				
				
				
				
				Country.put("Country", col);
				System.out.println(Country.entrySet());
				
			}
		}
		
		
	}

	
	public void EnterSearchCriteria(String Searchoption) throws InterruptedException
	{
		//Alert alert=driver.switchTo().alert();
		//alert.dismiss();
		
		//Thread.sleep(2000);
		
		//Select s=new Select(driver.findElement(SelectOptions));
		//s.selectByVisibleText("Girls' Fashion");
		//Thread.sleep(2000);
		
		//driver.findElement(input_serachbox).sendKeys(Searchoption);
		//driver.findElement(Searchicon).click();
	}


	
}

