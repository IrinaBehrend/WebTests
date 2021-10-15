import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {

    @Test
    public void testOne() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        //Thread.sleep(5000);

        String actualResult = driver.getCurrentUrl();
        //Assert.assertEquals(actualResult, expectedResult);

        driver.close();
        driver.quit();

    }

}




