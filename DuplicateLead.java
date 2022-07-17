package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click the Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click the Create Lead button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("amazon");
		
		//Enter the First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thangarasu");
		
		//Enter the Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja");
		
		//Enter the First name local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("thangarasu");
		
		//Enter the Department Name
		driver.findElement(By.name("departmentName")).sendKeys("software testing");
		
		//Enter the Description
		driver.findElement(By.name("description")).sendKeys("This is about selenium training,welcome all");
		
		//Enter the Email ID
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		
	   //Select value in Drop down
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("New York");
		
		//click create lead button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the title
		String title=driver.getTitle();
		
		//Print the title
		System.out.println(title);
		
		//Confirm the title
		if(title.contains("View Lead | opentaps CRM")){
			System.out.println("I confirmed the title");
		}
		else
		{
			System.out.println("Title does not contain the word View Lead | opentaps CRM");
		}
		
		//Click the Duplicate Lead button
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//clear company name
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		//Enter new company name
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		
		//clear the first name field
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		//Enter new first name 
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aadhan");
		
		//Click Create Lead button
		
		driver.findElement(By.name("submitButton")).click();
		
		//Get the title again
		String title2 = driver.getTitle();
		
		//Print the title 
		System.out.println(title2);
		
		
		//Confirm the title
		if(title2.contains("View Lead | opentaps CRM")){
			System.out.println("I confirmed the title");
		}
		else
		{
			System.out.println("Title does not contain the word View Lead | opentaps CRM");
		}

	}

}
