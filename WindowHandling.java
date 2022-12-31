package week4.day2;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//i[@class='fa fa-align-justify']")).click();
		driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		List<String> Wlist = new ArrayList<String>(windows);
		driver.switchTo().window(Wlist.get(1));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/flights.png");
		FileUtils.copyFile(source, target);
		driver.close();
		driver.switchTo().window(Wlist.get(0));
		System.out.println(driver.getTitle());
	}
	

}
