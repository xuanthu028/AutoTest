package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCartPage {
	private WebDriver driver;
	
	 
	public AddtoCartPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clickItem() {
    	WebElement clickItem = driver.findElement(By.xpath("//body/div[@id='MainContent']//child::img[@class='fitted-image swatches-32237761 lazyautosizes ls-is-cached lazyloaded']"));
		if (clickItem.isDisplayed())
			clickItem.click();
		
    }
    public void chooseColor() {
    	WebElement chooseColor = driver.findElement(By.xpath("//body/div[@id='MainContent']//child::img[@alt='GR']"));
		if (chooseColor.isDisplayed())
			chooseColor.click();
		
    }
    public void chooseSize() {
    	WebElement chooseSize = driver.findElement(By.linkText("34"));
		if (chooseSize.isDisplayed())
			chooseSize.click();
		
    }
    public void addToCart() {
    	WebElement addToCart = driver.findElement(By.xpath("//span[contains(text(),'Thêm vào giỏ')]"));
		if (addToCart.isDisplayed())
			addToCart.click();
		
    }
    

}
