package javalearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class salesforce {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
        s.selectByValue("option2");


        Thread.sleep(3000);




        driver.quit();


    }
}
