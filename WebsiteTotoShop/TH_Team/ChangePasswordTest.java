package TH_Team;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.ProfilePage;

@Listeners(TH_Team.ListenerTest.class)
public class ChangePasswordTest extends Astractclass {
		LoginPage loginPg;
		ProfilePage profilePg;
		String notiSuccess = "Đổi mật khẩu tài khoản thành công";
		String notiOldpass = "Bạn chưa nhập Mật khẩu cũ";
		String notiNewdpass = "Bạn chưa nhập Mật khẩu mới";
		String notiRepass = "Bạn chưa nhập Xác nhận mật khẩu";
		String notiWrongFormatPass = "Mật khẩu phải có từ 6 kí tự trở lên";
		String notiWrongRepass = "Xác nhận mật khẩu không chính xác";
		
		public boolean checkIfTestCaseIsPassed;
		@BeforeClass
		public void beforeMethod() throws InterruptedException {
			driver.navigate().to("https://totoshop.vn/user/signin");
//			driver.findElement(By.xpath("//header/div[@id='nhanh-section-header']//child::i[@class=\"fa fa-user-circle\"]")).click();
			loginPg = new LoginPage(driver);
			loginPg.login("xuanthu800@gmail.com", "xuanthu20211");
			pauseWithTryCatch(1000);
			driver.findElement(By.xpath("//header/div[@id='nhanh-section-header']//child::i[@class=\"fa fa-user-circle\"]")).click();
		}
		@Test(priority = 1)
		public void CP01_Failed_EmptyInput() {
			profilePg = new ProfilePage(driver);
			profilePg.clickChangPassword();
			profilePg.setOldPassword("");
			profilePg.setNewPassword("");
			profilePg.setRePassword("");
			profilePg.clickSubmit();
			
			if (driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập Mật khẩu cũ')]")).getText().equals(notiOldpass)==true
				&& driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập Mật khẩu mới')]")).getText().equals(notiNewdpass)==true
				&& driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập Xác nhận mật khẩu')]")).getText().equals(notiRepass)==true){
				this.checkIfTestCaseIsPassed=true;
			    if (this.checkIfTestCaseIsPassed) {
			        Assert.assertFalse(false);
			        System.out.println("Test Passed!");
			    }
			    else {
			    	Assert.assertFalse(true);
			    }
			} 
		}
		@Test(priority = 2)
		public void CP02_Failed_WrongFormatPass() {
			profilePg = new ProfilePage(driver);
			profilePg.clickChangPassword();
			profilePg.setOldPassword("xuanthu20211");
			profilePg.setNewPassword("xuan");
			profilePg.setRePassword("xuan");
			profilePg.clickSubmit();
			
			if (driver.findElement(By.xpath("//li[contains(text(),'Mật khẩu phải có từ 6 kí tự trở lên')]")).getText().equals(notiWrongFormatPass)==true){
				this.checkIfTestCaseIsPassed=true;
			    if (this.checkIfTestCaseIsPassed) {
			        Assert.assertFalse(false);
			        System.out.println("Test Passed!");
			    }
			    else {
			    	Assert.assertFalse(true);
			    }
			} 
		}
		@Test(priority = 3)
		public void CP03_Failed_WrongRepass() {
			profilePg = new ProfilePage(driver);
			profilePg.clickChangPassword();
			profilePg.setOldPassword("xuanthu20211");
			profilePg.setNewPassword("xuanthu2021");
			profilePg.setRePassword("xuanthu");
			profilePg.clickSubmit();
			
			if (driver.findElement(By.xpath("//li[contains(text(),'Xác nhận mật khẩu không chính xác')]")).getText().equals(notiWrongRepass)==true){
				this.checkIfTestCaseIsPassed=true;
			    if (this.checkIfTestCaseIsPassed) {
			        Assert.assertFalse(false);
			        System.out.println("Test Passed!");
			    }
			    else {
			    	Assert.assertFalse(true);
			    }
			} 
		}
		@Test(priority = 4)
		public void CP_04_Success() {
			profilePg = new ProfilePage(driver);
			profilePg.clickChangPassword();
			profilePg.setOldPassword("xuanthu20211");
			profilePg.setNewPassword("xuanthu2021");
			profilePg.setRePassword("xuanthu2021");
			profilePg.clickSubmit();
			
			if (driver.findElement(By.xpath("//p[contains(text(),'Đổi mật khẩu tài khoản thành công')]")).getText().equals(notiSuccess)==true) {
				this.checkIfTestCaseIsPassed=true;
			    if (this.checkIfTestCaseIsPassed) {
			        Assert.assertFalse(false);
			        System.out.println("Test Passed!");
			    }
			    else {
			    	Assert.assertFalse(true);
			    }
			} 		       
		}
		
		
	
}
	
	
	
	
		

