package week2.day2B;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathWork {

	public static void main(String[] args) {

		
		

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Democsr");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		//Classroom:
		//Source dropdown -> Select value as "Conference" using visible text
		//Inductry dropdown -> Select value as "Finance" using value
		//Ownership dropdown -> Select value as "Corporation" using Index
		
		//Select dropdown = new Select(driver.findElement(By.xpath));  
		//dropdown.selectByVisibleText("Conference");
		//Select dropdown1 = new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));  
		//dropdown1.selectByValue("IND_FINANCE");
		
		//Select dropdown2 = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));  
		//dropdown2.selectByIndex(5);
		
		
		//WebElement eleSource = driver.findElement(By.id(null))
		//id locate in absolute xpath (//form[@id='login']//input)[2]
		
	}

}
