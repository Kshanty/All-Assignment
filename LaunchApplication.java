package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
 //to open a chrome browser
		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/login/");
		
		
	}

}
