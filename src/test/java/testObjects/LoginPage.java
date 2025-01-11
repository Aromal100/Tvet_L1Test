package testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement login;
	public void login()
	{
		login.click();
	}
	
	@FindBy(id="email")
	WebElement email;
	public void email(String name)
	{
		email.sendKeys(name);
	}
	
	@FindBy(id="SubmitBtn")
	WebElement submit;
	public void submit()
	{
		submit.click();
	}
	
	@FindBy(id="password")
	WebElement pass;
	public void pass(String name)
	{
		pass.sendKeys(name);
	}
	
	@FindBy(id="continueBtn")
	WebElement cont;
	public void cont()
	{
		cont.click();
	}
	
	@FindBy(id="ekBrandName")
	WebElement pagetitle;
    public boolean pagetitle()
    {
    	try
    	{
    		return(pagetitle.isDisplayed());
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
		
    	
    }
}
