package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/jakub/ChromeWebDriver/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        PasswordPage passwordPage = new PasswordPage(driver);
        LoggedMailPage loggedMailPage = new LoggedMailPage(driver);
        ComposeMailPage composeMailPage = new ComposeMailPage(driver);

        mainPage.open();
        Thread.sleep(2000);

        mainPage.clickSignIn();
        Thread.sleep(2000);

        loginPage.enterLogin();
        Thread.sleep(2000);

        passwordPage.enterPassword();
        Thread.sleep(4000);


        loggedMailPage.clickCompose();
        Thread.sleep(4000);

        composeMailPage.enterRecipient();

        composeMailPage.enterMessageBody();

        composeMailPage.clickSendButton();

    }
}