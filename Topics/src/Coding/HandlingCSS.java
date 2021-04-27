package Coding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingCSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.computerhope.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement element=driver.findElement(By.xpath("//a[text()='How to copy a directory or folder']"));
        js.executeScript("arguments[0].scrollIntoView();",element);
        Thread.sleep(5000);
        System.out.println("before mouse hover element color:"+element.getCssValue("color"));
        System.out.println("before mouse hover element color:"+element.getCssValue("background-color"));
        Thread.sleep(5000);
        Actions action=new Actions(driver);
        action.moveToElement(element).build().perform();
        System.out.println("after mouse hover element color:"+element.getCssValue("color"));
        System.out.println("after mouse hover element color:"+element.getCssValue("background-color"));
        
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(WebElement e:links) {
        	if(!e().isEmpty())
        	System.out.println(e.getText());
        	 if(e.getAttribute("href").contains("Facebook")) {
        		 e.click();
        	 }
        	   
        
        	
        }
        
        driver.quit();
	}

}
 