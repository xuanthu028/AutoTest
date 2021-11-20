package TH_Team;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;


import Pages.RegisterPage;

@Listeners(TH_Team.ListenerTest.class)
public class RegisterTest extends Astractclass {
	RegisterPage registerPg;
	public final String invalidName="Bạn chưa nhập Tên đầy đủ";
	public final String invalidEmail="Địa chỉ email không hợp lệ";
	public final String invalidEmail1="Bạn chưa nhập Email";
	public final String invalidPassword="Mật khẩu phải có từ 6 kí tự trở lên";
	public final String invalidPassword1="Bạn chưa nhập Mật khẩu";
	public final String invalidPhone1="Bạn chưa nhập số điện thoại";
	public final String invalidPhone= "Số điện thoại ít nhất có 10 chữ số";
	public final String invalidSuccess = "Chúc mừng bạn đã đăng ký thành công";

	public boolean checkIfTestCaseIsPassed;
	

	@BeforeMethod	
	public void beforeMethod() {
		driver.navigate().to("https://totoshop.vn/user/signup");
		
	}

	@Test(priority = 1)
	  public void R_01_Empty() throws InterruptedException {
		  registerPg = new RegisterPage(driver);
		  registerPg.register("", "", "", "");
		  if (driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập Tên đầy đủ')]")).getText().equals(invalidName)==true
				    || driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập Tên đầy đủ')]")).getText().contains(invalidName)==true 
				    && 
				    driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập Email')]")).getText().equals(invalidEmail1)==true
				    || driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập Email')]")).getText().contains(invalidEmail1)==true
				    &&
				    driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập Mật khẩu')]")).getText().equals(invalidPassword1)==true
				    || driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập Mật khẩu')]")).getText().contains(invalidPassword1)==true
				    &&
				    driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập số điện thoại')]")).getText().equals(invalidPhone1)==true
				    || driver.findElement(By.xpath("//li[contains(text(),'Bạn chưa nhập số điện thoại')]")).getText().contains(invalidPhone1)==true) {

				    this.checkIfTestCaseIsPassed=true;
					    if (this.checkIfTestCaseIsPassed) {
					        Assert.assertTrue(true);
					        System.out.println("Test Passed!");
					    }
					    else {
					    	Assert.assertFalse(true);
					    	System.out.println("Test Failed!");
					    }
				}		  		  
	  }
	  @Test(priority = 2)
	  public void R_02_WrongEmail() throws InterruptedException {
		  registerPg = new RegisterPage(driver);
		  registerPg.register("Nguyễn Xuân thu", "xuanthu", "xuanthu2021", "0389274897");
		  if (driver.findElement(By.xpath("//li[contains(text(),'Địa chỉ email không hợp lệ')]")).getText().equals(invalidEmail)==true
				    || driver.findElement(By.xpath("//li[contains(text(),'Địa chỉ email không hợp lệ')]")).getText().contains(invalidEmail)==true) {
			  this.checkIfTestCaseIsPassed=true;
			  	if (this.checkIfTestCaseIsPassed) {
			        Assert.assertTrue(true);
			        System.out.println("Test Passed!");
			    }
			    else {
			    	Assert.assertFalse(true);
			    	System.out.println("Test Failed!");
			    }
	
		  }
	  }
	  @Test(priority = 3)
	  public void R_03_WrongFormatPasspord() throws InterruptedException {	 
		  registerPg = new RegisterPage(driver);
		  registerPg.register("Nguyễn Xuân thu", "xuanthu800312341@gmail.com", "xuan", "03892874897");
		  if (driver.findElement(By.xpath("//li[contains(text(),'Mật khẩu phải có từ 6 kí tự trở lên')]")).getText().equals(invalidPassword)==true
				    || driver.findElement(By.xpath("//li[contains(text(),'Mật khẩu phải có từ 6 kí tự trở lên')]")).getText().contains(invalidPassword)==true) {
			  this.checkIfTestCaseIsPassed=true;
			  	if (this.checkIfTestCaseIsPassed) {
			        Assert.assertTrue(true);
			        System.out.println("Test Passed!");
			    }
			    else {
			    	Assert.assertFalse(true);
			    	System.out.println("Test Failed!");
			    }
	  
		  }
		  
	  }
	  @Test(priority = 4)
	  public void R_04_WrongFormatPhone() throws InterruptedException {
		  registerPg = new RegisterPage(driver);
		  registerPg.register("Nguyễn Xuân Thu", "xuanthu800312341@gmail.com", "xuanthu2021", "0389274");
		  if (driver.findElement(By.xpath("//li[contains(text(),'Số điện thoại ít nhất có 10 chữ số')]")).getText().equals(invalidPhone)==true
				    || driver.findElement(By.xpath("//li[contains(text(),'Số điện thoại ít nhất có 10 chữ số')]")).getText().contains(invalidPhone)==true) {
	
				    this.checkIfTestCaseIsPassed=true;
				    if (this.checkIfTestCaseIsPassed) {
				        Assert.assertTrue(true);
				        System.out.println("Test Passed!");
				    }
				    else {
				    	Assert.assertFalse(true);
				    	System.out.println("Test Failed!");
				    }
				}
		  	  
	  }
	  @Test(priority = 5)
	  public void R_05_Success() throws InterruptedException {
		  registerPg = new RegisterPage(driver);
		  registerPg.register("Nguyễn Xuân Thu", "xuanthu800312341@gmail.com", "xuanthu2021", "0389274897");	
		  if (driver.findElement(By.xpath("//h3[contains(text(),'Chúc mừng bạn đã đăng ký thành công')]")).getText().equals(invalidSuccess)==true
				    || driver.findElement(By.xpath("//h3[contains(text(),'Chúc mừng bạn đã đăng ký thành công')]")).getText().contains(invalidSuccess)==true) {	
			this.checkIfTestCaseIsPassed=true;
			if (this.checkIfTestCaseIsPassed) {
		        Assert.assertTrue(true);
		        System.out.println("Test Passed!");
		    }
		    else {
		    	Assert.assertFalse(true);
		    	System.out.println("Test Failed!");
		    }
		  }
	
	  } 
}
