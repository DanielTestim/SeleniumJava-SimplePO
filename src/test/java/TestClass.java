import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

//@Listeners({Listeners.TestNGListners.class})

public class TestClass {
	
	@Description("Verify home page title")
	@Story("Test verify base page title")
	@Test ()
	public void test_02() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		driver.get("http://google.com");
		
	//	driver.manage().window().maximize();
		Thread.sleep(3000);
        driver.quit();

	}
}
