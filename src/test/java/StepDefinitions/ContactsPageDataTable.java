//package StepDefinitions;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class ContactsPageDataTable {
//	WebDriver driver;
//	
//	@Given("user is on Login Page")
//	public void user_is_on_Login_Page()  {
//		driver=new ChromeDriver();
//		driver.get("https://classic.freecrm.com/index.html");
//		System.out.println("User is on the login page");
//		
//	}
//	
//	@When("^Title of the page is Free CRM$")
//	public void title_of_the_page_is_Free_CRM() {
//		 String title=driver.getTitle();
//		   System.out.println(title);
//		 Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", title);
//	}
//	@Then("^user enters \\\"(.*)\\\" and \\\"(.*)\\\"$")
//	public void user_enters_username_and_password(String uname,String pwd) {
//		driver.findElement(By.name("username")).sendKeys(uname);
//		driver.findElement(By.name("password")).sendKeys(pwd);
//		
//	  
//	}
//
//	@And("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//	    System.out.println("user clicks on Login button");
//	}
//	@Then("^user is on Home Page$")
//	public void user_is_on_Home_Page() {
//		String title=driver.getTitle();
//		 Assert.assertEquals("CRMPRO",title);
//	}
//	
//	@Then("^user move to new contact page$")
//	public void user_move_to_new_contact_page() throws InterruptedException { 
//		driver.switchTo().frame("mainpanel");
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//		
//		String title=driver.getTitle();
//	 Assert.assertEquals("CRMPRO",title);
//	}
//
//	@Then("^user enters contacts details \\\"(.*)\\\" and \\\"(.*)\\\" and \\\"(.*)\\\"$")
//	public void user_enters_contacts_details_and_and(String firstname, String lastname, String position) {
//		//driver.switchTo().frame("leftpanel");
//	   
//	 driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);
//	 driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(lastname);
//	 driver.findElement(By.xpath("//input[@id='company_position']")).sendKeys(position);
//	}
//	@Then("^close the browser$")
//	public void close_the_browser() {
//	    driver.close();
//	}
//
//
//
//}
