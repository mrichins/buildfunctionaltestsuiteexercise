import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void testGoogle() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Page page = new Page(driver);
        ResultsPage resultsPage = new ResultsPage(driver);
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        page.search("foo");
        Thread.sleep(1000);
        assert(resultsPage.getResultsElement().isDisplayed());
        driver.quit();
    }
}
