import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void testGoogle() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("foo");
        driver.findElement(By.name("btnG")).click();
        driver.quit();
    }
}
