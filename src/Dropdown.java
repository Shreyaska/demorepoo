import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
		
		public static void main(String args[]) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.omayo.blogspot.com");
			
			driver.manage().window().maximize();
			
			WebElement dropdownField = driver.findElement(By.id("drop1"));
			
			Select select = new Select(dropdownField);
			
			select.selectByVisibleText("doc 3");
			
		}

	}

