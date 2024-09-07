package ddtExcel;

import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelData {
    public static void main(String[] args) throws IOException {

        // Create workbook sheet
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("EmpDetails");

        // Create object to hold details of excel data in array.
        Object empData[][] = {{"EmpID", "Name", "Designation"},
                {101,"Rishi","Manager"},
                {102, "Vikrant", "Test Lead"},
                {103, "Raneesh" , "Sr. Analyst"}
        };

        /*int rows = empData.length;
        int cols = empData[0].length;

        System.out.println(rows);
        System.out.println(cols);

        // nested loop outer loop handle rows operation while inner loop handle cell operation.
        for (int r = 0; r < rows ; r++) {

            XSSFRow row = sheet.createRow(r);

            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.createCell(c);
                Object value = empData[r][c];

                if(value instanceof String)
                    cell.setCellValue((String)value);
                if(value instanceof Integer)
                    cell.setCellValue((Integer)value);
                if(value instanceof Boolean)
                    cell.setCellValue((Boolean)value);

            }*/

        // Using Enhanced For Loop

        int rowCount = 0;
        for(Object emp[] : empData){
         XSSFRow row = sheet.createRow(rowCount++);
         int columnCount = 0;
            for(Object value: emp){

                XSSFCell cell = row.createCell(columnCount++);
                if(value instanceof String)
                    cell.setCellValue((String) value);
                if(value instanceof Integer)
                    cell.setCellValue((Integer) value);
                if(value instanceof Boolean)
                    cell.setCellValue((Boolean) value);
            }

        }
        String filePath = "src\\testdata\\employeeData.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        outputStream.close();

    }
}
