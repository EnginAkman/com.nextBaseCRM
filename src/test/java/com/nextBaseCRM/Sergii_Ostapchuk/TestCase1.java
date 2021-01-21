package com.nextBaseCRM.Sergii_Ostapchuk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    public static void main(String[] args) throws InterruptedException {

            //1.Only authorized user can log in to the site
            //Authorized user opens login page successfully

            WebDriverManager.chromedriver().setup();


            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://login.nextbasecrm.com/");

            String expectedtitle="Authorization";
            String actualTitle= driver.getTitle();

            if(actualTitle.equals(expectedtitle)){
                System.out.println("Test Passed");
            }else{
                System.out.println("Test failed");
            }

            Thread.sleep(5000);
            driver.close();

        }

    }

