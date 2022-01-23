package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 3. Get the copyright text
 * Goal: Print the first copyright text in the footer to the console
 * a. Open a browser.
 * b. Navigate to ‘http://alchemy.hguy.co/crm’.
 * c. Get the first copyright text in the footer.
 * d. Print the text to the console.
 * e. Close the browser.
 * **/
public class Activity3 {
    WebDriver driver;
    @BeforeMethod
    public void browserOpenMethod() {
        System.setProperty("webdriver.chrome.driver", ".\\ResourceFolder\\chromedriver.exe");
        driver = new ChromeDriver();
        String url = " https://alchemy.hguy.co/crm/";
        driver.get(url);
    }
    @Test
    public void getCopyRightText(){
        String firstCopyRightText = driver.findElement(By.id("admin_options")).getText();
        System.out.println("Frist CopyRight Test is: "+firstCopyRightText);
    }

    @AfterMethod
    public void browserCloseMethod() {
        //Close the browser
        driver.quit();
    }
}
