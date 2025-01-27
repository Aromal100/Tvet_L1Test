package testCases;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.DomainPage;
import testObjects.LoginPage;


public class Test_TvetLoginTest extends DomainPage {
	
	@Given("user enters the tvet domain page")
	public void user_enters_the_tvet_domain_page() throws IOException {
	   
		super.setup();
	}

	@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		LoginPage l=new LoginPage(driver);

		l.login();
	}

	@Then("user enters the {string}")
	public void user_enters_the(String username) throws InterruptedException {
	   
		Thread.sleep(2000);
		LoginPage l=new LoginPage(driver);

		l.email(username);
		
	}
	


	@And("click on the submit button")
	public void click_on_the_submi_button() {
	   
		LoginPage l=new LoginPage(driver);

		l.submit();
	}

	@Then("user need to enter the {string}")
	public void user_need_to_enter_the(String password) throws InterruptedException {
	   
		Thread.sleep(2000);
		LoginPage l=new LoginPage(driver);

		l.pass(password);
	}


	@And("click on the continue button")
	public void click_on_the_continue_button() {
		LoginPage l=new LoginPage(driver);

		l.cont();
	   
	}

	@Then("user enters in Tvet dashborad")
	public void user_enters_in_tvet_dashborad() {
		LoginPage l=new LoginPage(driver);

		boolean page=l.pagetitle();
		Assert.assertTrue(page);
	   
	}

	
	

}
