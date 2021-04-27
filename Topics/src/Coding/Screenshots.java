package Coding;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.computerhope.com/");
//        captureImage("one");
//        driver.manage().window().maximize();
//        captureImage("2");
//        driver.manage().window().fullscreen();
//        captureImage("3");
//        driver.manage().window().setSize(new Dimension(800,900));
		 
		WebElement ele=driver.findElement(By.xpath("//input[@title='Search']"));
		Point w=ele.getLocation();
		System.out.println("X:"+w.getX()+"Y:"+w.getY());
		Dimension d=ele.getSize();
		System.out.println("Dimension Height:"+d.getHeight()+"Dimension Width:"+d.getWidth());
        
       

	}
	public static void captureImage(String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File img=ts.getScreenshotAs(OutputType.FILE);
	    Files.copy(img,new File("C:\\sample\\"+name+".jpg"));
	}
	

}
