package util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReuseableMethod {
	WebDriver driver;
	public ReuseableMethod(WebDriver driver) {
		this.driver=driver;
	}
	//Getting application Luanched
	public void getApplication()
	{
		driver.get("http://uitestpractice.com/Students/Select");
	}
	//Maximizing Window
	public void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	//counting dropdowns
	public int countDropDown()
	{
		List<WebElement>list=driver.findElements(By.tagName("select"));
		return list.size();
	}
	//checking Single or Multiple
	public Select select()
	{
		WebElement selectDdown=driver.findElement(By.id("countriesSingle"));
		return new Select(selectDdown);
	}
	public void multipleDropDown()
	{
	}
	public boolean isDropDownMultiple()
	{
		return select().isMultiple();
	}
	public void displaySelectOptions()
	{
	}
	//Verifying Multiple Values in DropDown
}