package utildriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonRegistrationTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        driver = new ChromeDriver();
    }

    @Test
    public void registerUser() {
        // Navigate to Amazon.in
        driver.get("https://www.amazon.in/");

        // Click on the "Hello, Sign in" button
        WebElement signInButton = driver.findElement(By.id("nav-link-accountList"));
        signInButton.click();

        // Click on "Create your Amazon account"
        WebElement createAccountButton = driver.findElement(By.id("createAccountSubmit"));
        createAccountButton.click();

        // Fill in registration details (replace these values with actual data)
        WebElement nameField = driver.findElement(By.id("ap_customer_name"));
        nameField.sendKeys("Your Name");

        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys("your.email@example.com");

        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("yourpassword");

        WebElement confirmPasswordField = driver.findElement(By.id("ap_password_check"));
        confirmPasswordField.sendKeys("yourpassword");

        // Click on the "Create your Amazon account" button
        WebElement createAccountSubmitButton = driver.findElement(By.id("continue"));
        createAccountSubmitButton.click();
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

