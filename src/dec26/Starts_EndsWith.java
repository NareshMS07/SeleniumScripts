package dec26;

import org.openqa.selenium.chrome.ChromeDriver;

public class Starts_EndsWith {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://gmail.com");
	driver.manage().window().maximize();
	String strprotocol="https://";
	String stractprotocol=driver.getCurrentUrl();
	if (stractprotocol.startsWith(strprotocol)) {
		System.out.println("url is secure::"+stractprotocol+"     "+strprotocol);
	}
    else {
		System.out.println("url is unsecure::"+stractprotocol+"     "+strprotocol);
	}
	}

}
