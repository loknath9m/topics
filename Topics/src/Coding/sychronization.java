package Coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sychronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
        driver.get("https://www.shutterfly.com/?CID=SEGOO.BRAND.387_322611_7935750_4958782&gclid=Cj0KCQjw0oCDBhCPARIsAII3C_GxV1Vsg4YcQjbf9BiMfQiH9DiDy4F30BqkAI8fbyZRmn7OSugQMWQaAobSEALw_wcB");
        driver.findElement(By.xpath("//img[@alt='Close']")).click();
        driver.findElement(By.xpath("//a[@title='Go to the Tinyprints home page.']")).click();
        WebDriverWait wait=new WebDriverWait(driver,90);
//        wait.until(ExpectedConditions.attributeContains(By.xpath("//a[@title='Go to the Tinyprints home page.']")), null, null))
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//a[@title='Go to the Tinyprints home page.']")), "title", "Tinyprints "));
//        wait.until(ExpectedConditions.attributeToBe(By.xpath("//a[@title='Go to the Tinyprints home page.']"), "title", "Go to the Tinyprints home page"));
//        wait.until(ExpectedConditions.attributeToBe(driver.findElement(By.xpath("//a[@title='Go to the Tinyprints home page.']")), "title", "Go to the Tinyprints home page"));
//        wait.until(ExpectedConditions.attributeToBeNotEmpty(driver.findElement(By.xpath("//a[@title='Go to the Tinyprints home page.']")), "title"));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Go to the Tinyprints home page.']")));
//        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//a[@title='Go to the Tinyprints home page.']"))));
        driver.quit();
        
	}

}
