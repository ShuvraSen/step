package step_definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Log_In_Page;
import static org.junit.Assert.assertEquals;

public class Log_step extends Base{
	
	Log_In_Page login= new Log_In_Page();
	
	@Given("I am in login page")
	public void i_am_in_login_page() {
	    navigateURL("https://demo.openmrs.org/openmrs/login.htm");
	}
	
	@When("^I enter (.*) and (.*)$")
	public void i_enter_username_and_password(String username,String password) throws InterruptedException {
	   Thread.sleep(5000);
		login.userName(username);
	    login.sendPassword(password); 
	   
//	    String actual=null;
//	    try {
//	    	Alert alert= driver.switchTo().alert();
//	    	if(alert.getText().contains("Invalid username/password. Please try again."))
//	    		actual="fail";
//	    }catch(Exception e) {
//	    	actual="pass";
//	    }
//	    assertEquals(0, 0)
	    
	   // driver.getPageSource();
	    
	}

	@And("click on Inpatient")
	public void click_on_Inpatient() {
	    login.Impatientclick();
	}

	@And("I click on login button")
	public void i_click_on_login_button() {
	    login.logInclick();
	}

	@Then("I will be npatient Ward page")
	public void i_will_be_npatient_Ward_page() throws InterruptedException {
		
		String actual="Logged in as Super User (admin) at Inpatient Ward.";
		String expected = driver.findElement(By.xpath("//h4[normalize-space()='Logged in as Super User (admin) at Inpatient Ward.']")).getText();
		assertEquals(expected, actual);
		//login.logOutclick();
		//Thread.sleep(5000);
		
		

//		String actual="Logged in as Super User (admin) at Inpatient Ward.";
//	    String expectedResult= driver.findElement(By.xpath("//h4[normalize-space()='Logged in as Super User (admin) at Inpatient Ward.']")).getText();
//	    assertEquals(actual,expectedResult);
	}
	
	

}
