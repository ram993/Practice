package Readexceldata;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class RealExcel1 {
    public static void main(String args[]) throws IOException {

        File src  =new File("/Users/ramsubramaniansenthilnathan/Downloads/exceldatadriven/src/Testdata/TestData.xlsx");
        FileInputStream fis  = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet1 = wb.getSheetAt(0);

        int rowcount = sheet1.getLastRowNum();

        for ( int i =0; i<= rowcount; i++)
        {
           String test = sheet1.getRow(i).getCell(0).getStringCellValue();
            System.out.println(test);
        }

        //String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();





    }
}
