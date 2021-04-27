package Coding;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFiles {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://www.monsterindia.com/seeker/registration?spl=IN-Acq-SEM-Google-Core_Brand_Exact_Web_S-GSN-Monster_Core-monster%20jobs-desktop-Brand---344502103599---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-Core_Brand_Exact_Web_S-GSN-Monster_Core-monster%20jobs-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_monster%20jobs&gclid=Cj0KCQjw9YWDBhDyARIsADt6sGZ2TR_StzDDDOKSGubh_aKPGQR4yWC2ibemExJc-T4pxTEGEbztWegaAu1aEALw_wcB");
        WebElement upload=driver.findElement(By.cssSelector(".mqfi-file-upload.icon"));
        upload.click();
        Thread.sleep(10000);
        
        StringSelection selection=new StringSelection("C:\\sample\\resume.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        
        Robot robot=new Robot();
        Thread.sleep(5000);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        
        
        
        

	}

}
