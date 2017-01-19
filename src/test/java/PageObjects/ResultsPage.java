package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage extends BasePage {

    public ResultsPage(WebDriver driver){
        super(driver);
    }

    public WebElement getResultsElement(){
        return waitFindElement(By.id("resultStats"));
    }
}
