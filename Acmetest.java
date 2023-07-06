package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acmetest {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		System.out.println("The given title is verified :"+driver.getTitle());
		
		if(driver.getTitle().contains("ACME System 1 - Dashboard"))
		{
	  System.out.println("The Title is verified");
	     
		}
		else
		{
			System.out.println("The title is not verified");
		

	}

}
}