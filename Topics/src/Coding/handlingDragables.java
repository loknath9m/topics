package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingDragables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement pickup=driver.findElement(By.cssSelector("[id='draggable']"));
        WebElement dropto=driver.findElement(By.xpath("//div[@id='droppable']"));
        System.out.println("moved");
        
        Actions action=new Actions(driver);
        action.dragAndDrop(pickup, dropto).build().perform();
        action.dragAndDropBy(dropto, 0, 0);

	}

}
