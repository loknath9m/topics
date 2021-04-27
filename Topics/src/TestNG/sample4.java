package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class sample4 {
  @Test
  public void h() {
	  System.out.println("i love selenim");
  }
 @AfterSuite
 public void s() {
		  System.out.println("After suite");
	  }
  
}
