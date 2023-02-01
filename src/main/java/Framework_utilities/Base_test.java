package Framework_utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;



public class Base_test {
public WebDriver driver;

@BeforeClass
public void BrowserSetup() throws IOException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	String url = Utility_Methods.Test_Configeration();
	driver.navigate().to(url);
	System.out.println(driver.getTitle());
	String title =driver.getTitle();
	SoftAssert ast=new SoftAssert();
	ast.assertEquals(title, "Demo Web Shop");
	if(title.equalsIgnoreCase("Demo Web Shop")) {
		System.out.println("Demo webshop successfully launched");
        }
    else {
    	System.out.println("Demo webshop launching unccessful");
    }
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}


@AfterClass
public void teardown() {
	driver.quit();
}
}
