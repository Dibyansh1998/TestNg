package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Parameters({"URL"})
	@AfterTest
	public void lastexecution(String urlname)
	{
		System.out.println("This will executed last");
		System.out.println(urlname);
	}
	@Test(groups= {"Smoke"})
	public void DemoPersonalLaon()
	{
		System.out.println("Demo Personal Loan");
	}
	
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("I'm the number one");
	}
	     	@Test
	public void SecondPersonalLoan()
	{
		System.out.println("Second Personal Loan");
	}

}
