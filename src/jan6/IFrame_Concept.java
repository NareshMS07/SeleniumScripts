package jan6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_Concept {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
//click on login
		driver.findElement(By.xpath("//li[@class='_26Vr']")).click();
		Thread.sleep(5000);
//		get collection of frames
List<WebElement>Oframes=driver.findElements(By.tagName("iframe"));
System.out.println("no of frames are::"+Oframes.size());
driver.switchTo().frame(0);
//click on login in frame
driver.findElement(By.xpath
("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
Thread.sleep(5000);
driver.findElement(By.name("username")).sendKeys("pranga2010@gmail.com");
Thread.sleep(5000);
driver.findElement(By.name("password")).sendKeys("test12345");
Thread.sleep(5000);
//click on login
driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/md-content/button/span")).click();
Thread.sleep(5000);
//come out of frames
driver.switchTo().defaultContent();
Thread.sleep(5000);
//click on close
driver.findElement(By.linkText("X")).click();
Thread.sleep(5000);
//clcik on Electricity link 
driver.findElement(By.linkText("Electricity")).click();
Thread.sleep(5000);
driver.close();

	}

}
