import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory {

    public static WebDriver createNewDriver(String webDriverName) {
        return createNewDriver(webDriverName, null);
    }

    public static WebDriver createNewDriver(String webDriverName, MutableCapabilities options) {
        if (webDriverName.equalsIgnoreCase(Browsers.CHROME.toString())) {
            WebDriverManager.chromedriver().setup();
            return options != null ? new ChromeDriver((ChromeOptions) options) : new ChromeDriver();
        }

        if (webDriverName.equalsIgnoreCase(Browsers.FIREFOX.toString())) {
            WebDriverManager.firefoxdriver().setup();
            return options != null ? new FirefoxDriver((FirefoxOptions) options) : new FirefoxDriver();
        }
        return null;
    }
}



