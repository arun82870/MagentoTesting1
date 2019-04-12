

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	@Test
	public void validLogin() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://magento.com");
		// welcome class call
		Welcome w=new Welcome(driver);
		w.clickonMyAccount();
		// login class call
		Login l=new Login(driver);
		l.typeEmail();
		l.typePassword();
		l.clickonlogin();
		// home class call
		Home h=new Home(driver);
		h.clickonlogout();
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
