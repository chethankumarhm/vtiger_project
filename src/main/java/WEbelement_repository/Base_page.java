package WEbelement_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utilities.Base_test;

public class Base_page extends Base_test{
public Base_page(WebDriver driver){
	PageFactory.initElements(driver, this);
}
	
//=================WebElements===================

@FindBy(xpath="//a[@class='ico-register']")
WebElement register;

@FindBy(xpath="//input[@id='FirstName']")
WebElement Firstname;

@FindBy(xpath="//input[@id='LastName']")
WebElement Lastname;

@FindBy(xpath="//input[@id='Email']")
WebElement Email;

@FindBy(xpath="//input[@id='Password']")
WebElement password;

@FindBy(xpath="//input[@id='ConfirmPassword']")
WebElement confirm_password;

@FindBy(xpath="//input[@id='register-button']")
WebElement register_button;
	
//===================methods====================
public void register() {
	register.click();;
}

public void firstname(String name) {
	Firstname.sendKeys(name);;
}

public void lastname(String name1) {
	Lastname.sendKeys(name1);
}

public void Email(String name1) {
	Email.sendKeys(name1);
}

public void password(String Password) {
	password.sendKeys(Password);
}

public void confirm_password(String confirm_Password) {
	confirm_password.sendKeys(confirm_Password);
}

public void register_button() {
	register_button.click();;
}
}
