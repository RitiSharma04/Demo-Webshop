package com.test;

import com.pom.LoginPage;
import com.utils.DriverUtils;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void Verifylogin() {
        LoginPage lp = new LoginPage();
        DriverUtils.getDriver().get("https://demowebshop.tricentis.com/");
        lp.setButtonLogin();
        lp.setTxtEmail("ritisharma0408@gmail.com");
        lp.enterPassword("Riti@123");
        lp.clickLogin();
    }
}