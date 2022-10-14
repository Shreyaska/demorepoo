import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo4 {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Take screen shots
		TakesScreenshot t= (TakesScreenshot) driver;
		File src= t.getScreenshotAs(OutputType.FILE);
		File dest = new File("Screenshot\\Screenshot3.png");
		FileHandler.copy(src, dest);
		
	
		
		
 
	
		
	    driver.quit();
	    
		
		
		
		
		
		
	}

	
	}


