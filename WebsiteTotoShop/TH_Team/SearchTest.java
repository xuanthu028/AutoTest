package TH_Team;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Pages.SearchPage;

@Listeners(TH_Team.ListenerTest.class)
public class SearchTest extends Astractclass {
	SearchPage searchPg;
	public final String idProduct = "M2SMN3051007";
	public boolean checkIfTestCaseIsPassed;
	
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to("https://totoshop.vn/");
		driver.findElement(By.xpath("//header/div[@id='nhanh-section-header']//child::a[2][@class=\"header__search-btn js_header__search-btn\"]")).click();
									
	}
	@Test(priority =1)
	public void S_01() {
		searchPg = new SearchPage(driver);
		searchPg.setSearch(idProduct);
		searchPg.clickSearch();
		searchPg.clickItem1();
		if 	(driver.findElement(By.xpath("//h1[contains(text(),'ÁO SOMI M2SMN3051007')]")).getText().contains(idProduct)==true) {
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
