package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    @FindBy(xpath ="//input[@href=\"/register\"]" )
    WebElement buttonRegister;
    @FindBy(xpath = "//input[@id=\"gender-female\"]")
    WebElement radioFemale;
    @FindBy(xpath = "//input[@id=\"FirstName\"]")
    WebElement firstName;
    @FindBy(xpath = "//input[@id=\"LastName\"]")
    WebElement lastName;
    @FindBy(xpath = "//input[@id=\"Email\"]")
    WebElement email;
    @FindBy(xpath = "//input[@id=\"Password\"]")
    WebElement password;
    @FindBy(xpath = "//input[@id=\"ConfirmPassword\"]")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@id=\"register-button\"]")

    WebElement registerButton;
    public void setRegisterButton(){
        registerButton.click();}
    public void setFirstName(String str){
        firstName.sendKeys(str);
    }
    public void setLastName(String str){
        lastName.sendKeys(str);}
    public void setEmail(String str){
        email.sendKeys(str);}
    public void setPassword(String str){
        password.sendKeys(str);}

public void setConfirmPassword(String str){
    confirmPassword.sendKeys(str);}


}


