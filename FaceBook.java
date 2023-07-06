package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Soniya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Naresh");
		driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("9751841282");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Soniloga@123");
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		Select Dy=new Select(Day);
		Dy.selectByValue("3");
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		Select Mo=new Select(Month);
		Mo.selectByVisibleText("Mar");
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		Select Yr=new Select(Year);
		Yr.selectByValue("1996");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		

		
	}

}
