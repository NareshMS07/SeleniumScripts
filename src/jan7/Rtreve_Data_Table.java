package jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rtreve_Data_Table {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/qedgetable.html");
		driver.manage().window().maximize();
		//get table collection
		WebElement table=driver.findElement(By.name("qedgetech"));
		//get rows collection
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		//iterate the rows and get collection of columns
		for (int i = 1; i < rows.size(); i++) 
		{
		List<WebElement>clos=rows.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < clos.size(); j++) 
		{
		//capture column text
			String celltext=clos.get(j).getText();
			System.out.println("\t"+celltext);
		}
		System.out.println();
		System.out.println("-----------------------------");
		}
     Thread.sleep(3000);
     driver.close();
	}

}
