package week2.july17.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]/a")).click();
		driver.findElement(By.xpath("(//div[@class='_5dbb'])[1]/input")).sendKeys("jaishree");
		driver.findElement(By.xpath("(//div[@class='_5dbb'])[2]//input")).sendKeys("purushoth");
		driver.findElement(By.xpath("(//div[@class='_5dbb'])[3]//input")).sendKeys("9080544221");
		driver.findElement(By.xpath("(//div[@class='_5dbb'])[5]//input")).sendKeys("qwer1234!");
		WebElement dropdown1=driver.findElement(By.id("day"));
		Select s1=new Select(dropdown1);
		s1.selectByValue("15");
		Select s2=new Select(driver.findElement(By.id("month")));
		s2.selectByValue("5");
		Select s3=new Select(driver.findElement(By.id("year")));
		s3.selectByValue("1990");
		driver.findElement(By.xpath("(//span[@class=\"_5k_2 _5dba\"])[1]/input")).click();
		//driver.close();
	}

}
