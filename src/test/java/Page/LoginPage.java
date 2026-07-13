package Page;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//Testing Git Push
public class LoginPage {
    public WebDriver driver;

    private By Username = By.xpath("//input[@placeholder='Username']");
    private By Password = By.xpath("//input[@placeholder='Password']");
    private By Login_Btn = By.xpath("//button[normalize-space()='Login']");


    Public LoginPage(WebDriver driver) {
        this.driver = driver;
        return null;

    }


    void enterUserName(String username) {
        driver.findElement(Username).sendKeys("username");

    }

    void enterPassword(String pwd) {
        driver.findElement(Password).sendKeys("pwd");
    }
    void clickLogin() {
        driver.findElement(Login_Btn).click();

    }
}


