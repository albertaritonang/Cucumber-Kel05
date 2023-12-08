//*Test Case 1*//

/*Variansi 1*/
/*package stepDefinition_Registrasi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrasiTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/register");		
		}
		
		@When("^I fills all required fields$")
		public void I_fills_all_required_and_fields() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("@Samuel Sibuea");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sam@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"nohp\"]")).sendKeys("081266420245");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sam123");
		}
		
		@And("I click the create account button")
		public void I_Click_The_Create_Account_Button() {
	        WebElement createAccountButton = 
	        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[5]/button"));
	        createAccountButton.click();
		}
	}*/


/*Variansi 2*/
/*package stepDefinition_Registrasi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrasiTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/register");		
		}
		
		@When("^I fills all required fields$")
		public void I_fills_all_required_and_fields() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("@Samuel Sibuea");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("samgmail.com");
			driver.findElement(By.xpath("//*[@id=\"nohp\"]")).sendKeys("081266420245");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sam123");
		}
		
		@And("I click the create account button")
		public void I_Click_The_Create_Account_Button() {
	        WebElement createAccountButton = 
	        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[5]/button"));
	        createAccountButton.click();
		}
	}*/





//*Test Case 2*//
/*Variansi 1*/
/*package stepDefinition_Registrasi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrasiTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/register");		
		}
		
		@When("^I fills all required fields$")
		public void I_fills_all_required_and_fields() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("@Gabriel Sigalingging");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gab@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"nohp\"]")).sendKeys("081266420247");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("gab123");
		}
		
		@And("I click the create account button")
		public void I_Click_The_Create_Account_Button() {
	        WebElement createAccountButton = 
	        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[5]/button"));
	        createAccountButton.click();
		}
	}*/


/*Variansi 2*/
/*package stepDefinition_Registrasi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrasiTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/register");		
		}
		
		@When("^I fills all required fields$")
		public void I_fills_all_required_and_fields() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("@Gabriel Sigalingging");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gabgmail.com");
			driver.findElement(By.xpath("//*[@id=\"nohp\"]")).sendKeys("081266420247");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("gab123");
		}
		
		@And("I click the create account button")
		public void I_Click_The_Create_Account_Button() {
	        WebElement createAccountButton = 
	        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[5]/button"));
	        createAccountButton.click();
		}
	}*/


/*Test Case 3*/
/*package stepDefinition_Registrasi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrasiTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/register");		
		}
		
		@When("^I fills all required fields$")
		public void I_fills_all_required_and_fields() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("@Fransiska");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("siska@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"nohp\"]")).sendKeys("081266420257");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("siska123");
		}
		
		@And("I click the create account button")
		public void iClickTheCreateAccountButton() {
	        WebElement createAccountButton = 
	        driver.findElement(By.cssSelector("/html/body/section/div/div/div[2]/div/form/div[5]/button"));
	        createAccountButton.click();
		}
	}*/



/*Test Case 4*/
/*package stepDefinition_Registrasi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrasiTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/register");		
		}
		
		@When("^I fills all required fields$")
		public void I_fills_all_required_and_fields() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("@Juan Carlos");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("juan@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"nohp\"]")).sendKeys("081366420257");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("juan123");
		}
		
		@And("I click the create account button")
		public void iClickTheCreateAccountButton() {
	        WebElement createAccountButton = 
	        driver.findElement(By.cssSelector("/html/body/section/div/div/div[2]/div/form/div[5]/button"));
	        createAccountButton.click();
		}
	}*/


/*Test Case 5*/
/*package stepDefinition_Registrasi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrasiTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/register");		
		}
		
		@When("^I fills all required fields$")
		public void I_fills_all_required_and_fields() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("@Agus Sitorus");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("agus@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"nohp\"]")).sendKeys("081356420257");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("agus123");
		}
		
		@And("I click the create account button")
		public void iClickTheCreateAccountButton() {
	        WebElement createAccountButton = 
	        driver.findElement(By.cssSelector("/html/body/section/div/div/div[2]/div/form/div[5]/button"));
	        createAccountButton.click();
		}
	}*/


/*Test Case 6*/
/*package stepDefinition_Registrasi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrasiTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/register");		
		}
		
		@When("^I fills all required fields$")
		public void I_fills_all_required_and_fields() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("@Theofil Oktafia");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("theo@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"nohp\"]")).sendKeys("081156420257");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("theo123");
		}
		
		@And("I click the create account button")
		public void iClickTheCreateAccountButton() {
	        WebElement createAccountButton = 
	        driver.findElement(By.cssSelector("/html/body/section/div/div/div[2]/div/form/div[5]/button"));
	        createAccountButton.click();
		}
	}*/


/*Test Case 7*/
/*package stepDefinition_Registrasi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrasiTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/register");		
		}
		
		@When("^I fills all required fields$")
		public void I_fills_all_required_and_fields() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("@Tesya Siahaan");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("tesya@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"nohp\"]")).sendKeys("081356420252");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("tesya123");
		}
		
		@And("I click the create account button")
		public void I_Click_The_Create_Account_Button() {
	        WebElement createAccountButton = 
	        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[5]/button"));
	        createAccountButton.click();
		}
	}*/




