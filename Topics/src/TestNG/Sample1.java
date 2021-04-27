package TestNG;

import org.testng.annotations.Test;

public class Sample1 {
  @Test(priority=1)
  public void abc() {
	  System.out.println("a");
  }
  @Test(priority=03)
  public void bcd() {
	  System.out.println("b");
  }
  @Test(priority=2)
  public void cde() {
	  System.out.println("c");
  }
  @Test(priority=0)
  public void def() {
	  System.out.println("d");
  }
  @Test(priority=-1)
  public void efg() {
	  System.out.println("E");
  } @Test(priority=-5)
  public void fgh() {
	  System.out.println("F");
  } @Test(priority=-50)
  public void ghi() {
	  System.out.println("G");
  } @Test(priority=-100)
  public void hij() {
	  System.out.println("H");
  }
  
}

