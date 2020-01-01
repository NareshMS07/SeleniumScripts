package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewUserRegistration {

	public static void main(String[] args) throws Throwable {
		//contact info
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.clear();
		firstname.sendKeys("Pasupla");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.clear();
		lastname.sendKeys("Naresh Kumar");
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.clear();
		phone.sendKeys("9441740532");
		WebElement email=driver.findElement(By.xpath("//input[@id='userName']"));
		email.clear();
		email.sendKeys("pasupulanareshkumar8@gmail.com");
		Thread.sleep(2000);
		//mailing info
		WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
		address.clear();
		address.sendKeys("5-15,chrelopalli");
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.clear();
		city.sendKeys("Anantapur");
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		state.clear();
		state.sendKeys("Andhra Pradesh");
		WebElement postalcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		postalcode.clear();
		postalcode.sendKeys("515641");
		Select country=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		country.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		//User info
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.clear();
		username.sendKeys("pasupulanareshkumar8@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys("Naresh@1");
		WebElement cfnmpassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		cfnmpassword.clear();
		cfnmpassword.sendKeys("Naresh@1");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		if (driver.getCurrentUrl().contains("mercury")) 
		{
			System.out.println("Thank you for registering");	
		}
		else {
			String message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(message+"    "+"already exists");	
		}
		Thread.sleep(1000);
		driver.close();
	}

}
