package vtiger_scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utilities.Base_test;
import Framework_utilities.Utility_Methods;
import WEbelement_repository.Base_page;

public class Register_fromEXCEL_sheetTest extends Base_test{
@DataProvider(name="testdata")
public Object[][] testdata() throws IOException{
	Object[][] data=Utility_Methods.get_Test_Data("register");
	return data;
}
	
	@Test(dataProvider="testdata")
	public void login(String name,String name1,String email,String Password,String confirm_Password) throws InterruptedException, IOException {
	Base_page page=new Base_page(driver);
	page.register();
	page.firstname(name);
	page.lastname(name1);
	page.Email(email);
	page.password(Password);
	page.confirm_password(confirm_Password);
	Thread.sleep(2000);
	//Utility_Methods.take_screeshot();
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	File ss=ts.getScreenshotAs(OutputType.FILE);
//	File destination=new File("./screenshot/ss1.png");
//	FileHandler.copy(ss, destination);
	page.register_button();
	Thread.sleep(2000);
	
	}
}
