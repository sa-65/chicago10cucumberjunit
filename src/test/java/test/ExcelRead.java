package test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExcelRead {


    public static void main(String[] args) throws Exception {

        File file = new File("src/Sample Data.xlsx");

        System.out.println(file.exists());

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet worksheet = workbook.getSheet("Employees");

        System.out.println(worksheet.getRow(2).getCell(1));

        System.out.println(worksheet.getRow(5).getCell(0));

        //counts by actual number of row
        System.out.println("PhysicalNumberOfRows: " + worksheet.getPhysicalNumberOfRows());

        //count by index
        System.out.println("LastUsedRow: " + worksheet.getLastRowNum());


        //TODO PRINT OUT NANCY'S JOB_ID DYNAMICALLY

        for (int i = 0; i <= worksheet.getLastRowNum(); i++) {

            if (worksheet.getRow(i).getCell(0).toString().equals("Nancy")) {
                System.out.println("Nancy's job is: " + worksheet.getRow(i).getCell(2));
                break;

            }

        }


        //TODO: IF LAST NAME IS MATCHING "HAAN", PRINT OUT ALL THE INFORMATION FRO THAT REASON
        //TODO: FIRSTNAME,LASTNAME,JOB_ID
        //TODO: GET THE LAST NAME FROM CONFIGRATION PROPERTIES

        for (int i = 0; i <= worksheet.getLastRowNum(); i++) {

            String lastName=Config.getProperty("lastname");
            if(worksheet.getRow(i).getCell(1).toString().equals(lastName)){
                System.out.println("First Name: "+worksheet.getRow(i).getCell(0)+", Last Name: "+lastName+
                                    ", Job ID: "+worksheet.getRow(i).getCell(2));
                break;
            }
        }





        workbook.close();
        inputStream.close();

    }

}
