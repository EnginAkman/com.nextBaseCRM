package com.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRMUtils {

    public static void CRMLogin(WebDriver driver) {

        WebElement usernameInbox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInbox.sendKeys("helpdesk43@cybertekschool.com");

        WebElement passwordInbox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInbox.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }
}
