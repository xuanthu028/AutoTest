package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;
	private By username = By.id("CustomerEmail");
	private By password = By.id("CustomerPassword");
	private By submit = By.id("btnsignin");
	
		 
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUsername(String strUserName){    	        
        WebElement usernameTxtBox = driver.findElement(username);
		if (usernameTxtBox.isDisplayed())
			usernameTxtBox.sendKeys(strUserName);
    }          
	public void setPassword(String strPassword) {
		WebElement passwordTxtBox = driver.findElement(password);
		if (passwordTxtBox.isDisplayed())
			passwordTxtBox.sendKeys(strPassword);
	}
	 public void clickSubmit(){
	    	WebElement sbm = driver.findElement(submit);
			if (sbm.isDisplayed()) {
				sbm.click();
			}
	    }
	
	 public void login(String strUserName, String strPassword) throws InterruptedException {
		this.setUsername(strUserName);
		this.setPassword(strPassword);
		this.clickSubmit();
		Thread.sleep(1000);
	}
	
}
	
	
