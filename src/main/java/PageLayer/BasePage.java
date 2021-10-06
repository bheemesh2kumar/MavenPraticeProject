package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle() {
        return driver.getTitle();
    }

    @Override
    public String getElementText(By locator) {
        return getElement(locator).getText();
    }

    @Override
    public WebElement getElement(By locator) {
        WebElement ele = null;
        try {
            ele = driver.findElement(locator);

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("element is not initilized");
        }
        return ele;

    }

    @Override
    public void waitforWebElement(By locator) {
        try {

            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("some issue while loading element" + locator.toString());
        }

    }
}

