package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class sampleW {
  @Test
  public void f() {
	  System.out.println("my class opened");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("my class stared");
	  System.setProperty("webdriver.chrome.driver", "C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/?rs=3&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjE1ODE3NTE0LCJjYWxsc2l0ZV9pZCI6NzMxOTQxNDIwNzMyOTEwfQ%3D%3D");
	    System.out.println("facebook opened");

		
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ended");
  }
  

}
