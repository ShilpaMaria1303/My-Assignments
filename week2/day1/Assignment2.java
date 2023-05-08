package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shilpa");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jose");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jose");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learn automation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test@gmail.com");
		WebElement ss= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec=new Select(ss);
		sec.selectByVisibleText("Alaska");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edit important notice");
		driver.findElement(By.className("smallSubmit")).click();
		
		String s=driver.getTitle();
		System.out.println(s);
	}

}
