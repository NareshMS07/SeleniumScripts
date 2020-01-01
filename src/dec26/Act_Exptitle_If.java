package dec26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act_Exptitle_If {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		String exptitle="youtube";
		//get acttitle
		String acttitle=driver.getTitle();
		//verify acttitle equals with exptitle
		if(acttitle.equals(exptitle));
		{
		System.out.println("Title is matching::"+acttitle+"    "+exptitle);
		}
		
		Thread.sleep(5000);
		driver.close();

	}

}
