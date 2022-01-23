package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * 5. Getting colors
 * Goal: Get the color of the navigation menu
 * a. Open a browser.
 * b. Navigate to ‘http://alchemy.hguy.co/crm’ and login using the credentials
 * provided.
 * c. Get the color of the navigation menu and print it to the console.
 * d. Close the browser.
 * **/
public class Activity5 {
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
    public void getColourOfNavBar(){
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
        WebElement toolbar = driver.findElement(By.id("toolbar"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(toolbar));
        String navBarColor = toolbar.getCssValue("color");
        System.out.println("Color of the Navigation Bar :"+navBarColor);
    }

    @AfterMethod
    public void browserCloseMethod() {
        //Close the browser
        driver.quit();
    }
}
