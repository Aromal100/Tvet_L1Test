package testCases;

import org.testng.Assert;

import com.github.javafaker.Faker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.DomainPage;
import testObjects.LoginPage;
import testObjects.collegeCreation;

public class Test_CollegeCreationTest extends DomainPage{
	
	Faker f= new Faker();
	String name=f.name().fullName();
	String ocode="S"+f.number().digits(3);
	String mail=f.internet().emailAddress();
	String admail=f.internet().emailAddress();
	String numb="9"+f.phoneNumber().subscriberNumber(9);
	
	
	
	
	@Given("the user enters the Tvet dashboard")
	public void the_user_enters_the_Tvet_dashboard()  {
		
		
		LoginPage l=new LoginPage(driver);

		boolean page=l.pagetitle();
		Assert.assertTrue(page);
	   
	}

	@Then("clicks on the college module")
	public void clicks_on_the_college_module() throws InterruptedException {
		Thread.sleep(2000);
		collegeCreation cc=new collegeCreation(driver);
		cc.college();
	   
	}

	@And("click on the add new college section")
	public void click_on_the_add_new_college_section() {
	   
		collegeCreation cc=new collegeCreation(driver);
		cc.addnewcollege();
	}

	@Then("need to fill the General information form")
	public void need_to_fill_the_general_information_form() {
	   
		collegeCreation cc=new collegeCreation(driver);
		cc.collegename(name);
		cc.domainname(name);
		cc.organizationcode(ocode);
		cc.collegemail(mail);
		cc.phone(numb);
		cc.adminemail(admail);
		cc.doe();
		cc.ownership();
		cc.collegetype();
		cc.save1();
		
	}

	@Then("need to fill the Contact info form")
	public void need_to_fill_the_contact_info_form() throws InterruptedException {
		Thread.sleep(2000);
		collegeCreation cc=new collegeCreation(driver);
		cc.subcity();
		cc.woreda();
		cc.logo();
		cc.save2();
	   
	}

	@Then("need to fill the Training info form")
	public void need_to_fill_the_training_info_form() throws InterruptedException {
		Thread.sleep(2000);
		collegeCreation cc=new collegeCreation(driver);
		cc.inspectionlevel();
		cc.specialneed();
		cc.program();
		cc.save3();
	   
	}

	@Then("need to fill the College facility form")
	public void need_to_fill_the_college_facility_form() throws InterruptedException {
		Thread.sleep(2000);
		collegeCreation cc=new collegeCreation(driver);
		cc.collegelibrary();
		cc.digitallibrary();
		cc.virtuallabortory();
		cc.trainingcentre();
		cc.ictcenter();
		cc.collegeinternet();
		cc.digitalinformation();
		cc.specialneeds();
		cc.clinicfirst();
		cc.save4();
	   
	}

	@And("the college creation is complete")
	public void the_college_creation_is_complete() {
	   
	   System.out.println("College has been created");
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void collgeLoginTest() throws InterruptedException
//	{
//		
//		Faker f= new Faker();
//		String name=f.name().fullName();
//		String ocode="S"+f.number().digits(3);
//		String mail=f.internet().emailAddress();
//		String admail=f.internet().emailAddress();
//		String numb="9"+f.phoneNumber().subscriberNumber(9);
//		
//		LoginPage l=new LoginPage(driver);
//		l.login();
//		l.email(p.getProperty("email"));
//		l.submit();
//		Thread.sleep(2000);
//		l.pass(p.getProperty("pass"));
//		l.cont();
//		boolean page=l.pagetitle();
//		Assert.assertTrue(page);
//		Thread.sleep(2000);
//		collegeCreation cc=new collegeCreation(driver);
//		cc.college();
//		cc.addnewcollege();
//  //page1
//		Thread.sleep(2000);
//		cc.collegename(name);
//		cc.domainname(name);
//		cc.organizationcode(ocode);
//		cc.collegemail(mail);
//		cc.phone(numb);
//		cc.adminemail(admail);
//		cc.doe();
//		cc.ownership();
//		cc.collegetype();
//		cc.save1();
//	//page2
//		Thread.sleep(2000);
//		cc.subcity();
//		cc.woreda();
//		cc.logo();
//		cc.save2();
//	//page3
//		Thread.sleep(2000);
//		cc.inspectionlevel();
//		cc.specialneed();
//		cc.program();
//		cc.save3();
//	//page4
//		Thread.sleep(2000);
//		cc.collegelibrary();
//		cc.digitallibrary();
//		cc.virtuallabortory();
//		cc.trainingcentre();
//		cc.ictcenter();
//		cc.collegeinternet();
//		cc.digitalinformation();
//		cc.specialneeds();
//		cc.clinicfirst();
//		cc.save4();
//		
//		
//		
//		
//	}

}
