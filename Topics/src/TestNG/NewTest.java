package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("my Method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("my before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("my after Method");
	  
  }
  @Test
  public void a() {
	  System.out.println("my A Method");
  }
  @Test
  public void b() {
	  System.out.println("my B Method");
  }
  

}
