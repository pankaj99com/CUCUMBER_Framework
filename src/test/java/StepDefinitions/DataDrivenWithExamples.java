//package StepDefinitions;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//
//public class DataDrivenWithExamples {
//		WebDriver driver;
//		@Given("user is on login page")
//		public void verifyLoginPage() {
//			driver=new ChromeDriver();
//			driver.get("https://classic.freecrm.com/index.html");
//			System.out.println("User is on the login page");
//			
//		}
//		
//		@When("Title of the page is Free CRM")
//		public void title_of_the_page_is_Free_CRM() {
//			 String title=driver.getTitle();
//			   System.out.println(title);
//			 Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", title);
//		}
//		@Then("user enters \\\"(.*)\\\" and \\\"(.*)\\\"$")
//		public void user_enters_username_and_password(String uname,String pwd) {
//			driver.findElement(By.name("username")).sendKeys(uname);
//			driver.findElement(By.name("password")).sendKeys(pwd);
//			
//		  
//		}
//	
//		@And("clicks on login button")
//		public void clicks_on_login_button() {
//			driver.findElement(By.xpath("//input[@value='Login']")).click();
//		    System.out.println("user clicks on Login button");
//		}
//	
//		@Then("user is navigated to home page.")
//		public void user_is_navigated_to_home_page() {
//			String title=driver.getTitle();
//		 Assert.assertEquals("CRMPRO",title);
//		}
//	
//		@Then("close the browser")
//		public void close_the_browser() {
//		    driver.close();
//		}
//
//}
