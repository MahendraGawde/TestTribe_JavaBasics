package ddtExcel;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {
    public static void main(String[] args) throws IOException {
        String excelFilePath = "src/testdata/CountryPopulationData.xlsx";
        FileInputStream fis = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
//        XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFSheet sheet = workbook.getSheetAt(0);
       /*
        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();

        // Excel Reader Using For Loop
        for (int r = 0; r <=rows ; r++) {

            XSSFRow row = sheet.getRow(r);

            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);
                switch (cell.getCellType()){
                    case STRING -> System.out.print(cell.getStringCellValue());
                    case NUMERIC -> System.out.print(cell.getNumericCellValue());
                    case BOOLEAN -> System.out.print(cell.getBooleanCellValue());
                }
                System.out.print(" | ");
            }
            System.out.println();
        }*/

        //Using Iterator

        Iterator iterator = sheet.iterator();
        while (iterator.hasNext()){
            XSSFRow row = (XSSFRow) iterator.next();
            Iterator cellIterator =  row.cellIterator();
            while(cellIterator.hasNext()){
                XSSFCell cell = (XSSFCell) cellIterator.next();
                switch (cell.getCellType()){
                    case STRING -> System.out.print(cell.getStringCellValue());
                    case NUMERIC -> System.out.print(cell.getNumericCellValue());
                    case BOOLEAN -> System.out.print(cell.getBooleanCellValue());
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
