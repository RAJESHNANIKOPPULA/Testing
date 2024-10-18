package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.DriverSetup;
import util.PerformTest;

public class CheckTest {
	static WebDriver driver;
	@Test
	public static void runner() {
		driver=DriverSetup.invokeBrowser("Chrome");
		PerformTest dropDown=new PerformTest(driver);
		dropDown.getApplication();
		System.out.println("Website Luanched Succesfully");
		System.out.println("------------------------------");
		dropDown.maximizeWindow();
		System.out.println("Window maximized");
		System.out.println("------------------------------");
		int itemscount=dropDown.countItems();
		System.out.println("The Number Of Items Present in DropDown:: "+itemscount);
		System.out.println("------------------------------");
		dropDown.displayingValues();
		System.out.println("------------------------------");
		System.out.println("The values getting selected:: ");
		System.out.println("------------------------------");
		System.out.println("New changes are commited");
	}

}
