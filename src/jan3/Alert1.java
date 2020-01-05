package jan3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//click on login button without entering details
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		//get alert text
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		//conform alert
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		//enter invalid password
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("ADmin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		driver.close();

	}

}
