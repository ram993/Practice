package javalearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {
    public static void  main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("test@gmail.com");
                //input[@type='email']
                //input[@type='email']

        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("234234");
                    //input[@type='password']
                    //input[@type='password']
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='Log In']")).click();


        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");
        //input[@type='email']
        //input[@type='email']

        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("234234");
        //input[@type='password']
        //input[@type='password']
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[value='Log In']")).click();




        driver.quit();


    }

}
