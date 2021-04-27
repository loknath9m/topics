package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class sample2 {
  @Test
  public void f() {
	  System.out.println("my class");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" Before my class");
  }

  @AfterMethod
  public  void afterMethod() {
	  System.out.println("After my class");
  }

  @BeforeClass
  public static void beforeClass() {
	  System.out.println("my class before");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("my class after");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }
  @BeforeSuite
  public void t() {
	  System.out.println("Before suite");
  }
}
