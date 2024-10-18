package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PerformTest{
	WebDriver driver;
	public PerformTest(WebDriver driver) {
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
	public int countItems()
	{
		//Counting the Number of Items In DropDown
		WebElement count=driver.findElement(By.id("countriesMultiple"));
		Select select =new Select(count);
		return select.getOptions().size();
	}
	public void displayingValues()
	{
		//Displaying the values presented In DropDown
		WebElement values=driver.findElement(By.id("countriesMultiple"));
		Select select=new Select(values);
		for (WebElement option : select.getOptions()){
			System.out.println("The Value Presented In DropDown "+option.getText());
		}
	}
	public WebElement selectValues()
	{
		WebElement country=driver.findElement(By.id("countriesMultiple"));
		Select select =new Select(country);
		select.selectByVisibleText("India");
		select.selectByVisibleText("United states of America");
		return country;
	}
}