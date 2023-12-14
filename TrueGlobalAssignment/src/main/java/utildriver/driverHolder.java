package utildriver;

import org.openqa.selenium.WebDriver;

public class driverHolder {
	
	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return driver.get(); 
		
		}
	
	public static void setDriver(WebDriver driver) {
		driverHolder.driver.set(driver);
	}

}
