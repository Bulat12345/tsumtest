import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class qwerty {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
    }
    public void close(){
        driver.quit();
    }
}
