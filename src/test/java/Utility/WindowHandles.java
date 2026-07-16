package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowHandles {
    WebDriver driver;
   // private String cw;
  // Testing editing in local repository
    @Test()
    public void handleWindows() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[text() = 'New Window']")).click();

        String pw = driver.getWindowHandle();
        //  Set<String> cw1 = driver.getWindowHandles();
        // for(String cw : cw1) {
        for (String cw : driver.getWindowHandles()) {
            if (!cw.equalsIgnoreCase(pw)) {
                driver.switchTo().window(cw);
                WebElement e = driver.findElement(By.id("sampleHeading"));
                System.out.println(e.getText());
                driver.switchTo().window(pw);


            }

        }
    }
}
