package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataprovider {
  @Test(dataProvider = "Testing")
  public void f(Integer n, String s) {
	  System.out.println(n+".." +s);
  }

  @DataProvider
  public Object[][] Testing() {
    return new Object[][] {
      new Object[] { 1, "java" },
      new Object[] { 2, "testng" },
    };
  }

  @Test(dataProvider = "process")
  public void f( String course, String browser, String tool) {
	  System.out.println("Course: " +course+"...:  Browser: "+browser+"...: Tool:"+tool);
  }

  @DataProvider
  public Object[][] process() {
    return new Object[][] {
      new Object[] {  "java","IE","corejava" },
      new Object[] {  "testng","chrome","eclipse" },
      new Object[] {  "mavan","Firefpx","eclipse" },
    };
  }
}
