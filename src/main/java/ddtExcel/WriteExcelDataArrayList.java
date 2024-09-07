package ddtExcel;


import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class WriteExcelDataArrayList {
    public static void main(String[] args) throws IOException {

        // Create workbook sheet
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("EmpDetails");

        // Create object to hold details of Excel data in ArrayList.

        ArrayList<Object[]> empData = new ArrayList<>();
        empData.add(new Object[]{"EmpID", "Name", "Designation"});
        empData.add(new Object[]{101, "Vikas", "Sr. Test Analyst"});
        empData.add(new Object[]{102, "Rohan", "Data Analyst"});
        empData.add(new Object[]{103, "Bhushan", "Developer"});

        int rownum = 0;
        for (Object[] emp : empData) {
            XSSFRow row = sheet.createRow(rownum++);
            int cellnum = 0;
            for(Object value: emp){
                XSSFCell cell = row.createCell(cellnum++);
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

        System.out.println("EmployeeData.xlsx file write successfully");

    }
}