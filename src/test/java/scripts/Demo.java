package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod()
    {
WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test()
    {
        driver.navigate().to("https://www.google.com");
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
