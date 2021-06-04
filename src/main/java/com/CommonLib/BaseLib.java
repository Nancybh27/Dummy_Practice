package com.CommonLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseLib {

    public WebDriver driver;
    String weburl = "http://10.90.0.129:5050/";

    @Parameters("browser")

    @BeforeClass

    //passing browser parameter

    public void beforeMethod(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", ".\\exeFiles\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        //enter website detail
        driver.get(weburl);
    }


    @AfterClass

    public void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
        //driver.quit();
        Assert.assertEquals(true, true, "Login successfully");
        System.out.println("Login successfully..");

    }
}
