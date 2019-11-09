package logintest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.Baseclass;
import com.Pages.Homepage;
import com.Pages.loginpage;

public class logintest1 extends Baseclass{
	// public static WebDriver driver;
	loginpage lop;
	Homepage homepage;
	public  logintest1() {
		// TODO Auto-generated constructor stub
		super();
	}
		
	
	
@BeforeTest


public void broserlanch(){
	intia();
	lop=new loginpage();
	
}
@Test(priority=2)
public void loginpagetitle(){
	boolean b=lop.verifyTitle("OrangeHRM - New Level of HR Management");
	Assert.assertEquals(true, b);
	//Assert.assertEquals(s,"OrangeHRM - New Level of HR Management");
}
@Test(priority=3)
public boolean login(){
	boolean b1=lop.verifyUser();
	Assert.assertTrue(b1);
	return b1;
}
@Test(priority=4)
public void verpwd(){
	boolean b2=lop.verfypwd();
		Assert.assertTrue(b2);
	
		
}
@Test(priority=1)
public void loginn(){
	homepage=lop.testUser("qaplanet1","lab1");
}


}
