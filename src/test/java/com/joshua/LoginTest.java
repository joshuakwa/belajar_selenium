package com.joshua;

import com.joshua.page.HomePage;
import com.joshua.page.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginTest {
    public static WebDriver driver;

    @Test
    public void Login_test(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.goToLoginPage();
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();

        homePage.validateOnHomePage();

        driver.quit();
    }
}
