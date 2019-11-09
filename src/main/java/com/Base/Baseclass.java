package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public	static WebDriver driver;
	public static Alert a;
	static FileInputStream fi = null;
	static Properties pro;
public Baseclass(){
	try {
		fi=new FileInputStream("C:\\marthaanjaiah\\hrmpages\\src\\main\\java\\conpro\\co.pro");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	pro=new Properties();
	try {
		pro.load(fi);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String cpath=pro.getProperty("path");
	String urll=pro.getProperty("urli");
	System.out.println(urll); 
	String user=pro.getProperty("username");
	System.out.println(user);
String pwd=pro.getProperty("password");
System.out.println(pwd); 

	
}
public static void intia(){
	String cbrowser=pro.getProperty("browser");
	System.out.println();
	if(cbrowser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver",pro.getProperty("path"));
		driver=new ChromeDriver();
		
	}else
		System.out.println("browser not opened");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	
driver.get(pro.getProperty("urli"));


}
  
public static void switchalert()
{
	a= driver.switchTo().alert();
//	return a;
}

public static void alert_accept()
{

	a.accept();
}
public static String alert_text()
{
	
	return a.getText();
}

}
