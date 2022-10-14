import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo\\Drivers\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    Set<String>allWh = driver.getWindowHandles();
    int count = allWh.size();
    System.out.println(count);
    for(String text:allWh)
    {
    	System.out.println(text);
    
    }
    driver.quit();
    
    
}

}
