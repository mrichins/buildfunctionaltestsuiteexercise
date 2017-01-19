import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySecondTest extends TestBase{
    @Test
    public void testGoogle() throws InterruptedException {
        driver.get("https://www.google.com");
        homePage.search("foo");
        assert(resultsPage.getResultsElement().isDisplayed());
    }
}
