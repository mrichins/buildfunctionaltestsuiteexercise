import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage {
    private WebDriver driver;
    ResultsPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getResultsElement(){
        return driver.findElement(By.id("resultStats"));
    }
}
