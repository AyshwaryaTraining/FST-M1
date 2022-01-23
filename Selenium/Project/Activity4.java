package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * 4. Logging into the site
 * Goal: Open the site and login with the credentials provided
 * a. Open the browser
 * b. Navigate to ‘https://alchemy.hguy.co/crm’.
 * c. Find and select the username and password fields
 * d. Enter login credentials into the respective fields
 * e. Click login
 * f. Verify that the homepage has opened.
 * g. Close the browser.
 * **/
public class Activity4 {
    WebDriver driver;
    @BeforeMethod
    public void browserOpenMethod() {
        System.setProperty("webdriver.chrome.driver", ".\\ResourceFolder\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = " https://alchemy.hguy.co/crm/";
        driver.get(url);
    }
    @Test
    public void loginMethod() throws InterruptedException {
        WebElement userName = driver.findElement(By.id("user_name"));
        WebElement userPassword = driver.findElement(By.id("username_password"));
        WebElement loginButton = driver.findElement(By.id("bigbutton"));
        //Enter user name
        userName.sendKeys("admin");
        //Enter user password
        userPassword.sendKeys("pa$$w0rd");
        //Click on Login button
        loginButton.click();
        //Verify page title
        WebElement menu = driver.findElement(By.id("grouptab_0"));
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menu));
        action.moveToElement(menu).moveToElement(driver.findElement(By.id("moduleTab_9_Home"))).click().build().perform();

        wait.until(ExpectedConditions.titleIs("Home » SuiteCRM"));
        System.out.println("Page title is :" +driver.getTitle());

    }

    @AfterMethod
    public void browserCloseMethod() {
        //Close the browser
        driver.quit();
    }
}
