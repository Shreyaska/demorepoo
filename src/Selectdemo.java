import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdemo {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Demo\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.omayo.blogspot.com");
	driver.manage().window().maximize();
	
	
	WebElement ele= driver.findElement(By.id("multiselect1"));

	
	
	Select sel= new Select(ele);
	sel.selectByVisibleText("Volvo");
	sel.selectByVisibleText("Audi");
	
	Thread.sleep(7000);
	
	driver.close();	
	

}
}
