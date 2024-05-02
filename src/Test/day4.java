package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day4 {
	
	@Test(dataProvider="getData")
	public void WebloginHOMELoan(String username, String password)
	{
		System.out.println("WebLogin Home Loan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginHOMELoan()
	{
		System.out.println("MobileLog in HomeLoan");
	}
	
	@Test
	public void APIloginHOMELoan()
	{
		System.out.println("API Log in HomeLoan");
	}
	
	@AfterSuite
	public void afsuite()
	{
		System.out.println("I'm the one from last");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		
		//1st set of username and password
		data[0][0]="FirstsetUsername";
		data[0][1]="FirstPassword";
		
		//2nd set of username and password
				data[1][0]="SecondsetUsername";
				data[1][1]="SecondPassword";
				
		//3rd set of username and password
				data[2][0]="ThirdsetUsername";
				data[2][1]="ThirdPassword";
				
				return data;
				
	
	
	
	}
	
	

}
