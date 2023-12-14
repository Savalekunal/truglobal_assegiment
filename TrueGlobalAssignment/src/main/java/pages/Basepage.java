package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
	
	public static WebDriver driver;
	
	   public Basepage(WebDriver driver) {
		   Basepage.driver = driver;
       }
	 // Explicit Wait
	public void waitUntilElementVisible(By by) {
	    WebDriverWait wait = new WebDriverWait(driver, 60);
	    wait. until(ExpectedConditions.visibilityOfElementLocated(by));
	 }
	
	public void waitUntilElementClickable(By by) {
	    WebDriverWait wait = new WebDriverWait(driver, 60);
	    wait.until(ExpectedConditions.elementToBeClickable(by));
	 }
	
	    public void clickonElement (By by) {
	        waitUntilElementClickable(by);
	         driver. findElement(by).click();
	     }
	    
	    public void enterdata(By by, String text) {
	        waitUntilElementVisible(by);
	         driver. findElement(by).sendKeys(text);
	    }


}
