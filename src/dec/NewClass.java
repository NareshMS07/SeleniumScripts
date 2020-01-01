package dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {

	public static void main(String[] args) throws Throwable {
//creating instance object
WebDriver driver=new ChromeDriver();
//launch url in Browser
driver.get("http://orangehrm.qedgetech.com/");
driver.manage().window().maximize();
//enter username and password
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
driver.findElement(By.name("Submit")).click();
//Suspend from executing for 5 sec
Thread.sleep(5000);
driver.quit();
	}
}
