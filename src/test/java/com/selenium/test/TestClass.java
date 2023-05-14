package com.selenium.test;

import com.selenium.baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
    @BeforeMethod
    @Parameters("browser")
    public void init(@Optional("chrome") String browserName){
        setUp(browserName);
    }
    @Test
    public void firstMethod(){
        Assert.assertTrue(true);
        driver.get("https://www.instagram.com/");
    }
    @Test
    public void secondMethod(){
        //Assert.assertTrue(false);
        Boolean flag = false;
        if (flag == true)
            driver.get("https://www.instagram.com/");
    }

    @Test(dependsOnMethods = {"firstMethod"})
    public void thirdMethod(){
        Assert.assertTrue(true);
        driver.get("https://www.instagram.com/");
    }
}
