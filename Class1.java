package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Class1 {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://login.salesforce.com/?locale=in");
		
	      driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	      
	      driver.findElement(By.id("password")).sendKeys("Testleaf$321");
	      
	      driver.findElement(By.id("Login")).click();
	      
	     driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	     
	     driver.findElement(By.xpath("//button[text()='View All']")).click();
	     
	     
		
	}

}
