package dec31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_MiltiSlection_Deselect {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///E:/Multi.html");
		driver.manage().window().maximize();
		//select six items from the dropdown
		Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
		dropdown.selectByIndex(0);
		Thread.sleep(3500);
		dropdown.selectByIndex(4);
		Thread.sleep(3500);
		dropdown.selectByIndex(8);
		Thread.sleep(3500);
		dropdown.selectByIndex(10);
		Thread.sleep(3500);
		dropdown.selectByIndex(2);
		Thread.sleep(3500);
		dropdown.selectByIndex(5);
		Thread.sleep(3500);
		//count no of items which are selected
		List<WebElement>items=dropdown.getAllSelectedOptions();
		System.out.println("no of items selected::"+items.size());
		//print items which are selected
		for (int i = 0; i < items.size(); i++) 
		{
			String eachitem=items.get(i).getText();
			System.out.println(eachitem);
		}
		// deselect one by one item from selection
		dropdown.deselectByIndex(0);
		Thread.sleep(3000);
		dropdown.deselectByIndex(4);
		Thread.sleep(3000);
		dropdown.deselectAll();
		Thread.sleep(3000);
		driver.close();
	}

}
