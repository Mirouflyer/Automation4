package search;

import basic.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test
    public void searchTest(){   //search element
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER); //search element by using id locator.
//        typeOnID("twotabsearchtextbox"); //another way to look for element by using id locator.
        typeOnCSS("#twotabsearchtextbox"); //search for element by using css locator.
       //  typeOnWebElement("twotabsearchtextbox");
    }
}
