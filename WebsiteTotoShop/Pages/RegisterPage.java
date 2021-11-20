package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	private WebDriver driver;
	private By fullname = By.id("fullName");
	private By email = By.id("email");
	private By password = By.id("password");
	private By phone = By.id("mobile");
	private By submit = By.id("btnSubmit");
		 
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void setFullname(String strFullname){    	        
        WebElement usernameTxtBox = driver.findElement(fullname);
		if (usernameTxtBox.isDisplayed())
			usernameTxtBox.sendKeys(strFullname);
    }          
	public void setEmail(String strEmail) {
		WebElement passwordTxtBox = driver.findElement(email);
		if (passwordTxtBox.isDisplayed())
			passwordTxtBox.sendKeys(strEmail);
	}
	public void setPassword(String strPassword){    	        
        WebElement usernameTxtBox = driver.findElement(password);
		if (usernameTxtBox.isDisplayed())
			usernameTxtBox.sendKeys(strPassword);
    }          
	public void setPhone(String strPhone){    	        
        WebElement usernameTxtBox = driver.findElement(phone);
		if (usernameTxtBox.isDisplayed())
			usernameTxtBox.sendKeys(strPhone);
    }          
	 public void clickSubmit(){
	    	WebElement sbm = driver.findElement(submit);
			if (sbm.isDisplayed()) { 
				sbm.click();
			}			
	 }	 	 	 	 
	 public void register(String strFullname,String strEmail, String strPassword,String strPhone) 
			 				throws InterruptedException {
		this.setFullname(strFullname);
		this.setEmail(strEmail);
		this.setPassword(strPassword);
		this.setPhone(strPhone);
		this.clickSubmit();
		Thread.sleep(1000);
	}
		
}
	
	
