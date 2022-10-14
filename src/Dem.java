

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dem {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486457318205&hvpos=&hvnetw=g&hvrand=8489685034842180313&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061721&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=CjwKCAjwqJSaBhBUEiwAg5W9p4jf-Tp7pI4mIh2Pu6GI1_J6UXuARWV6-X4Go1enG7fmV0uA341Q3hoC_EUQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8826725610");
		
        driver.findElement(By.id("continue")).click();
       
        driver.findElement(By.id("ap_password")).sendKeys("lolo@123");
        
          Thread.sleep(5000);
        driver.findElement(By.id("signInSubmit")).click();
               
      
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone 12 (256GB) - Blue");
        
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        driver.findElement(By.xpath("//span[normalize-space()='Apple iPhone 12 (256GB) - Blue']")).click();
        Thread.sleep(5000);
        
        
        driver.quit();
	}

	

}
