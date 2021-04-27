package Coding;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingnewTabsorWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.findElement(By.xpath("//button[text()='OK']")).click();
        String  parentwindow=driver.getWindowHandle();
        System.out.println("fiest open window;"+parentwindow);		
        
        WebElement MenuBUSES=driver.findElement(By.xpath("//a[contains(@aria-label,'Menu BUSES')]"));
        MenuBUSES.click();
        
        Set<String> handles=driver.getWindowHandles();
       
        System.out.println("both windows:"+handles);
        for(String main:handles) {
        	if(!main.equalsIgnoreCase(parentwindow)) {
        		driver.switchTo().window(main);
        		
        		 driver.findElement(By.cssSelector("[id='departFrom']")).sendKeys("Anantapur");
        		 Thread.sleep(5000);
        		 driver.close();
        	}
        }
        
        driver.switchTo().window(parentwindow);
        
//        driver.findElement(By.cssSelector("[aria-label='Enter From station. Input is Mandatory.']")).sendKeys("goa");
        driver.quit();

	}

}
