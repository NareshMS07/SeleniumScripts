package jan9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	Actions ac=new Actions(driver);
	//switch to frame
	driver.switchTo().frame(0);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement dst=driver.findElement(By.id("droppable"));
	Thread.sleep(5000);
	//get location of dst
	int x=dst.getLocation().getX();
	int y=dst.getLocation().getY();
	System.out.println(x+"    "+y);
    ac.dragAndDropBy(source, x,y).build().perform();
    Thread.sleep(5000);
    driver.close();
	}

}
