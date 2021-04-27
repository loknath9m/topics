package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingSsl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\sample\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		driver.findElement(By.cssSelector("[name='identifier']")).sendKeys("chinnareddy706");
		driver.findElement(By.cssSelector("[class='VfPpkd-RLmnJb']")).click();

	}

}
