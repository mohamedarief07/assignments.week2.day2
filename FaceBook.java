package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {

		// Step 1: Download and set the path
		// Step 2: Launch the chromebrowser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		// Step 7: Enter the first name
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Autom@tion");

		// Step 8: Enter the last name
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Tester");

		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9876352410");

		// Step 10: Enter the password
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]"))
				.sendKeys("Autom@tionTester01");

		// Step 11: Handle all the three drop downs
		// Day
		WebElement DayElement = driver.findElement(By.xpath("(//select[@id='day'])"));
		Select dropdown1 = new Select(DayElement);
		dropdown1.selectByIndex(6);

		// Month
		WebElement MonthElement = driver.findElement(By.xpath("(//select[@id='month'])"));
		Select dropdown2 = new Select(MonthElement);
		dropdown2.selectByValue("5");

		// year
		WebElement yearElement = driver.findElement(By.xpath("(//select[@id='year'])"));
		Select dropdown = new Select(yearElement);
		dropdown.selectByVisibleText("1991");
		Thread.sleep(2000);

		// Step 12: Select the radio button "Female"
		driver.findElement(By.xpath("(//input[@value='1'])")).click();
		System.out.println("Assignment 01 has been completed successfully");

	}

}
