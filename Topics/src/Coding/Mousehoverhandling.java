package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoverhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
//        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='OK']")).click();
        
//        WebElement trainmenu=driver.findElement(By.xpath("//a[@aria-label='Menu Train']"));
//        Actions action=new Actions(driver);
//        action.moveToElement(trainmenu).build().perform();
       
//        driver.findElement(By.xpath("//span[text()='Connecting Journey Booking']")).click();
//        action.moveToElement(driver.findElement(By.cssSelector("[aria-label='Sub Menu of cancel ticket, Counter ticket cancellation']"))).build().perform();
      
        WebElement busmenu=driver.findElement(By.cssSelector("[aria-label='Menu BUSES. Website will be opened in new tab']"));
        Actions action=new Actions(driver);
        action.moveToElement(busmenu).click().build().perform();
        System.out.println("mouse over operation");
        
        
	}

}
 