import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> windowids= driver.getWindowHandles();
         Iterator<String> itr = windowids.iterator();
         String mainwindowid = itr.next();
         String childwindowid =itr.next();
         driver.switchTo().window(childwindowid);
         String firstParaOnChildWindow  = driver.findElement(By.id("para1")).getText();
         String secondParaOnChildWindow = driver.findElement(By.id("para2")).getText();
         
         System.out.println(firstParaOnChildWindow);
         System.out.println(secondParaOnChildWindow);
       
         driver.switchTo().window(mainwindowid);
         driver.close();
         
	}
	

}
