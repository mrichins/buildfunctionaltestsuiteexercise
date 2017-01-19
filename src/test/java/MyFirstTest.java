import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {
    WebDriver driver;
    HomePage homePage;
    ResultsPage resultsPage;


    @Before
    public void before(){
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        resultsPage = new ResultsPage(driver);
    }

    @Test
    public void testGoogle() throws InterruptedException {
        driver.get("https://www.google.com");
        homePage.search("foo");
        assert(resultsPage.getResultsElement().isDisplayed());
    }

    @After
    public void after(){
        driver.quit();
    }
}
