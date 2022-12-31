package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Kavya");
		alert.accept();
		
		WebElement text = driver.findElement(By.id("demo"));
		System.out.println(text.getText());
		
		//driver.findElement(By.xpath("//h2[contains(text(),'JavaScript Prompt')]/following::span[text()='Try it']")).click();
		
		
	}

}
