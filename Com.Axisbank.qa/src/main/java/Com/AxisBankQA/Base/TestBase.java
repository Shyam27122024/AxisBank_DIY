package Com.AxisBankQA.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	
	public static WebDriver driver;
	public void CrossBrowserTesting(String browser) throws EncryptedDocumentException, IOException {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\Driver\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
	   }else if(browser.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriver.gecko.driver", "D:\\Shyam\\geckodriver.exe");
		 driver = (WebDriver) new FirefoxDriver();
	   }else {
		   System.out.println("wrong browser selected");
	   }
		
//		driver.manage().deleteAllCookies();
		driver.get("http://192.168.154.183:8080/DIYPortal/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
    }

}
