package test;

import org.openqa.selenium.WebDriver;
import util.DriverSetup;
import util.RediffAccountPage;

public class RediffAutomate {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=DriverSetup.invokeBrowser("Chrome");
		RediffAccountPage automate=new RediffAccountPage(driver);
		automate.getApplication();
		System.out.println("Rediffmail webpage Launched");
		System.out.println("--------------------------------");
		automate.maximizeWindow();
		System.out.println("Window Maximized");
		System.out.println("--------------------------------");
		automate.clickCreateAccountLink();
		System.out.println("");
		String createRediffAccountPage="Create Rediffmail Account";
		if(automate.isRediffAccountpageOpened(createRediffAccountPage)) {
			System.out.println("Succesfully Opened The 'Create Rediffmail Account' webpage");
		}
		else
		{
			System.out.println("Failed to open the 'Create Rediffmail Account' webpage");
		}
		System.out.println("--------------------------------");
		int linkCount=automate.countLinksOnPage();
		System.out.println("Total Number of Links In 'Create Rediffmail Account' webpage:: "+linkCount);
		System.out.println("--------------------------------");
		automate.clickOnTermsandConditions();
		automate.switchToChildWindow();
		System.out.println("--------------------------------");
		String childWindowTitle=automate.getChildWindowTitle();
		System.out.println("Title Of Child Window Is:: "+childWindowTitle);
		System.out.println("--------------------------------");
		String expectedChildWindowTitle="Terms and Conditions";
		if(automate.validateChildWindowTitle(expectedChildWindowTitle)) {
			System.out.println("Succesfully Opened The Child Window With Title Expected ");
		}
		else
		{
			System.out.println("Failed to Open The Child Window With Title Expected");
		}
		System.out.println("--------------------------------");
		automate.closeChildWindow();
		System.out.println("Child Window Closed Successfully!");
		System.out.println("--------------------------------");
		automate.switchToParentWindow();
		System.out.println("Switched To Parent Window");
		System.out.println("--------------------------------");
		driver.quit();
		System.out.println("Browser Closed!!!!");
		
		
	}

}
