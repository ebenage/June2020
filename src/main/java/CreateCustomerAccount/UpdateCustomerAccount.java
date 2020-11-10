package CreateCustomerAccount;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateCustomerAccount {
   
static WebDriver driver;
	
	
	@Before
	public void launchWedsite() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prof. Eben\\eclipse-Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/billing/?ng=admin/");
		driver.manage().window().maximize();
		
    }
	@Test
	public void logInToWebsite() {
		
		driver.get("https://techfios.com/test/billing/?ng=admin/");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
	 /*@After
	public void loginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		//Thread.sleep(2000);
	 }*/
	public void addCustomerContact() {
		
		
	}
	
	
	public void validate() {
		
		
	}
	
	
	/*public void tearDownWedsite() {
		
		//driver.close();
	}*/
}