package javalearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");

        WebDriver driver = new ChromeDriver();




        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
//driver.findElement(By.className("button r4 wide primary")).click();//Error
        driver.findElement(By.xpath("//*[@id='Login']")).click();

        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

        driver.quit();

    }
}
