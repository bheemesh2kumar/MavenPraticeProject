package RegressionTests;


import PageLayer.BasePage;
import PageLayer.Page;
import PageLayer.ZooplaLoginPage;
import Utilities.SingleTonUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;
    public ZooplaLoginPage ZooplaLoginPageref;
    BasePage BasePageref;


    @BeforeMethod
    public void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.zoopla.co.uk/");
        driver.manage().window().maximize();
        BasePageref = new BasePage(driver);
        //BasePageref = (BasePage) SingleTonUtility.initobject(new BasePage(driver));
        ZooplaLoginPageref = BasePageref.getInstance(ZooplaLoginPage.class);
        ZooplaLoginPageref.doLoginpage();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
