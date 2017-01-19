import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void testGoogle(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        assert(driver.getCurrentUrl().contains("https://www.google.com"));
        driver.quit();
    }
}
