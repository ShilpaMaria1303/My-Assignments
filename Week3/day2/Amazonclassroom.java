package Week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonclassroom {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> price=driver.findElements(By.className("a-price-whole"));
		List<Integer> finalprice=new ArrayList<>();
		for(WebElement each: price )
		{
			 String Prices= each.getText();//10,988
			String replacedstring= Prices.replaceAll(",", "");//10988
			if (!replacedstring.isEmpty())//remove white spaces
			{
		int finalprices=	Integer.parseInt(replacedstring);//convert to integer from string type
		finalprice.add(finalprices);
			}
			 

		}
		Collections.sort(finalprice);
		System.out.println(finalprice.get(0));
		
	}

}
