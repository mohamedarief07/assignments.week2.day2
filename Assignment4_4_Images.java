package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_4_Images {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		//Click on this image to go home page
		driver.findElement(By.xpath("//label[@for='home']/following-sibling::img")).click();
		Thread.sleep(4000);
		driver.get("http://leafground.com/pages/Image.html");
		
		
		//Am I Broken Image?
		WebElement brokenImage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		brokenImage.click();
		//System.out.println(driver.getCurrentUrl());
		
		if (driver.getCurrentUrl().contains("pages/Image.html")) {
			System.out.println("It is a Broken Image");
			
		}else {
			System.out.println("It is Not a Broken Image");
		}
		
		//Click me using Keyboard
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		
		Thread.sleep(4000);
		driver.get("http://leafground.com/pages/Image.html");
		
		

	}

}
