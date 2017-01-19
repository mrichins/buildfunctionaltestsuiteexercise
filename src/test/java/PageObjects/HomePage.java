package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void search(String searchString){
        waitFindElement(By.name("q")).sendKeys(searchString);
        waitFindElement(By.name("btnG")).click();
    }

}
