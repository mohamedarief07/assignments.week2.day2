package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_2_Buttons {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Click button to travel home page
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().contains("home.html")) {
			System.out.println("Click button to travel home page is PASSED");
			
		}else {
			System.out.println("Click button to travel home page is FAILED");
		}
		
		driver.get("http://leafground.com/pages/Button.html");

		// Find position of button (x,y)
		Point location = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
		System.out.println("position of button (x,y) is"+location);

		// Find button color
		String cssValue = driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("color");
		System.out.println("Button Color is: "+cssValue);
		
		// Find the height and width
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("Height and Width :"+size );

	}
}
