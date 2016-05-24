import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by chanakau on 5/22/2016.
 */
public class testAppTest
{
    @Test
    public void firstTest()
    {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://mail.google.com");
    }
}
