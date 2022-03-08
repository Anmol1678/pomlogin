package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Basepage {
    WebDriver driver;
    Properties prop;

    public WebDriver initialise(String browserName) {
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("edge")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else {
            System.out.println(browserName + "Browser invalid, enter valid browser name");

        }
        return driver;
    }

    public Properties initialiseProperties() {

        prop = new Properties();

        try{
            FileInputStream ip= new FileInputStream("C:\\Users\\Surface Laptop\\IdeaProjects\\NewPomFramework3\\src\\test\\resources\\TestData\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}










