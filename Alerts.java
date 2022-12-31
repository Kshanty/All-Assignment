package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
			driver.get("https://www.leafground.com/alert.xhtml");
		   //simple dialog
			driver.findElement(By.xpath("//h5[contains(text(),'Simple Dialog')]/following::span[text()='Show']")).click();
			Alert alert2 = driver.switchTo().alert();
			
			String alertMsg2 = alert2.getText();
			System.out.println(alertMsg2);
			
			alert2.accept();
		//confirm dialog
	
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]/following::span[text()='Show']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertMsg = alert.getText();
		System.out.println(alertMsg);
		
		alert.accept();
		
		
	}

}
