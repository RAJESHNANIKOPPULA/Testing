import org.openqa.selenium.WebDriver;

import util.DriverSetup;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=DriverSetup.invokeBrowser("Chrome");
		driver.get("https://google.com");
	}

}
