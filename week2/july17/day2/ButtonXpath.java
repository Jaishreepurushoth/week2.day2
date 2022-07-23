package week2.july17.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
		System.out.println(driver.findElement(By.id("position")).getLocation());
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("size")).getSize());
		//driver.close();
	}

}
