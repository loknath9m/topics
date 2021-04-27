package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTestExe {
  @Test
  public void f() {
	  System.out.println("Program running");
  }
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("Program written");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("Program successful");
//  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.out.println("started");
	  System.setProperty("webdriver.chrome.driver", "C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\sample/elements.html");
		
		WebElement element=driver.findElement(By.id("job"));
		Select dropdown=new Select(element);
		System.out.println("singal dropdown:"+dropdown.isMultiple());
		dropdown.selectByVisibleText("Androild Developer");
		Thread.sleep(5000);
		dropdown.selectByValue("mobile_designer");
//		Thread.sleep(5000);
		
		dropdown.selectByIndex(5);
		List<WebElement> options=dropdown.getOptions();
		System.out.println("total options in dropdown:"+options.size());
		for(WebElement e:options) {
			System.out.println(e.getText());
//			driver.quit();
		}
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Program successfully ended");
//	  driver.quit();
  }
//  	driver.quit();
}
