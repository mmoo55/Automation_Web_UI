package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Chrome implements IBrowser {

    @Override
    public WebDriver create() {
        /*System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");*/
        /*System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");*/

        /*WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        driver.manage().window().maximize();*/

        WebDriver driver = null;
        WebDriverManager.chromedriver().browserVersion("108.0.5359.124").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);

        return driver;
    }
}
