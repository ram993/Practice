package Readexceldata;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class RealExcel3 {
    public static void main(String args[]) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://signup.heroku.com/");

        File src1 = new File("/Users/ramsubramaniansenthilnathan/Downloads/exceldatadriven/src/Testdata/Registration.xlsx");
        FileInputStream fis1 = new FileInputStream(src1);
        XSSFWorkbook wb1 = new XSSFWorkbook(fis1);

        XSSFSheet sheet2 = wb1.getSheetAt(0);

        String Firstname = sheet2.getRow(1).getCell(0).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(Firstname);

        String Lastname = sheet2.getRow(1).getCell(1).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(Lastname);

        String Emailaddress = sheet2.getRow(1).getCell(3).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Emailaddress);

        String Companyname = sheet2.getRow(1).getCell(4).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys(Companyname);

/*
        String Role = sheet2.getRow(1).getCell(5).getStringCellValue();
        Select select = new Select(driver.findElement(By.xpath("//select[@id='role']")));
        select.selectByVisibleText(Role);

        String Country = sheet2.getRow(1).getCell(6).getStringCellValue();
        Select select1 = new Select(driver.findElement(By.xpath("//select[@id='self_declared_country']")));
        select1.selectByVisibleText(Country);
*/


        Thread.sleep(4000);









/*
        Xls_Reader reader = new Xls_Reader("/Users/ramsubramaniansenthilnathan/Downloads/exceldatadriven/src/Testdata/Registration.xlsx");
        String Firstname = reader.getCellData("Registration.xlsx","firstname",1);
        System.out.println(Firstname);
        String Lastname= reader.getCellData("Registration","lastname",1);
        System.out.println(Lastname);


        String Firstname = reader.getCellData("Registration.xlsx","Firstname",2);
//        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(Firstname);
        System.out.println(Firstname);

        String Lastname= reader.getCellData("Registration","Lastname",2);
//        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(Lastname);
        System.out.println(Lastname);

       String Emailadress= reader.getCellData("Registration","Emailadress",2);
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
