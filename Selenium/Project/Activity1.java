package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Activity1 {
/**1. Verify the website title
    Goal: Read the title of the website and verify the text
    a. Open a browser.
    b. Navigate to ‘http://alchemy.hguy.co/crm’.
    c. Get the title of the website.
    d. Make sure it matches “SuiteCRM” exactly.
    e. If it matches, close the browser.
**/

WebDriver driver;
@BeforeMethod
public void browserOpenMethod() {
    System.setProperty("webdriver.chrome.driver", ".\\ResourceFolder\\chromedriver.exe");
    driver = new ChromeDriver();
    String url = " https://alchemy.hguy.co/crm/";
    driver.get(url);
}
    @Test
    public void VerifyTitle(){
    String expectedTitle = "SuiteCRM";
    String actualTitle = driver.getTitle();
        assertEquals(expectedTitle,actualTitle);
    }

    @AfterMethod
    public void browserCloseMethod() {
        //Close the browser
        driver.quit();
    }
}
