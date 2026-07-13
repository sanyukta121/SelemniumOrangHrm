package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class base {
   protected Properties prop;
   protected WebDriver driver;
    public void setUp() throws IOException {

        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            prop.load(fis);
            //Initializing the WebDriver base on browser set in config
            String browser = prop.getProperty("browser");
                if(browser.equalsIgnoreCase("chrome")) {
                    driver = new ChromeDriver();
                }
                else if (browser.equalsIgnoreCase("firefox")) {
                    driver = new FirefoxDriver();
                } else if (browser.equalsIgnoreCase("edge")) {
                    driver = new EdgeDriver();

                }
                else {
                    throw new IllegalArgumentException("Browser not supported :" + browser );
                }
                int implicitwait = Integer.parseInt(prop.getProperty("implicitwait"));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait));
                driver.manage().window().maximize();
                driver.get(prop.getProperty("url"));
    }
    public void tearDowd() {
                if(driver!= null) {
                    driver.quit();
        }
                }
        }




