package mindtree.Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assessment {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://tide.com");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
 
        
       //Search Product
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Tide");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.navigate().back();
 
        
        //Shop Products
        Actions act =new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//a[@href='/en-us/shop']"));
        act.moveToElement(element).perform();
        driver.findElement(By.xpath("//a[@href='/en-us/shop']")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        
        
        //Open Registration Form
        driver.findElement(By.xpath("//a[@href='/en-us/sign-in']")).click();
        driver.findElement(By.xpath("//a[@class='event_internal_link']")).click();
        Thread.sleep(5000);
        driver.close();
        
        

	}

}
