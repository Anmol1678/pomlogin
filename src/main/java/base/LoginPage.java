package base;

import Utilitis.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public  class LoginPage {

    WebDriver driver;
    Utils utils;

    By byEmail = By.id("Email");
    By byPassword = By.id("Password");
    By byLoginButton = By.className("login-button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils (driver);
    }

        public String getPageTitle (){
            String title = driver.getTitle();
            System.out.println ("login page title is:" + title);
            return title;

        }
        public void doLogin(String username , String password) {
           utils.doSendKeys(byEmail,username);
           utils.doSendKeys(byPassword,password);
           utils.doclick(byLoginButton);
        }
}



