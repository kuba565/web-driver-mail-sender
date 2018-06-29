package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get("http://www.gmail.com");
    }

    public void clickSignIn(){
        WebElement loginButton = driver.findElement(By.className("gmail-nav__nav-link__sign-in"));
        loginButton.click();
    }
}
