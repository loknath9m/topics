package TestNG;

import org.testng.annotations.Test;

public class dependsonmethod {
  @Test(dependsOnMethods={"login"})
  public void openbrowser() {
	  System.out.println("open Browser");
  }
  @Test
  public void url() {
	  System.out.println("enter url");
  }
  @Test(dependsOnMethods={"url"})
  public void login() {
	  System.out.println("login into app");
  }
  @Test(dependsOnMethods={"openbrowser"})
  public void password() {
	  System.out.println("enter password");
  }
}
	