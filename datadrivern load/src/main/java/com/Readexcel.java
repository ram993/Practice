package com;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import  java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readexcel {
    public static void main(String args[]) throws IOException {

        File src = new File("/Users/ramsubramaniansenthilnathan/Downloads/datadrivern/src/main/java/com/testdata/TestData.xlsx");

        FileInputStream fis  =new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);


        XSSFSheet sheet1 = wb.getSheetAt(0);

        String data = sheet1.getRow(0).getCell(0).getStringCellValue();

        System.out.println(data);




    }
}
