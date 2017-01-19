import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void testGoogle() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Page page = new Page(driver);
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        page.search("foo");
        driver.quit();
    }
}
