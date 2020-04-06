package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import static com.cbt.utilities.StringUtility.verifyEquals;

public class NavigationTests {
    public static void main(String[] args) {

//        chrome("https://google.com", "https://etsy.com");
//        firefox("https://google.com", "https://etsy.com");
        edge("https://google.com", "https://etsy.com");

    }
    public static void chrome(String url1, String url2) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);
        driver.navigate().to("https://etsy.com");
        String titleEtsy = driver.getTitle();
        System.out.println(titleEtsy);
        driver.navigate().back();
        String titleGoogle2 = driver.getTitle();
        System.out.println(titleGoogle2);
        System.out.println(verifyEquals(titleGoogle, titleGoogle2));
        driver.navigate().forward();
        String titleEtsy2 = driver.getTitle();
        System.out.println(verifyEquals(titleEtsy, titleEtsy2));
        driver.close();
    }

    public static void firefox(String url1, String url2) {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);
        driver.navigate().to("https://etsy.com");
        String titleEtsy = driver.getTitle();
        System.out.println(titleEtsy);
        driver.navigate().back();
        String titleGoogle2 = driver.getTitle();
        System.out.println(titleGoogle2);
        System.out.println(verifyEquals(titleGoogle, titleGoogle2));
        driver.navigate().forward();
        String titleEtsy2 = driver.getTitle();
        System.out.println(verifyEquals(titleEtsy, titleEtsy2));
        driver.close();
    }
    public static void edge(String url1, String url2) {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);
        driver.navigate().to("https://etsy.com");
        String titleEtsy = driver.getTitle();
        System.out.println(titleEtsy);
        driver.navigate().back();
        String titleGoogle2 = driver.getTitle();
        System.out.println(titleGoogle2);
        System.out.println(verifyEquals(titleGoogle, titleGoogle2));
        driver.navigate().forward();
        String titleEtsy2 = driver.getTitle();
        System.out.println(verifyEquals(titleEtsy, titleEtsy2));
        driver.close();
    }
}
