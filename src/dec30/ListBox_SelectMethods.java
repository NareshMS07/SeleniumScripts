package dec30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_SelectMethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		//store month list box into Select class
		Select monthlistbox=new Select(driver.findElement(By.name("birthday_month")));
		//store month list box into Select class
		Select yearlistbox=new Select(driver.findElement(By.id("year")));
		//conform that single or multiple listbox
		boolean value1=monthlistbox.isMultiple();
		System.out.println(value1);
		boolean value2=yearlistbox.isMultiple();
		System.out.println(value2);
		//select item from listbox
		monthlistbox.selectByVisibleText("Mar");
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		yearlistbox.selectByVisibleText("1997");
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		//select by index number
		monthlistbox.selectByIndex(4);
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		yearlistbox.selectByIndex(23);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        driver.close();
	}

}
