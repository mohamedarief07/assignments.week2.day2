package week2.day2.assignments;

import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_3_HyperLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Go to Home Page
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().contains("home.html")) {
			System.out.println("Click button to travel home page is PASSED");

		} else {
			System.out.println("Click button to travel home page is FAILED");
		}

		driver.get("http://leafground.com/pages/Link.html");

		// Find where am supposed to go without clicking me?
		String attribute = driver
				.findElement(By.xpath("(//a[text()='Find where am supposed to go without clicking me?'])"))
				.getAttribute("href");
		System.out.println("where am supposed to go :" + attribute);

		// Verify am I broken?
		WebElement brokenOrNot = driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
		brokenOrNot.click();
		if (driver.getTitle().contains("HTTP Status 404 – Not Found")) {
			System.out.println("Link is broken");

		} else {
			System.out.println("Link is not Broken");
		}
		Thread.sleep(2000);

		driver.navigate().back();

		// Go to Home Page (Interact with same link name)
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		// go back to link page to interact with remaining links
		driver.navigate().back();

	}

}
