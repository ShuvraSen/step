 package pages;

import org.openqa.selenium.By;

import base.Base;

public class Log_In_Page extends Base{
	By user= By.id("username");
	By password= By.id("password");
	By impatientText= By.id("Inpatient Ward");
	By log_in_button= By.id("loginButton");
	By log_out_button= By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a");
	
	public void userName(String userName) {
		sendKeys(user, userName);
	}
	public void sendPassword(String userPassword) {
		sendKeys(password, userPassword);
	}
	public void Impatientclick() {
		click(impatientText);
	}
	public void logInclick() {
		click(log_in_button);
		////h4[normalize-space()="Logged in as Super User (admin) at Inpatient Ward."]
	}
	public void logOutclick() {
		click(log_out_button);
		
	}
	
	
	
	
	

	

}
