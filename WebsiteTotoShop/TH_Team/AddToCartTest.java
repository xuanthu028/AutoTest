package TH_Team;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AddtoCartPage;

@Listeners(TH_Team.ListenerTest.class)
public class AddToCartTest extends Astractclass {
	AddtoCartPage addtocartPg;
	public String Tensp = "QUẦN SHORT M1SKK1061002";
	public String Solg = "1";
	public String Gia = "238,000 đ";
	public String size = "34";
	public String mau = "GR";
	
	public boolean checkIfTestCaseIsPassed;
	
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to("https://totoshop.vn/do-nam-pc72882.html");		
		driver.findElement(By.linkText("QUẦN SHORT")).click();
	}
		
	@Test(priority = 1)
	public void ATC_01() {
		addtocartPg = new AddtoCartPage(driver);
		addtocartPg.clickItem();
		addtocartPg.chooseColor();
		addtocartPg.chooseSize();
		addtocartPg.addToCart();		
		pauseWithTryCatch(1000);
		
		driver.navigate().to("https://totoshop.vn/cart");
		pauseWithTryCatch(1000);
		
		if (driver.findElement(By.xpath("//a[contains(text(),'QUẦN SHORT M1SKK1061002 - GR - 34')]")).getText().contains(Tensp+" - " + mau + " - "+size)==true 
			    || 
			    driver.findElement(By.xpath("//tbody/tr[1]//child::input")).getText().contains(Solg)==true
			    ||			    
			     driver.findElement(By.xpath("//tbody/tr[1]//td[3]")).getText().contains(Gia)==true)

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
			
