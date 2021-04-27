package Coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class handlingSSl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sample\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start.maximized");
		options.addArguments("--headless");
		
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dc.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver=new ChromeDriver(dc);
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://www.monsterindia.com/seeker/registration?spl=IN-Acq-SEM-Google-Core_Brand_Exact_Web_S-GSN-Monster_Core-monster%20jobs-desktop-Brand---344502103599---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-Core_Brand_Exact_Web_S-GSN-Monster_Core-monster%20jobs-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_monster%20jobs&gclid=Cj0KCQjw9YWDBhDyARIsADt6sGZ2TR_StzDDDOKSGubh_aKPGQR4yWC2ibemExJc-T4pxTEGEbztWegaAu1aEALw_wcB");
        System.out.println("sorry");
        driver.quit();

	}

}
