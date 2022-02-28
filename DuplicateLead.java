package week2.day2.assignments;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("mohamed");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(4000);
		String text1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).getText();
		System.out.println("first Leading Name :" +text1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		driver.findElement(By.xpath(" //a[contains(text(),'Duplicate Lead')]")).click();
		String text2 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println("The Title of the screen is :" +text2);	
		if(text2.contains("Duplicate Lead")) {
			System.out.println("This case is PASSED");
		}else
		{
			System.out.println("This case is FAILED");
		}
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String text3 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println("Company Name is :" +text3);	
		if(text3.contains("Mohamed")) {
			System.out.println("This case is PASSED");
		}else
		{
			System.out.println("This case is FAILED");
		}
		driver.close();	
			
}
}