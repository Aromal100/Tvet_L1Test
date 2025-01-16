package testObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class collegeCreation extends BasePage {

	public collegeCreation(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='Colleges']")
	WebElement college;
	
	public void college()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(college));
		college.click();
	}
	
	@FindBy(xpath="//span[text()='Add New Colleges']")
	WebElement addnewcollege;
	
	public void addnewcollege()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(addnewcollege));
		addnewcollege.click();
	}
	
	//page1
	@FindBy(id="organization_name")
	WebElement collegename;
	public void collegename(String name)
	{
		collegename.sendKeys(name);
	}
	
	@FindBy(id="domain_name")
	WebElement domainname;
	public void domainname(String name)
	{
		domainname.sendKeys(name);
	}
	
	@FindBy(id="organization_code")
	WebElement organizationcode;
	public void organizationcode(String no)
	{
		organizationcode.sendKeys(no);
	}
	
	@FindBy(id="organization_email")
	WebElement collegemail;
	public void collegemail(String name)
	{
		collegemail.sendKeys(name);
	}
	
	@FindBy(id="phone_number")
	WebElement phone;
	public void phone(String no)
	{
		phone.sendKeys(no);
	}
	
	@FindBy(id="assign_organization_manager")
	WebElement adminemail;
	public void adminemail(String name)
	{
		adminemail.sendKeys(name);
	}
	
	@FindBy(id="year_of_establishment")
	WebElement doe;
	public void doe()
	{
		
		String month="ህዳር";
		String year="2017";
		String date="1";
		
		doe.click();
		while(true)
		{
			String activeyear=driver.findElement(By.xpath("//*[@id=\"activeyear\"]")).getText();//2017
			String activemonth=driver.findElement(By.xpath("//*[@id=\"activemonth\"]")).getText();//ህዳር
			
			if(activeyear.equals(year) && activemonth.equals(month) )
			{
				break;
			}
			
			driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		}
		
     List<WebElement> dates=driver.findElements(By.xpath("//*[@class='col f-05 d-flex flex-row justify-content-center']/button"));
     for(WebElement d:dates)//list of dates
     {
    	 if(d.getText().equals(date))
    	 {
    		 d.click();
    		 break;
    	 }
     }
	}
	
	@FindBy(id="ownership")
	WebElement ownership;
	public void ownership()
	{
		Select s= new Select(ownership);
		s.selectByValue("government_");
	}
	
	@FindBy(id="tvet_college_type")
	WebElement collegetype;
	public void collegetype()
	{
		Select s= new Select(collegetype);
		s.selectByValue("2");
	}
	
	@FindBy(xpath="//*[text()='Save & Next']")
     WebElement save1;
	public void save1()
	{
		save1.click();
	}
	
//page2
	@FindBy(id="sub_city")
	WebElement subcity;
	public void subcity()
	{
		Select s= new Select(subcity);
		s.selectByValue("84");
	}
	
	@FindBy(id="woreda")
	WebElement woreda;
	public void woreda()
	{
		Select s= new Select(woreda);
		s.selectByValue("785");
	}
	
	@FindBy(id="logo_1")
	WebElement logo;
	public void logo()
	{
		 String pic="C://Users//RESBEE-218//Downloads//argentino-barcelona-celebracion-futbolista-wallpaper-preview.jpg";
			
		 logo.sendKeys(pic);
	}
	
	@FindBy(xpath="//*[text()='Save & Next']")
    WebElement save2;
	public void save2()
	{
		save2.click();
	}
	
	//page3
	@FindBy(id="inspection_level")
	WebElement inspectionlevel;
	public void inspectionlevel()
	{
		Select s= new Select(inspectionlevel);
		s.selectByValue("level_1");
	}
   
	@FindBy(id="training_delivery_program")
	WebElement program;
	public void program()
	{
		Select s= new Select(program);
		s.selectByValue("P_30");
	}
	
	@FindBy(id="special_need_delivery_method")
	WebElement specialneed;
	public void specialneed()
	{
		Select s= new Select(specialneed);
		s.selectByValue("inclusive_training");
	}
	
	@FindBy(xpath="//*[text()='Save & Next']")
    WebElement save3;
	public void save3()
	{
		save3.click();
	}
	
	//page4
	@FindBy(id="college_library")
	WebElement collegelibrary;
	public void collegelibrary()
	{
		Select s= new Select(collegelibrary);
		s.selectByValue("available");
	}
	
	@FindBy(id="digital_library")
	WebElement digitallibrary;
	public void digitallibrary()
	{
		Select s= new Select(digitallibrary);
		s.selectByValue("available");
	}
	
	@FindBy(id="virtual_labortory")
	WebElement virtuallabortory;
	public void virtuallabortory()
	{
		Select s= new Select(virtuallabortory);
		s.selectByValue("available");
	}
	
	@FindBy(id="training_centre_")
	WebElement trainingcentre;
	public void trainingcentre()
	{
		Select s= new Select(trainingcentre);
		s.selectByValue("available");
	}
	
	@FindBy(id="ict_center")
	WebElement ictcenter;
	public void ictcenter()
	{
		Select s= new Select(ictcenter);
		s.selectByValue("available");
	}
	
	@FindBy(id="does_the_college_have_internet_NaN")
	WebElement collegeinternet;
	public void collegeinternet()
	{
		Select s= new Select(collegeinternet);
		s.selectByValue("available");
	}
	
	@FindBy(id="digital_information_collection_facility")
	WebElement digitalinformation;
	public void digitalinformation()
	{
		Select s= new Select(digitalinformation);
		s.selectByValue("available");
	}
	
	@FindBy(xpath="//*[@id=\"special_need_support_center_in_NaN\"]")
	WebElement specialneeds;
	public void specialneeds()
	{
		Select s= new Select(specialneeds);
		s.selectByValue("available");
	}
	
	@FindBy(xpath="//*[@id=\"clinicfirst_aid_service_in_NaN\"]")
	WebElement clinicfirst;
	public void clinicfirst()
	{
		Select s= new Select(clinicfirst);
		s.selectByValue("available");
	}
	
	@FindBy(xpath="//*[text()='Save']")
	WebElement save4;
	public void save4()
	{
		save4.click();
	}
	
	@FindBy(id="ekBrandName")
	WebElement title;
	
	public boolean title()
	{
		try
    	{
    		return(title.isDisplayed());
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
		
	}

}
