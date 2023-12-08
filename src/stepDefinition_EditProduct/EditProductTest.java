/*1*/
/*package stepDefinition_AddProduct;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddProductTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");		
		}
		
		@When("^I login as an Admin$")
		public void I_login_as_an_Admin() throws Throwable {
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("admin@gmail.com");
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("admin123");
		}
		
		@When("^I click the ECommerce menu$")
		public void I_click_the_ECommerce_menu() throws Throwable {
	        WebElement EcommerceMenu = 
	        driver.findElement(By.xpath("//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[3]/a"));EcommerceMenu.click();
		}
		
		@When("^I click the Produk button$")
		public void i_Click_The_Produk_Button() throws Throwable {
	        WebElement ProdukButton = 
	        driver.findElement(By.xpath("//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[3]/ul/li/a"));ProdukButton.click();
		}
		
		@When("^I click the Add Product Package button$")
		public void I_click_the_Add_Product_Package_button() throws Throwable {
	        WebElement AddProductPackageButton = 
	        driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/a"));AddProductPackageButton.click();
		}
		
		@When("^I fill in the product details$")
		public void I_fill_in_the_product_details() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[1]/div/div/input")).sendKeys
			("Ayam Goreng");
			driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/select")).sendKeys
			("Paket Makanan");
			driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[3]/div/div/input")).sendKeys
			("15000");
			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea4\"]")).sendKeys("Ayam yang di goreng dengan bumbu");
			driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[5]/div/div/input")).sendKeys
			("ayam.jpeg");
		}
		
		@When("^I click the Add button$")
		public void I_click_the_Add_button() throws Throwable {
	        WebElement AddButton = 
	        driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[6]/div/div/button"));AddButton.click();
		}
		
		@Then("^I see Product added successfully message$")
		public void I_see_Product_added_successfully_message() throws Throwable {
	        WebElement AddButton = 
	        driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div[1]"));AddButton.click();
		}
	}*/


/*2*/
package stepDefinition_EditProduct;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditProductTest {

		WebDriver driver;

		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");		
		}
		
		@When("^I login as an Admin$")
		public void I_login_as_an_Admin() throws Throwable {
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("admin@gmail.com");
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("admin123");
		}
		
		
		@When("I click the submit button")
	    public void i_Click_The_Submit_Button() {
	        WebElement submitButton = driver.findElement(By.cssSelector("body > section > div > div > div.col-xl-7.p-0 > div > form > div:nth-child(6) > button"));
	        submitButton.click();
			}
		
		@When("^I click the drop down ECommerce menu$")
		public void I_click_the_drop_down_ECommerce_menu() throws Throwable {
	        WebElement EcommerceMenu = 
	        driver.findElement(By.xpath("//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[3]/a"));EcommerceMenu.click();
		}
		
		@When("^I click the Produk button$")
		public void i_Click_The_Produk_Button() throws Throwable {
	        WebElement ProdukButton = 
	        driver.findElement(By.xpath("//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[3]/ul/li/a"));ProdukButton.click();
		}
		
		@When("^I click the update button$")
		public void I_click_the_update_button() throws Throwable {
	        WebElement UpdateButton = 
	        driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[6]/div/a[1]/svg"));UpdateButton.click();
		}
		
		@When("^I fill in the product details$")
		public void I_fill_in_the_product_details() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[1]/div/div/input")).sendKeys
			("Dekorasi Ultah");
			driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/select")).sendKeys
			("Paket Dekorasi");
			driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[3]/div/div/input")).sendKeys
			("1000000");
			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea4\"]")).sendKeys("Dekorasi ulangtahun simple");
		}
		
		@When("^I click the choose file button$")
		public void I_click_the_choose_file_button() throws Throwable {
			WebElement ChooseFileButton =
			        driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[5]/div/div/input"));ChooseFileButton.click();
				}
		
		@When("^I upload product image$")
		public void I_upload_the_product_image() throws Throwable {
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\\\"pageWrapper\\\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[5]/div/div/input"));
			fileInput.sendKeys("C:\\Users\\User\\Downloads\\pict\\dekor.jpeg");
		}
		
		@When("^I click the Add button$")
		public void I_click_the_Add_button() throws Throwable {
	        WebElement AddButton = 
	        driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/form/div[6]/div/div/button"));AddButton.click();
		}
		
		@Then("^I see Product added successfully message$")
		public void I_see_Product_added_successfully_message() throws Throwable {
	        WebElement SeeProduct = 
	        driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div[1]"));SeeProduct.click();
		}
	}


