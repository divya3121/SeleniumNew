package hjj;


import java.io.FileInputStream;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.*;

public class test {
	public static void main(String[] args) throws IOException {
		System.out.println("Launching browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amith\\Desktop\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://demoqa.com/browser-windows");
    	
    	
    	
    	driver.manage().window().maximize();
    	System.out.println(driver.getTitle());
     	JavascriptExecutor js = (JavascriptExecutor) driver;
   	    js.executeScript("window.scrollBy(0,250)","");
   	    
   	    driver.findElement(By.xpath("//*[text()=\"Elements\"]")).click();
   	    
   	    driver.findElement(By.xpath("//*[text()=\"Web Tables\"]")).click();
   	    List<WebElement> rowcount=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div"));
   	    int rowcountsize=rowcount.size();
   	    System.out.println(rowcountsize); 
   	    List <WebElement> columncount=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div"));
   	    System.out.println(columncount.size());
   	    
	}

}
