package Readexceldata;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class RealExcel {
    public static void main(String args[]) throws IOException {

        File src  =new File("/Users/ramsubramaniansenthilnathan/Desktop/TestData.xlsx");
        FileInputStream fis  = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet1 = wb.getSheetAt(0);

        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();

        System.out.println(data0);



    }
}
