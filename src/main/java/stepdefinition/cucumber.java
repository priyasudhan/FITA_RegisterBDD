package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class cucumber {
	WebDriver driver;
	
	@Given("^User launches demo automation site$")
	public void user_launches_demo_automation_site() throws Throwable
	{
		System.out.println("launch browser");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kittan\\Desktop\\Selenium Jar\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/");
	driver.manage().window().maximize();

	}
	@When("^User is displayed with Skip sign in and Sign In button$")
	public void Skip_signin()
	{
		
	}
	@Then ("^Click on Skip sign In$")
	public void click_signin()
	{
	driver.findElement(By.xpath("//button[@id='btn2']")).click();
	}
	
	@Then ("^Enter the value for first name \"(.*)\"$")
	public void first_name(String fname)
	{
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);	
	}
	@And("^Enter the value for last name \"(.*)\"$")
	public void last_name(String lname)
	{
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);	
	}
	@And("^Enter the value for address \"(.*)\"$")
	public void address(String address)
	{
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);		
	}
	@And("^Enter the value for email \"(.*)\"$")
	public void email(String email)
	{
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(email);	
	}
	@And("^Enter the value for phone \"(.*)\"$")
	public void phone(String phone)
	{
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(phone);
	}
	@And("^Select the \"(.*)\" option$")
	public void gender(String Gender)
	{ 
		if(Gender.equals("Male"))
		{
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		}
		if(Gender.equals("Female"))
		{
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		}
	}
	@And("^Select the Hobbies as \"(.*)\" and \"(.*)\"$")
	public void hobbies(String cricket, String Movies) throws Throwable
	{
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		}
	@And("^Select the Languages as \"(.*)\"$")
	public void language(String Languages)
	{
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
	    driver.findElement(By.xpath("//a[text()='English']")).click();
		
	}
	@And("^Select the skills as \"(.*)\"$")
	public void skills()
	{
		Select drd=new Select(driver.findElement(By.xpath("//select[contains(@class, 'form-control')]")));
		drd.selectByVisibleText("C");
		}
	@And("^Select the Country as \"(.*)\"$")
	public void country()
	{
		Select drd1=new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		drd1.selectByVisibleText("India");
		}


	@And("^Select the Select Country as \"(.*)\"$")
	public void scountry()
	{
		Select drd1=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		drd1.selectByVisibleText("India");

	}
	@And("^Select the Year as \"(.*)\"$")
	public void year()
	{
		Select drd3=new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		drd3.selectByVisibleText("2015");

	}
	@And("^Select the Month as \"(.*)\"$")
	public void month()
	{
		Select drd3=new Select(driver.findElement(By.xpath("//select[@id='Month']")));
		drd3.selectByVisibleText("October");
	}
	@And("^Select the Day as \"(.*)\"$")
	public void day()
	{
		Select drd3=new Select(driver.findElement(By.xpath("//select[@id='Day']")));
		drd3.selectByVisibleText("6");
	}
	@And("^Enter the Password as \"(.*)\"$")
	public void pw(String pw)
	{
		driver.findElement(By.id("firstpassword")).sendKeys(pw);
	}
	@And("^Enter the Confirm Password as \"(.*)\"$")
	public void cpw(String cpw)
	{
		driver.findElement(By.id("secondpassword")).sendKeys("P@$$W0rd");
	}
	@And("^Click on \"(.*)\" button$")
	public void submit()
	{	
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
}
