package vtiger_scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utilities.Base_test;
import WEbelement_repository.Base_page;

public class register extends Base_test{

@DataProvider(name="testdata")
public Object[][] testdata(){
	Object[][] data=new Object[5][5];
	data[0][0]="chethan";
	data[0][1]="kumarhm";
	data[0][2]="chethankumarhmm@gmail.com";
	data[0][3]="123456";
	data[0][4]="123456";
	data[1][0]="manoj";
	data[1][1]="kumarhm";
	data[1][2]="manoj@123";
	data[1][3]="123457";
	data[1][4]="123457";
	return data;
}



@Test(dataProvider="testdata")
public void login(String name,String name1,String email,String Password,String confirm_Password) throws InterruptedException {
Base_page page=new Base_page(driver);
page.register();
page.firstname(name);
Thread.sleep(2000);
page.lastname(name1);
Thread.sleep(2000);
page.Email(email);
Thread.sleep(2000);
page.password(Password);
Thread.sleep(2000);
page.register_button();
}
}
