//*Test Case 1*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("user@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("user123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("userr@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("user1234");
	}
	
	@When("I click the submit button")
	public void i_Click_The_Submit_Button() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("user@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("user1234");
	}
	
	@When("I click the submit button")
	public void i_Click_The_Submit_Button() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("userr@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("user123");
	}
	
	@When("I click the submit button")
	public void i_Click_The_Submit_Button() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 2*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("saii@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("saii123");
	}
	

	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("saii1@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("saii1233");
	}
	

	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("saii@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("saii1231");
	}
	

	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("saii1@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("saii123");
	}
	

	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 3*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("sarah@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("sarah123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("sarah3@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("sarah2123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("sarah@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("saraah123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("saraah@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("sarah123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/




//*Test Case 4*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("emy@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("emy123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("emyyy@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("emy5123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("emy@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("emy1238");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("emy9@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("emy123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/


//*Test Case 5*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("renova@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("renova123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("renovau@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("renovai123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("renova@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("renovat123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("renovba@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("renova123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/


//*Test Case 6*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("mesya@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("mesya123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("mesya2@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("mesya1223");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("mesya@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("mes2ya123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("mesyaaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("mesya123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

//*Test Case 7*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("amanda@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("amanda123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("amaxnda@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("amaxnda123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("amanda@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("amanda12e3");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("amanrda@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("amanda123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/


//*Test Case 8*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("cici@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("cici123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("cwici@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("cici1s23");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("cici@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("ciciy123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("cicik@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("cici123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 9*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("lovinta@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("lovinta123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("lovintaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("lovintaa123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("lovinta@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("lovinta1123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("lovintaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("lovinta123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 10*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("ester@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("ester123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("esterr@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("ester1r23");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("ester@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("ester1e23");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("esrter@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("ester123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/




//*Test Case 11*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("maria@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("maria123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("mariaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("mariaa123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("maria@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("mariaa123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("mariaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("maria123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 12*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("angel@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("angel123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("angell@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("angell123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("angel@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("angel1w23");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("angell@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("angel123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 13*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("lawy@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("lawy123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("lawyy@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("lawy1y\23");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("lawy@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("lawy5123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("lawy@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("lawyy123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/


//*Test Case 14*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("megi@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("megi123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("megii@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("megi1223");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("megi@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("megiyy123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("megiyy@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("megi123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 15*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("mega@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("mega123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("megaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("megaa123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("mega@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("mega2123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("megak@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("mega123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 16*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("albert@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("albert123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("albertt@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("albertt123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("albert@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("alberrt123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("albertt@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("albert123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 17*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("luana@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("luana123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("luanaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("luanaa123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("luana@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("luanass123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("luanaaaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("luana123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 18*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("oliv@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("oliv123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("olivv@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("oliv1523");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("oliv@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("olivn123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("olivvv@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("oliv123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 19*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("lina@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("lina123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("linaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("linaa123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("lina@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("linad123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("linaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("lina123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 20*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("putri@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("putri123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("putrii@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("putri5123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("putri@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("putri4123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("putriii@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("putri123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/




//*Test Case 21*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("claudia@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("claudia123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("claoudia@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("claudiia123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("claudia@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("claaudia123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("claudiaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("claudia123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/





//*Test Case 22*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("rian@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("rian123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("riian@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("riaan123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("rian@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("riann123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("riannn@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("rian123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/




//*Test Case 23*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("fritz@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("fritz123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("ffritz@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("ffritz123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("fritz@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("fritzz123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("fritzz@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("fritz123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/





//*Test Case 24*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("yosafat@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("yosafat123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi2*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("yossafat@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("yoosafat123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("yosafat@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("yossafat123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("yosaaafat@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("yosafat123");
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
	}
}*/



//*Test Case 25*//

/*Variansi1*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("kia@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("kia123");
	}
	
	@When("I click the submit button")
    public void i_Click_The_Submit_Button() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
		}
}*/


/*Variansi2*/
package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("kia1@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("kia1234");
	}
	
	@When("I click the submit button")
    public void i_Click_The_Submit_Button() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
		}
}


/*Variansi3*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("kia@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("kia1234");
	}
	
	@When("I click the submit button")
    public void i_Click_The_Submit_Button() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
		}*/
	

/*Variansi4*/
/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("kiaa@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("kia123");
	}
	
	@When("I click the submit button")
    public void i_Click_The_Submit_Button() {
        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
        submitButton.click();
		}
}*/












