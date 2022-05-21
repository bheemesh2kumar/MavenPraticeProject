package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZooplaLoginPage extends BasePage {

    public ZooplaLoginPage(WebDriver driver) {
        super(driver);
    }

    //page locators


    private By signlink = By.cssSelector("#main-header > div > div > div > div.css-15p93ee.e1pptbm40 > div.css-isnxnn.e1vr5mi20 > ul > li.css-1k8v4mq.e1vr5mi26 > a > div > p");
    private By EmailTextbox = By.cssSelector("input[data-testid='email-field-input']");
    private By PwdTextbox = By.cssSelector("input[data-testid='password-field']");
    private By Signbutton = By.cssSelector("button[data-testid='signin-button']");

    public By getSignlink() {
        return signlink;
    }

    public By getEmailTextbox() {
        return EmailTextbox;
    }

    public By getPwdTextbox() {
        return PwdTextbox;
    }

    public By getSignbutton() {
        return Signbutton;
    }


    public void doLoginpage() {

        doClick(getSignlink());
        doSendKeys(getEmailTextbox(), "manu.bheemesh@gmail.com");
        doSendKeys(getPwdTextbox(), "@satyarao1");
        doClick(getSignbutton());

    }


}
