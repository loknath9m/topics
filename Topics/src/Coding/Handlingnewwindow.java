package Coding;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingnewwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://economictimes.indiatimes.com/markets/ipos/fpos/laxmi-organics-ipo-heres-how-to-check-share-allotment/articleshow/81624145.cms?from=mdr");
        driver.findElement(By.xpath("//a[text()='web portal']")).click();
        String Parentwindow=driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();
        
        System.out.println("both windows:"+handles);
        for(String main:handles) {
        	if(!main.equalsIgnoreCase(Parentwindow)) {
        		driver.switchTo().window(main);
        
        WebElement element=driver.findElement(By.xpath("//select[@id='ddlClient']"));
//        Thread.sleep(5000);
        Select dropdown=new Select(element);
//        Thread.sleep(5000);
        dropdown.selectByVisibleText("Sigma Solve Limited - IPO");
//        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Enter PAN']")).sendKeys("ANFPL7219E");
        driver.findElement(By.xpath("//*[@value='Search']")).click();
        Thread.sleep(10000);
        driver.close();
        	}
        }
        driver.switchTo().window(Parentwindow);
        driver.findElement(By.xpath("//*[text()='RSS']")).click();
        driver.close();
        
//        //Cascading style sheets
//        driver.get("https://www.computerhope.com/");
       
        Thread.sleep(5000);
        driver.quit();
        
        
	}

}
