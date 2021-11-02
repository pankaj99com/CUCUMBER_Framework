//package StepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DealsPageUsingDataTableAsMap {
//	WebDriver driver;
//
//	@Given("user is already on Login Page")
//	public void user_is_already_on_Login_Page() {
//		System.out.println("BROWSER will Opened");
//		driver = new ChromeDriver();
//		driver.get("https://classic.freecrm.com/login.cfm");
//	}
//
//	@When("Title of the page is Free CRM")
//	public void title_of_the_page_is_Free_CRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
//
//	@Then("user enters username and password")
//	public void user_enters_username_and_password(DataTable credentials) {
//		List<Map<String,String>> data=credentials.asMaps(String.class,String.class);
//		driver.findElement(By.xpath("//input[@placeholder='Login']")).sendKeys(data.get(0).get("username"));
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(0).get("password"));
//
//	}
//
//	@Then("user clicks on login button")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//	}
//
//	@Then("user is on Home Page")
//	public void user_is_on_Home_Page() {
//		System.out.println(driver.getTitle());
//		Assert.assertEquals(driver.getTitle(), "CRMPRO");
//		
//	}
//
//	@Then("user move to new deals page")
//	public void user_move_to_new_deals_page() throws InterruptedException {
//		
//		driver.switchTo().frame("mainpanel");
//		
//		WebElement deals = driver.findElement(By.xpath("//a[normalize-space()='Deals']"));
//		
//		try {
//			Actions action = new Actions(driver);
//			action.moveToElement(deals).click();
//
//			action.moveToElement(deals).click(driver.findElement(By.xpath(" //a[normalize-space()='New Deal']"))).build()
//					.perform();
//			
//		} catch (StaleElementReferenceException e) {
//			driver.get(driver.getCurrentUrl());
//			Actions action = new Actions(driver);
//			action.moveToElement(deals).click();
//			Thread.sleep(4000);
//
//			action.moveToElement(deals).click(driver.findElement(By.xpath(" //a[normalize-space()='New Deal']"))).build()
//					.perform();
//		}
//		
//
//			
//			
//		}
//	
//
//	@Then("user provide deal details")
//	public void user_provide_deal_deatails(DataTable data) throws InterruptedException {
//
//		//data.asMaps(keyType, valueType)
//		List<Map<String,String>> userList=data.asMaps(String.class,String.class);
//		System.out.println(userList.size());
//		for(int i=0;i<userList.size();i++) {
//			
//		
//		driver.findElement(By.id("title")).sendKeys(userList.get(i).get("title"));
//		driver.findElement(By.id("amount")).sendKeys(userList.get(i).get("amount"));
//		driver.findElement(By.id("probability")).sendKeys(userList.get(i).get("probabilty"));
//		driver.findElement(By.id("commission")).sendKeys(userList.get(i).get("commission"));
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//		WebElement deals=driver.findElement(By.xpath("//a[normalize-space()='Deals']"));
//		Actions action=new Actions(driver);
//		action.moveToElement(deals).click();
//		
//	
//	action.moveToElement(deals).click(driver.findElement(By.xpath(" //a[normalize-space()='New Deal']"))).build().perform();
//	Thread.sleep(2000);
//	}
//	}
//
//	@Then("close the browser")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}
