package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		launchWedsite();
		loginTest();
		tearDown();
		
	}

	public static void launchWedsite() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prof. Eben\\eclipse-Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();

	}
	
	public static void loginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	
	
	public static void tearDown() {
		driver.close();
	}
}
