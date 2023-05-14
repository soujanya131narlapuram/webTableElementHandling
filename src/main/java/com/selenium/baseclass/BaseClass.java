package com.selenium.baseclass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class BaseClass {
    public WebDriver driver;

        public void setUp(String browserName){
            if (browserName.equalsIgnoreCase("Chrome")){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                driver = new ChromeDriver(options);
            } else if (browserName.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
            driver.manage().window().maximize();
        }

        public  void takeScreenshot(String methodName) throws IOException {
            Date date = new Date();
            TakesScreenshot shot = (TakesScreenshot) driver;
            File scrFile = shot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("C:\\Users\\ANIL\\AppData\\Local\\Temp\\WebElementsHandling\\src\\main\\java\\Screenshot"+methodName+date.getTime()+".png");
            FileHandler.copy(scrFile,destFile);
        }

    }

