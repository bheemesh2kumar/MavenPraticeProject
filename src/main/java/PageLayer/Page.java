package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    public WebDriver driver;
    public WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }


    public abstract String getPageTitle();

    public abstract String getElementText(By locator);

    public abstract WebElement getElement(By locator);

    public abstract void waitforWebElement(By locator);

    public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> pageref) {
        try {
            return pageref.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }


}
