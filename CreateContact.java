package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();	
	driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
	//driver.findElement(By.id("")).sendKeys("");
	driver.findElement(By.id("firstNameField")).sendKeys("Mohamed");
	driver.findElement(By.id("lastNameField")).sendKeys("Arief");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mohd");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("MAK");
	driver.findElement(By.xpath("(//span[@class='tableheadtext'])[6]/following:: input")).sendKeys("CSE");
	driver.findElement(By.xpath("(//span[@class='tableheadtext'])[9]/following:: textarea")).sendKeys("Monday, 28 February 2022\r\n"
			+ "Date in Kumbakonam, Tamil Nadu");
	driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("arief@gmail.com");
	
	WebElement Dropdown1 = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
	Select dd=new Select(Dropdown1);
	dd.selectByVisibleText("District of Columbia");
	
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	
	driver.findElement(By.xpath("//a[text()='Edit']")).click();	
	driver.findElement(By.xpath("(//span[@class='tableheadtext'])[8]/following:: textarea")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Added the Important Note while updating");
	driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	System.out.println("The Title of Resulting Page is " +driver.getTitle());
	
	System.out.println("Assignment 02.1 has been completed successfully");
	}

}
