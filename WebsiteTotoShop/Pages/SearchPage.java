package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	private WebDriver driver;
	 
	public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void setSearch(String strSearch){    	        
        WebElement searchTxtBox = driver.findElement(By.xpath("//input[@id='Search']"));
		if (searchTxtBox.isDisplayed())
			searchTxtBox.sendKeys(strSearch);
    }
    public void clickSearch() {
    	WebElement clickTxtBox = driver.findElement(By.xpath("//header/div[@id='nhanh-section-header']//child::button"));
		if (clickTxtBox.isDisplayed())
			clickTxtBox.click();
		
    }
    public void clickItem1() {
    	WebElement clickItem = driver.findElement(By.xpath("//div[@class=\"product-image__img-wrapper\"]//child::img"));
		if (clickItem.isDisplayed())
			clickItem.click();
		
    }
    

}
