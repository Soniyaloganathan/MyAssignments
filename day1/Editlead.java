package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editlead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("prodapt");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Soniya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("L");
	WebElement sourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));//for dropdown select class is used
	
	Select SS=new Select(sourceDD);
	SS.selectByIndex(4);
	WebElement sourceD1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));	
	Select S1=new Select(sourceD1);
	S1.selectByVisibleText("Automobile");
	WebElement SourceD2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select S2=new Select(SourceD2);
	S2.selectByValue("OWN_CCORP");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcomehome");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("soniya.l@gmail.com");
	WebElement sourceD3=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select S3=new Select(sourceD3);
	S3.selectByVisibleText("New York");	
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Helllooo");
	driver.findElement(By.name("submitButton")).click();
	System.out.println("The given title is verified :"+driver.getTitle());
	
	if(driver.getTitle().contains("View Lead"))
	{
  System.out.println("The Title is verified");
     
	}
	else
	{
		System.out.println("The title is not verified");
	}
}
}