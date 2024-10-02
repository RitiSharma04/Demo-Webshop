package com.test;

import com.pom.RegistrationPage;
import com.utils.DriverUtils;
import org.junit.jupiter.api.Test;

public class RegistrationTest {
    @Test
    public void  verificationRegistration(){
        RegistrationPage registrationPage = new RegistrationPage();
        DriverUtils.getDriver().get("https://demowebshop.tricentis.com");
        registrationPage.setRegisterButton();
        registrationPage.setFirstName("Riti");
        registrationPage.setLastName("Sharma");
        registrationPage.setEmail("ritisharma0408@gmail.com");
        registrationPage.setPassword("Riti@123");
        registrationPage.setConfirmPassword("Riti@123");

    }
}
