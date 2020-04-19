package com.datadriven.test;

import com.excel.utility.Xls_Reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriventest {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://signup.heroku.com/");

        Xls_Reader reader = new Xls_Reader("/Users/ramsubramaniansenthilnathan/Downloads/datadrivern/src/main/java/com/testdata/Registration.xlsx");

        String Firstname = reader.getCellData("Registration.xlsx","Firstname",2);
//        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(Firstname);
        System.out.println(Firstname);

        String Lastname= reader.getCellData("Registration","Lastname",2);
//        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(Lastname);
        System.out.println(Lastname);

     /*   String Emailadress= reader.getCellData("Registration","Emailadress",2);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Emailadress);

        String Companyname = reader.getCellData("Registration","Companyname",2);
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys(Companyname);

        String Role = reader.getCellData("Registration","Role",2);
        driver.findElement(By.xpath("//select[@id='role']")).sendKeys(Role);



        String Country = reader.getCellData("Registration","Role",2);
        driver.findElement(By.xpath("//select[@id='self_declared_country']")).sendKeys(Country); */

     driver.quit();







    }
}
