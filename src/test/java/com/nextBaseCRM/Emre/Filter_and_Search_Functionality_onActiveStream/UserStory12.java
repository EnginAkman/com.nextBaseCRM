package com.nextBaseCRM.Emre.Filter_and_Search_Functionality_onActiveStream;

import com.Utilities.CRMUtils;
import com.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserStory12 {


    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login2.nextbasecrm.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        CRMUtils.CRMLogin(driver);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(1000);
        driver.close();
    }

    @Test
    public void searchFunctionality(){

        //1. Verify users search by type-in keyword to search previous posts
        WebElement filterAndSearchInputBox = driver.findElement(By.xpath("//input[@id='LIVEFEED_search']"));
        filterAndSearchInputBox.sendKeys("google" + Keys.ENTER);

        System.out.println(filterAndSearchInputBox.isDisplayed());
        Assert.assertTrue(filterAndSearchInputBox.isDisplayed());

    }

    @Test
    public void SearchByEditing() throws InterruptedException {

        //2. Verify users can search by editing Date, Type, Author, To and more default dropdowns.
        WebElement filterAndSearchInputBox = driver.findElement(By.xpath("//input[@id='LIVEFEED_search']"));
        filterAndSearchInputBox.click();

        List<WebElement> ListOfEditing = driver.findElements(By.xpath("//div[@class='main-ui-filter-field-container-list']"));

        for (WebElement element : ListOfEditing) {

            element.click();

            System.out.println(element.getText());

            Thread.sleep(1000);


        }

        List<WebElement> dateDropdown = driver.findElements(By.xpath("//div[@data-name='DATE_CREATE_datesel']"));
        for (WebElement element : dateDropdown) {

            element.click();
            System.out.println(element.getText());

            Assert.assertTrue(element.isDisplayed());


            WebElement dateDropDown = driver.findElement(By.xpath("//div[@data-type='DATE']"));
            Thread.sleep(1000);
            dateDropDown.click();

        }



        WebElement typeDropdown = driver.findElement(By.xpath("//div[@class='main-ui-control main-ui-multi-select']"));
        typeDropdown.click();

        List<WebElement> typeDropdownList = driver.findElements(By.xpath("//div[@class='popup-multiselect-content']"));
        for (WebElement element : typeDropdownList) {

            element.click();
            System.out.println(element.getText());

            Assert.assertTrue(element.isDisplayed());
        }



    }

    @Test
    public void filtering() throws InterruptedException {

        //3. Users should be able to Filter by work, favorites, my activity,
        // announcement and workflow.

        WebElement filterAndSearchInputBox = driver.findElement(By.xpath("//input[@id='LIVEFEED_search']"));
        filterAndSearchInputBox.click();

        List<WebElement> filters = driver.findElements(By.xpath("//div[@class='main-ui-filter-sidebar-item-container']"));

        for (WebElement filter : filters) {

            filter.click();

            String list = filter.getText();

            System.out.println(list);

        }

        WebElement filterAndSearchInputBox1 = driver.findElement(By.xpath("//div[@id='LIVEFEED_search_container']/div/div"));
        String filterResult = filterAndSearchInputBox1.getText();

        System.out.println(filterResult);

        String actualText = filterResult;
        String expectedText = "My Activity";
        Assert.assertEquals(actualText,expectedText);

    }




}
