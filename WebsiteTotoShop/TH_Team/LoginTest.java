package TH_Team;

import org.testng.annotations.Test;
import Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TH_Team.ListenerTest.class)
public class LoginTest extends Astractclass {
	LoginPage loginPg;
		
	@BeforeMethod
	public void beforeMethod() {		
		driver.navigate().to("https://totoshop.vn/user/signin");
		
	}
	
	@AfterMethod
	  public void afterMethod() {		
		String actualUrl= "https://totoshop.vn/";
        String expectedUrl= driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
        	 System.out.println("Dang nhap thanh cong!");        
        }
        else { 
        	System.out.println("Dang nhap that bai!");
        }        
	}
	
	@Test(priority = 1)
	public void login_01_withEmpty() throws InterruptedException {		
		loginPg = new LoginPage(driver);
		loginPg.login("", "");		
	} 
	
	@Test(priority = 2)
	public void login_02_withUsername() throws InterruptedException {	
		loginPg = new LoginPage(driver);
		loginPg.login("xuanthu800@gmail.com", "");		       	
	}
	
	@Test(priority = 3)
	public void login_03_withPassword() throws InterruptedException {			
        loginPg = new LoginPage(driver);
		loginPg.login("", "xuanthu2021");
	}
	
	@Test(priority = 4)
	public void login_04_WrongUsername() throws InterruptedException{			
        loginPg = new LoginPage(driver);
		loginPg.login("xuanthu@gmail.com", "xuanthu2021");
		
        Thread.sleep(2000);
        driver.switchTo().alert().accept();        
	}
	
	@Test(priority = 5)
	public void login_05_WrongPassword() throws InterruptedException{		
		loginPg = new LoginPage(driver);
		loginPg.login("xuanthu800@gmail.com", "xuanthu2022");
		  
        Thread.sleep(2000);
        driver.switchTo().alert().accept();                   
	}
	
	@Test(priority = 6)
	public void login_06_Success() throws InterruptedException {
		loginPg = new LoginPage(driver);
		loginPg.login("xuanthu800@gmail.com", "xuanthu20211");		
        Thread.sleep(1000);
	}		
}
