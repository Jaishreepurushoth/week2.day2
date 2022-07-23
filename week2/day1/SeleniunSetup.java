package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniunSetup {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//enter the username value with label username
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		
		
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);
		
		if (attribute.equals("Logout")) {
			
			System.out.println("sucessfully logged in");
			
		}
		
		//click on the CRM/SFA
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// click the leads tab
		
		driver.findElement(By.linkText("Leads")).click();
		
		// clcik create leads link
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCD");
		
		//enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jaishree");
		
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Purushoth");
		
		//select the drop downbox
		WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select s =new Select (dd);
		
		s.selectByVisibleText("Employee");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		
			String str = driver.getTitle();
			if ( str.equalsIgnoreCase("View lead | opentaps CRM")) 
			{
				System.out.println("verified the title successfully");
			}
			
		
			}
		}
		
		
		
		

