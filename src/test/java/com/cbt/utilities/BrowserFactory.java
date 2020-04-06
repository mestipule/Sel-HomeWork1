package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFactory {
    public static WebDriver getDriver(String browser){
        WebDriver driver;
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = initializeEdgeDriver();
        } else {
            driver = null;
        }
        driver.manage().window().maximize();
        return driver;
    }
    private static WebDriver initializeEdgeDriver()
    {

        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\msedgedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary(
                "C:\\Program Files (x86)\\Microsoft\\Edge Dev\\Application\\msedge.exe");
        EdgeOptions edgeOptions = new EdgeOptions().merge(chromeOptions);
        WebDriver driver = new ChromeDriver(edgeOptions);
        driver.manage().window().maximize();
        int GLOBAL_TIMEOUT = 100;
        WebDriverWait webDriverWait = new WebDriverWait(driver, GLOBAL_TIMEOUT);
        return driver;
    }
}
