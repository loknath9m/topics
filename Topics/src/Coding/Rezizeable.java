package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rezizeable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
//        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement source=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
        Actions action=new Actions(driver);
        action.clickAndHold(source).moveByOffset(80, 90).release().build().perform();
        System.out.println("resized");
        

	}

}
