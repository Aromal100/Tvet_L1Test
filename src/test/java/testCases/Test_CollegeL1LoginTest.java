package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import testBase.DomainPage;
import testObjects.LoginPage;
import testObjects.collegeCreation;

public class Test_CollegeL1LoginTest extends DomainPage{
	
	@Test
	public void collgeLoginTest() throws InterruptedException
	{
		
		Faker f= new Faker();
		String name=f.name().fullName();
		String ocode="S"+f.number().digits(3);
		String mail=f.internet().emailAddress();
		String admail=f.internet().emailAddress();
		String numb="9"+f.phoneNumber().subscriberNumber(9);
		
		LoginPage l=new LoginPage(driver);
		l.login();
		l.email(p.getProperty("email"));
		l.submit();
		Thread.sleep(2000);
		l.pass(p.getProperty("pass"));
		l.cont();
		boolean page=l.pagetitle();
		Assert.assertTrue(page);
		Thread.sleep(2000);
		collegeCreation cc=new collegeCreation(driver);
		cc.college();
		cc.addnewcollege();
  //page1
		Thread.sleep(2000);
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
	//page2
		Thread.sleep(2000);
		cc.subcity();
		cc.woreda();
		cc.logo();
		cc.save2();
	//page3
		Thread.sleep(2000);
		cc.inspectionlevel();
		cc.specialneed();
		cc.program();
		cc.save3();
	//page4
		Thread.sleep(2000);
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

}
