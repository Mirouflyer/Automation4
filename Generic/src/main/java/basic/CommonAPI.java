package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","/Users/mirouflyer/mirou-workspace/FourthAutomationProject/Generic/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

    public void typeOnID(String locator){
        driver.findElement(By.id(locator)).sendKeys("phones", Keys.ENTER);
    }

    public void typeOnCSS(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys("phones",Keys.ENTER);
    }
        public void typeOnWebElement(String locator){
            try{
               driver.findElement(By.cssSelector(locator)).sendKeys("books",Keys.ENTER);
            }catch (Exception ex){
                System.out.println("Tried with CSS,did not work.Will try with id");
                driver.findElement(By.id(locator)).sendKeys("books",Keys.ENTER);
            }
        }
}
