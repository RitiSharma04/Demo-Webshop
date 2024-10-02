package com.pom;

import com.utils.DriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    // Declaration
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement buttonLogin;

    @FindBy(xpath = "//input[@name='Email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement txtPassword;
    @FindBy(xpath = "//input[@id='RememberMe']")
    WebElement checkboxRememberMe;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement buttonLogin1;

    @FindBy(xpath = "//a[contains(@href,'https://demowebshop.tricentis.com/books?price=-25')]/span[text()='25.00']")
    WebElement buttonPrice;

    // Utilization
    public void setButtonLogin() {
        buttonLogin.click();
    }

    public void setTxtEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        txtPassword.sendKeys(password);
    }
    public void setCheckboxRememberMe() {
        checkboxRememberMe.click();
    }

    public void clickLogin() {
        buttonLogin1.click();
    }



}
