package test;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.GasMileageCalculatorPage;
import utilities.Config;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class GasMileageCalculatorTest {


    XSSFWorkbook workbook;
    XSSFSheet worksheet;
    FileInputStream inputStream;
    FileOutputStream outputStream;

    @Before
    public void setUp() throws Exception {

        Driver.getDriver().get("https://www.calculator.net/gas-mileage-calculator.html");

        inputStream = new FileInputStream(Config.getProperty("gasmileage.testdata.path"));
        workbook = new XSSFWorkbook(inputStream);
        worksheet = workbook.getSheet("Sheet1");

    }

    @After
    public void tearDown(){
        Driver.getDriver().close();
    }


    @Test
    public void datadrivenMileageCalculatorTest() throws IOException {

        GasMileageCalculatorPage gasMileage = new GasMileageCalculatorPage();

        for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {

            XSSFRow currentRow=worksheet.getRow(i);

            if (!currentRow.getCell(0).toString().equalsIgnoreCase("Y")){
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);

                }

                currentRow.getCell(6).setCellValue("Skip Requested");
                continue;

            }


            double currentOdo=currentRow.getCell(1).getNumericCellValue();
            gasMileage.currentOdometerInput.clear();
            gasMileage.currentOdometerInput.sendKeys(String.valueOf(currentOdo));

            double previousOdo = currentRow.getCell(2).getNumericCellValue();
            gasMileage.previousOdometerInput.clear();
            gasMileage.previousOdometerInput.sendKeys(String.valueOf(previousOdo));
            gasMileage.gallonsInput.clear();

            double gas = currentRow.getCell(3).getNumericCellValue();
            gasMileage.gallonsInput.sendKeys(String.valueOf(gas));
            gasMileage.calculateButton.click();

            double expectedResult = (currentOdo - previousOdo) / gas;

            String[] actualResult = gasMileage.resultInGallon.getText().split(" ");

            DecimalFormat decimalFormat = new DecimalFormat("#0.00");

            if(currentRow.getCell(4)==null){
                currentRow.createCell(4);

            }

            currentRow.getCell(4).setCellValue(decimalFormat.format(expectedResult));

            if(currentRow.getCell(5)==null){
                currentRow.createCell(5);

            }

            currentRow.getCell(5).setCellValue(actualResult[0]);




            if (String.valueOf(decimalFormat.format(expectedResult)).equals(actualResult[0])) {

                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }

                currentRow.getCell(6).setCellValue("PASS");
                System.out.println("PASS");


            } else {
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("FAIL");
                System.out.println("FAIL");
            }

            if(currentRow.getCell(7)==null){
                currentRow.createCell(7);
            }

            currentRow.getCell(7).setCellValue(LocalDateTime.now().toString());


        }

        outputStream = new FileOutputStream(Config.getProperty("gasmileage.testdata.path"));
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        inputStream.close();

    }
}
