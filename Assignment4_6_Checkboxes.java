package week2.day2.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_6_Checkboxes {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Select the languages that you know?
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();

		
		//Confirm Selenium is checked
		WebElement findElement = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::div/input"));

		boolean isEnabled = findElement.isEnabled();
		System.out.println(isEnabled);
	
		
		//DeSelect only checked
		driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following-sibling::div/input)[2]")).click();
		
		//Select all below checkboxes
		
		for (int i = 1; i <=5; i++) {
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::div/input)["+i+"]")).click();
		}

		}
	
	

}
