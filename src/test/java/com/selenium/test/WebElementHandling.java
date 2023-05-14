package com.selenium.test;

import com.selenium.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.util.List;

public class WebElementHandling extends BaseClass {
    @BeforeTest
    public void init(@Optional("chrome") String browserName){
        setUp(browserName);
        driver.get("https://demo.guru99.com/test/web-table-element.php");
    }

    @Test
    public void handleTable(){
        List<WebElement> totalNoOfColumns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
        System.out.println("Number of Columns : "+totalNoOfColumns.size());

        List<WebElement> totalNoOfRows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows : "+totalNoOfRows.size());

        String getThirdRowAndFirstColumnVal = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
        System.out.println("getThirdRowAndFirstColumnVal : "+getThirdRowAndFirstColumnVal);

    }

}
