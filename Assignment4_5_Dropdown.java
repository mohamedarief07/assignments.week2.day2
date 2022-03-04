package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_5_Dropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Select training program using Index
		WebElement getByIndex = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select index = new Select(getByIndex);
		index.selectByIndex(1);

		// Select training program using Text
		WebElement getByText = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select Text = new Select(getByText);
		Text.selectByVisibleText("Selenium");

		// Select training program using Value
		WebElement getByvalue = driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select Value = new Select(getByvalue);
		Value.selectByValue("3");

		// Get the number of dropdown options
		Select se = new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));

		List<WebElement> i = se.getOptions();
		System.out.println("number of dropdown options are :" + i.size());

		// You can also use sendKeys to select
		driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("UFT/QTP");

		// Select your programs
		driver.findElement(By.xpath("(//div[@class='example'])[6]/select")).sendKeys(Keys.END);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//option[contains(text(),'Loadrunner')])[6]")).click();
	}

}
