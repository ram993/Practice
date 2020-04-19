package com.datadriven.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class testreadexcel {
    public static void main(String args[]) throws IOException {

        File src = new File("/Users/ramsubramaniansenthilnathan/Downloads/datadrivern/src/main/java/com/testdata/TestData.xlsx");

        FileInputStream fis  =new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);


        XSSFSheet sheet1 = wb.getSheetAt(0);

        String data = sheet1.getRow(0).getCell(0).getStringCellValue();

        System.out.println(data);




    }
}
