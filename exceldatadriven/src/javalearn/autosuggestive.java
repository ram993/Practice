package javalearn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.get("https://rahulshettyacademy.com/AutomationPractice"); //URL in the browser

        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).isSelected());
        Thread.sleep(3000);


        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).isSelected());


         System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());












    }
}
