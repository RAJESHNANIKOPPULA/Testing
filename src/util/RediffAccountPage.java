package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffAccountPage {
     WebDriver driver;
     
     public RediffAccountPage(WebDriver driver) {
    	 this.driver=driver;
     }
     public void getApplication() {
    	 driver.get( "https://www.rediff.com");
     }
     public void maximizeWindow() {
    	 driver.manage().window().maximize();
     }
     public void clickCreateAccountLink() {
    	 WebElement createAccountLink =driver.findElement(By.linkText("Create Account"));
    	 createAccountLink.click();
     }
     public boolean isRediffAccountpageOpened(String expectedTitle) {
    	 String actualTitle=driver.getTitle();
    	 return actualTitle.contains(expectedTitle);
     }
     public int countLinksOnPage() {
    	 return driver.findElements(By.tagName("a")).size();
     }
     public void clickOnTermsandConditions() {
    	 WebElement termsAndCondtionsLink = driver.findElement(By.linkText("terms and conditions"));
    	 termsAndCondtionsLink.click();
     }
     public void switchToChildWindow() {
    	 String parentWindow = driver.getWindowHandle();
    	 for (String windowHandle : driver.getWindowHandles()) {
    		 if(!windowHandle.equals(parentWindow)) {
        		 driver.switchTo().window(windowHandle);
        		 break;
    		 }
    	 
    	 }
     }
     public String getChildWindowTitle() {
    	 return driver.getTitle();
     }
     public boolean validateChildWindowTitle(String expectedTitle) {
    	 String actualTitle = getChildWindowTitle();
    	 return actualTitle.contains(expectedTitle);
     }
     public void closeChildWindow() {
    	 driver.close();
     }
     public void switchToParentWindow() {
     String parentWindow = driver.getWindowHandle();
     driver.switchTo().window(parentWindow);
     }
}