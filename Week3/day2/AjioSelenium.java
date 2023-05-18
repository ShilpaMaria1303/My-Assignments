package Week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioSelenium {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//WebElement count=driver.findElement(By.xpath("//div[text()='2,691']"));
		//String totalItems = driver.findElement(By.className("length")).getText();
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		//List<WebElement> list=driver.findElements(By.xpath("//div[@class='brand']"));
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
			List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
			System.out.println(" Size :" + bagNameList.size());
			System.out.println(" Names of the Bags");
			for (WebElement webElement1 : bagNameList) {
				String text1 = webElement.getText();
				System.out.println(text1);
		}
	}

}}
