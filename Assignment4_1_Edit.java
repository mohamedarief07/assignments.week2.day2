package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_1_Edit {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Enter your email address
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test1234@gmail.com");

		// Append a text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Arief Khan");

		// Get default text entered
		String attribute = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
		System.out.println("Get default text entered :" + attribute);

		// Clear the text
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();

		// Confirm that edit field is disabled
		boolean enabled = driver.findElement(By.xpath("(//input[@disabled='true'])")).isEnabled();
		System.out.println("Is that edit field is enabled ? ;" + enabled);

	}

}
