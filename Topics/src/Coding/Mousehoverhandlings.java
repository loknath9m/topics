package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoverhandlings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_Cj0KCQjwl9GCBhDvARIsAFunhsnXh7e90uApC14N0ac4Dy4r16z_YtVnIAt0HohTNfwegt2a7DnStqkaAvgGEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQjwl9GCBhDvARIsAFunhsnXh7e90uApC14N0ac4Dy4r16z_YtVnIAt0HohTNfwegt2a7DnStqkaAvgGEALw_wcB");
        
        WebElement Hello=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(Hello).build().perform();
        driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']")).click();
        Thread.sleep(5000);
        		

	}

}
