package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before executing all methods in class");
	}
	@Test(groups= {"Smoke"})
	public void Demo2PeronsonalLoan()
	{
		System.out.println("Demo2  Personal Loan");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("This will execute first");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after executing all methods in class");
	}
	

}
