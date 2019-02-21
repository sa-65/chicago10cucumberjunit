package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {

    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook;
        XSSFSheet worksheet;
        XSSFRow row;
        XSSFCell cell;

        String path = "src/Sample Data.xlsx";

        FileInputStream inputStream = new FileInputStream(path);

        workbook = new XSSFWorkbook(inputStream);
        worksheet = workbook.getSheet("Employees");

        row = worksheet.getRow(4);
        cell = row.getCell(0);

        System.out.println(cell);


        XSSFCell adamCell = worksheet.getRow(5).getCell(0);

        System.out.println("BEFORE: " + adamCell);

        adamCell.setCellValue("Trump");

        FileOutputStream outputStream = new FileOutputStream(path);

       // workbook.write(outputStream);

        System.out.println("AFTER: " +adamCell);


        //TODO: CHANGE JOB_ID FOR TRUMP TO PRESIDENT

        for(int i=0;i<=worksheet.getLastRowNum();i++){
            if(worksheet.getRow(i).getCell(0).toString().equals("Trump")){
                XSSFCell trumpJob=worksheet.getRow(i).getCell(2);
                System.out.println("Before Election: "+trumpJob);
                trumpJob.setCellValue("President");
                System.out.println("After Election: "+trumpJob);


                break;
            }

        }





        workbook.write(outputStream);
        outputStream.close();
        inputStream.close();
        workbook.close();











    }
}
