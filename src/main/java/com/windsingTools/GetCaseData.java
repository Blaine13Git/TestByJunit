package com.windsingTools;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.util.HashMap;

public class GetCaseData {

    private Workbook workbook;
    private Sheet sheet;

    private ArrayList<HashMap<String, String>> caseData_total;  //存储所有行的值
    private HashMap<String, String> caseData_each_line;  //存储每一行的值

    /**
     * @param dir        Excel文件的自定义路径
     * @param file_name  Excel文件的名称
     * @param sheet_name Excel sheet的名称
     * @return
     */
    public ArrayList<HashMap<String, String>> getData(String dir, String file_name, String sheet_name) {
        caseData_total = new ArrayList<HashMap<String, String>>();
        try {
            String work_root = System.getProperty("user.dir");
            String file = work_root + dir + file_name;
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet(sheet_name);

            int lastRowNum = sheet.getLastRowNum(); //获取最后一行的值
            short lastCellNum = sheet.getRow(0).getLastCellNum(); //获取最后列的值

            for (int i = 1; i <= lastRowNum; i++) {
                caseData_each_line = new HashMap<String, String>(); //存储每一行的值
                for (int j = 1; j < lastCellNum; j++) {
                    sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                    String key = sheet.getRow(0).getCell(j).getStringCellValue();
                    String value = sheet.getRow(i).getCell(j).getStringCellValue();
                    caseData_each_line.put(key, value);
                }
                caseData_total.add(caseData_each_line);
            }
            return caseData_total;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return caseData_total;
    }
}
