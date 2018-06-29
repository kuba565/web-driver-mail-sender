package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterLogin(){
        WebElement usernameField = driver.findElement(By.id("identifierId"));
        usernameField.sendKeys("janwebdriver\n");
    }
}
