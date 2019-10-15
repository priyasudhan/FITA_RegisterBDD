package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumbertest {
WebDriver driver;
	
	@Given("^User launching demo automation site$")
	public void user_launches_demo_automation_site() throws Throwable
	{
		System.out.println("launch browser");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kittan\\Desktop\\Selenium Jar\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/");
	driver.manage().window().maximize();

	}
	@When("^User is display with Skip sign in and Sign In button$")
	public void Skip_signin()
	{
		
	}
	@Then ("^Click Skip sign In$")
	public void click_signin()
	{
	driver.findElement(By.xpath("//button[@id='btn2']")).click();
	}
	
}
