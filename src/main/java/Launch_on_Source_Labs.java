import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Launch_on_Source_Labs {

WebDriver driver;
    @BeforeClass
    public void setUp(){
     DesiredCapabilities caps = DesiredCapabilities.chrome();
     caps.setCapability("platform", "Windows 7");
     caps.setCapability("version", "71.0");
     try {
         driver = new RemoteWebDriver(new URL("http://vhl232:e8c0f0c2-6406-40ee-9afa-a86d668ab490@ondemand.saucelabs.com:80/wd/hub"),caps);
     }
     catch (MalformedURLException e) {
         e.printStackTrace();
     }
    }

    @Test
    public void test1(){
       driver.get("https://www.google.com.ua");
       String title = driver.getTitle();
        System.out.println(title);
       //Assert.assertEquals();
    }

    @AfterClass
    public void close(){
        driver.quit();
    }
}
