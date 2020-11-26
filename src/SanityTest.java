import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanityTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://aisqa.dhanushinfotech.com/");
		
		
		driver.findElement(By.id("username")).sendKeys("admin@anmol.com");
		driver.findElement(By.id("password")).sendKeys("98765");
		driver.findElement(By.tagName("button")).click();
		
		String url = driver.getCurrentUrl();
		if(url.equals("http://aisqa.dhanushinfotech.com/")) { 
		System.out.println("Login Successful: Passed");
		}
		else {
			System.out.println("Login Unsuccesful: Failed");
		}
		
	}

}
