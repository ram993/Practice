package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");

        driver.getTitle();

    }
}
