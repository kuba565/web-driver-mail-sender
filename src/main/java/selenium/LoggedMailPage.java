package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedMailPage {
    private final WebDriver driver;

    public LoggedMailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCompose() {
        WebElement composeButton = driver.findElement(By.xpath("//*[contains(text(), 'COMPOSE')]"));
        composeButton.click();
    }
}
