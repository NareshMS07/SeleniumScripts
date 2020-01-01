package dec31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecificItem_ComeOutOfLoop {

	public static void main(String[] args) {
		String expitem="blue";
		Boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///E:/Multi.html");
		driver.manage().window().maximize();
		Select listbox=new Select(driver.findElement(By.name("multiSelection")));
		//get collection of items
		List<WebElement>listitems=listbox.getOptions();
		System.out.println("no of items are::"+listitems.size());
		for (int i = 0; i <listitems.size(); i++) 
		{
			String eachitem=listitems.get(i).getText();
			System.out.println(eachitem);
			//verify expitem is equals to eachitem in listbox
			if (eachitem.equalsIgnoreCase(expitem)) 
			{
				//when expitem is equals to eachitem exit loop
				itemexist=true;
				break;
			}
		}
		//itemexist is boolean type ,if it is true run codition or execute else part
		if (itemexist) 
		{
			System.out.println("item found in listbox::"+expitem);	
		}
		else {
			System.out.println("item not found in listbox::"+expitem);
		}
		driver.close();
	}

}
