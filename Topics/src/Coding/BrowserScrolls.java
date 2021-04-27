package Coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserScrolls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(700,955)");
//        Thread.sleep(5000);
//        js.executeScript("window.scrollBy(700,-955)");
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//        Thread.sleep(2000);
//        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        WebElement ide=driver.findElement(By.className("ide-header"));
        WebElement news=driver.findElement(By.className("news-header"));
        WebElement more=driver.findElement(By.cssSelector(".button.green"));
        js.executeScript("arguments[0].scrollIntoView();",ide);
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView();",news);
        js.executeScript("arguments[0].click()",more);
        js.executeScript("document.getElementById('gs_tti52').value='loknathressy';");

	}

}
