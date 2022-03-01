package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Acme {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("(//input[@class='form-control '])[1]")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).sendKeys("leaf@12");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page is : " + title);
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		driver.close();
		System.out.println("Assignment:3 has been completed sucessfully");

	}

}
