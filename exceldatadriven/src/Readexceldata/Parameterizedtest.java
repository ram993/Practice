package Readexceldata;

import com.excel.utility.Xls_Reader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Parameterizedtest {
    public static void main (String args[]) throws IOException {

        File src1 = new File("/Users/ramsubramaniansenthilnathan/Downloads/exceldatadriven/src/Testdata/Registration.xlsx");
        Xls_Reader reader = new Xls_Reader("/Users/ramsubramaniansenthilnathan/Downloads/exceldatadriven/src/Testdata/Registration.xlsx");



        FileInputStream fis1 = new FileInputStream(src1);
        XSSFWorkbook wb1 = new XSSFWorkbook(fis1);

        XSSFSheet sheet2 = wb1.getSheetAt(0);

        int count = sheet2.getLastRowNum();
        System.out.println(count);

        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://signup.heroku.com/");


        reader.addColumn("Registration","Status");
        for(int rownum = 1; rownum <= count; rownum++){

            String Firstname = sheet2.getRow(rownum).getCell(0).getStringCellValue();
            System.out.println(Firstname);
            String Lastname = sheet2.getRow(rownum).getCell(1).getStringCellValue();
            System.out.println(Lastname);
            String Emailaddress = sheet2.getRow(rownum).getCell(2).getStringCellValue();
            System.out.println(Emailaddress);
            String Companyname = sheet2.getRow(rownum).getCell(3).getStringCellValue();
            System.out.println(Companyname);

            driver.findElement(By.xpath("//input[@id='first_name']")).clear();
            driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(Firstname);
            driver.findElement(By.xpath("//input[@id='last_name']")).clear();
            driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(Lastname);
            driver.findElement(By.xpath("//input[@id='email']")).clear();
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Emailaddress);
            driver.findElement(By.xpath("//input[@id='company']")).clear();
            driver.findElement(By.xpath("//input[@id='company']")).sendKeys(Companyname);

            reader.setCellData("Registration","Status", rownum, "Pass");





        }


    }
}
