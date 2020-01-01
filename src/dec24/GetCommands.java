package dec24;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//print title od the page and length of page
	String pagetitle=driver.getTitle();
	System.out.println("page title is::"+pagetitle);
	System.out.println("page title length is::"+pagetitle.length());
	//print url of page and length of url
	String url=driver.getCurrentUrl();
	System.out.println("url is=="+url);
	System.out.println("url length is=="+url.length());
	driver.close();
	}
}
