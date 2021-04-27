package Coding;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("https://paytm.com/");
//        driver.findElement(By.cssSelector("[class=_3PqY]"));
        driver.findElement(By.cssSelector("[title='Buy FASTag']")).click();
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.attributeContains( driver.findElement(By.cssSelector("[title='Buy FASTag']")), "title", "FASTag"));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Metro']")));
//        wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//a[@title='Metro']"))));
//        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("[title='Paytm First']"))));
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("[title='Invest in Stocks']"))));
        
        Wait<WebDriver> Fluentwait = new FluentWait<WebDriver>(driver)
        	       .withTimeout(90, TimeUnit.SECONDS)
        	       .pollingEvery(5, TimeUnit.SECONDS)
        	       .ignoring(NoSuchElementException.class);
//
//        	   WebElement element= Fluentwait.until(new Function<WebDriver, WebElement>() {
//        	     public WebElement apply(WebDriver driver) {
//        	       return driver.findElement(By.cssSelector("[title='Invest in Stocks']"));
//        	     }
//        	   });
//        	   element.click();
//        	 
        driver.quit();
        
	}
}
