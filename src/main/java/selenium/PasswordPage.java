package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordPage {
    private final WebDriver driver;

    public PasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPassword() {
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Kuba565!\n");
    }
}
