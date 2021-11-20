package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	private WebDriver driver;
	private By changePw = By.xpath("//a[contains(text(),'Trang đổi mật khẩu tài khoản')]");
	private By oldpassword = By.xpath("//input[@id='oldpassword']");
	private By newpassword = By.xpath("//input[@id='newpassword']");
	private By repassword = By.xpath("//input[@id='repassword']");
	private By submit = By.xpath("//input[@id='btnSubmit']");
			 
    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickChangPassword(){
    	WebElement clickChangPassword = driver.findElement(changePw);
		if (clickChangPassword.isDisplayed()) { 
			clickChangPassword.click();
		}			
 }	
    public void setOldPassword(String strOldPassword){    	        
        WebElement oldPasswordTxtBox = driver.findElement(oldpassword);
		if (oldPasswordTxtBox.isDisplayed())
			oldPasswordTxtBox.sendKeys(strOldPassword);
    }          
	public void setNewPassword(String strNewPassword) {
		WebElement newpasswordTxtBox = driver.findElement(newpassword);
		if (newpasswordTxtBox.isDisplayed())
			newpasswordTxtBox.sendKeys(strNewPassword);
	}
	public void setRePassword(String strRePassword){    	        
        WebElement repasswordTxtBox = driver.findElement(repassword);
		if (repasswordTxtBox.isDisplayed())
			repasswordTxtBox.sendKeys(strRePassword);
    }          
	         
	 public void clickSubmit(){
	    	WebElement sbm = driver.findElement(submit);
			if (sbm.isDisplayed()) { 
				sbm.click();
			}			
	 }	 	
	
}
	
	
