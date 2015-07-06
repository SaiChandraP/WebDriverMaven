import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setup(){
	
	driver= new FirefoxDriver();
	
	}

@Test
public void doLogin(){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://gmail.com");
	driver.findElement(By.id("Email")).sendKeys("eurodrugtrial@gmail.com");
	driver.findElement(By.id("next")).click();
	
	/*commenting to test the jenkins is working or not*/
	

}

@AfterSuite

public void teardown(){
	
	driver.quit();
}
}
