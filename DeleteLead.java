package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10411");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10411");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		System.out.println("No records to display");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	
	
		//driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9176603396");
		//driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	

	}

}
