package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**2. Get the url of the header image
 Goal: Print the url of the header image to the console
 a. Open a browser.
 b. Navigate to ‘http://alchemy.hguy.co/crm’.
 c. Get the url of the header image.
 d. Print the url to the console.
 e. Close the browser.**/
public class Activity2 {
    WebDriver driver;
    @BeforeMethod
    public void browserOpenMethod() {
        System.setProperty("webdriver.chrome.driver", ".\\ResourceFolder\\chromedriver.exe");
        driver = new ChromeDriver();
        String url = " https://alchemy.hguy.co/crm/";
        driver.get(url);
    }
    @Test
    public void getImageUrl(){
        String imageUrlName = driver.findElement(By.xpath("//div[@class='companylogo']//img")).getAttribute("src");
        System.out.println("Url of the image is : "+imageUrlName);
    }

    @AfterMethod
    public void browserCloseMethod() {
        //Close the browser
        driver.quit();
    }

}
