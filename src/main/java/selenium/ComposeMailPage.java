package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComposeMailPage {
    private final WebDriver driver;

    public ComposeMailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterRecipient() {
        WebElement recipientField = driver.findElement(By.name("to"));
        recipientField.sendKeys("kuba565@gmail.com");
    }

    public void enterMessageBody() {
        WebElement messageBody = driver.findElement(By.xpath("//div[@aria-label='Message Body']"));
        messageBody.sendKeys("Hej!\nTo e-mail testowy.\nPozdrawiam\nJakub");
    }

    public void clickSendButton() {
        WebElement sendButton = driver.findElement(By.xpath("//*[contains(text(), 'Send')]"));
        sendButton.click();
    }
}
