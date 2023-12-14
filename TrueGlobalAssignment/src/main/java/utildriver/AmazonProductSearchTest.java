package utildriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonProductSearchTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        driver = new ChromeDriver();
    }

    @Test
    public void searchAndAddToCart() {
        // Navigate to Amazon.in
        driver.get("https://www.amazon.in/");

        // Search for iPhone
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iPhone");
        searchBox.submit();

        // Select the first result
        WebElement firstResult = driver.findElement(By.cssSelector("div[data-asin][data-index='0']"));
        firstResult.click();

        // Get the price and store in a variable
        WebElement priceElement = driver.findElement(By.id("priceblock_ourprice"));
        String price = priceElement.getText();

        // Add to cart
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
