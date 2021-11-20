package TH_Team;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TH_Team.ListenerTest.class)
public class DangKiKM_Test extends Astractclass {
	
	public final String notiSuccess = "Đăng ký thành công";
	public boolean checkIfTestCaseIsPassed;
	
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to("https://totoshop.vn/");
											
	}								
	
	@Test
	public void KM_01() {
		driver.findElement(By.xpath("//body//footer[1]//child::input[@name='email']")).sendKeys("xuanthu821@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(),'GỬI')]")).click();
        pauseWithTryCatch(1000);
       
		Alert alert = driver.switchTo().alert();		
        String alertMessage= driver.switchTo().alert().getText();		
        System.out.println(alertMessage);	        		
        alert.accept();
        pauseWithTryCatch(1000);
		if 	(alertMessage.equals(notiSuccess)==true) {
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
