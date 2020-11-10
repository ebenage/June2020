package launchBrowser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWithJunit {
	
static WebDriver driver;
	
	@Before
	public void launchWedsite() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prof. Eben\\eclipse-Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		
	}
	
	/*public void verifyTitleMatch() {
		driver.getTitle();
		System.out.println(driver.getTitle());
	}*/
	@Test
	public void loginTest() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'content\']/form/div[7]/input")).sendKeys("Ebenezer");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[10]/input")).sendKeys("ADGY");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[13]/input")).sendKeys("pw");
		driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"exp-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"profession-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"site_content\"]/div[1]/h4[1]/a")).click();
		
		
		Thread.sleep(2000);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
