import PageObjects.HomePage;
import PageObjects.ResultsPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
    public WebDriver driver;
    public HomePage homePage;
    public ResultsPage resultsPage;


    @Before
    public void before(){
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        resultsPage = new ResultsPage(driver);
    }

    @After
    public void after(){
        driver.quit();
    }
}
