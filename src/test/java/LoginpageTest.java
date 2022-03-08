import base.Basepage;
import base.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;


public class LoginpageTest {

    WebDriver driver;
    Basepage basepage;
    LoginPage loginpage;
    Properties prop;

    @BeforeMethod()
    public void openBrowser(){
        basepage=new Basepage();

        prop=basepage.initialiseProperties();

        String browser = prop.getProperty("browser");
        driver = basepage.initialise(browser);
        String url = prop.getProperty("url");
        driver.get(url);
        loginpage= new LoginPage(driver);
    }

    @Test(priority = 1)
    public void verifyLoginPageTitleTest()
    {
        Assert.assertEquals(loginpage.getPageTitle(), "nopCommerce demo store. Login",
                "Login page title not correct.");

    }

    @Test (priority = 2)
    public void loginTest(){
        loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
    }
}
