package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebloginCARLoan()
	{
		System.out.println("WebLogin CarLoan");
	}
	
	@BeforeMethod
	public void beforevery()
	{
		System.out.println("I will execute before in Day 3 class");
	}
	@Test(timeOut = 4000)//This timeout functions will wait until you given the time has been reached
	public void MobileloginCARLoan()
	{
		System.out.println("MobileLog in CarLoan");
	}
	
	@AfterMethod
	public void Afterevery()
	{
		System.out.println("I will execute after in Day 3 class");
	}
	
	@Test
	public void MobilelogOutCARLoan()
	{
		System.out.println("MobileLog Out CarLoan");
	}
	
	@Test(dependsOnMethods = {"MobilelogOutCARLoan","WebloginCARLoan"})
	//Depends on Methods menas if we want to run any specific method before then put Method name in it then that method will execute first
	public void APIloginCARlaon()
	{
		System.out.println("API Log in CarLoan");
	}
	
	@Test(enabled=false)//If we have a bug on specific method then use enabled= false command so that will exclude the method
	public void WindsheildCarLoan()
	{
		System.out.println("Wind Shield Car Loan");
	}
	
	

}
