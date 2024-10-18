package test;

import org.openqa.selenium.WebDriver;
import util.DriverSetup;
import util.ReuseableMethod;

public class TestBrowser {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=DriverSetup.invokeBrowser("Chrome");
		ReuseableMethod rMethod=new ReuseableMethod(driver);
		rMethod.getApplication();
		System.out.println("Website Luanched Succesfully");
		System.out.println("------------------------------");
		rMethod.maximizeWindow();
		System.out.println("Window maximized");
		System.out.println("------------------------------");
		int count=rMethod.countDropDown();
		System.out.println("Number of Items in DropDown is::"+count);
		System.out.println("------------------------------");
		rMethod.isDropDownMultiple();
		System.out.println("Is DropDown Multiple :: True/False:"+rMethod.isDropDownMultiple());
		
		
		
	}
		
		
		
		
}


