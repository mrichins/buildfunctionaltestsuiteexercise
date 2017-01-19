import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
    private WebDriver driver;

    Page(WebDriver driver){
        this.driver = driver;
    }

    public void search(String searchString){
        driver.findElement(By.name("q")).sendKeys(searchString);
        driver.findElement(By.name("btnG")).click();
    }

}
