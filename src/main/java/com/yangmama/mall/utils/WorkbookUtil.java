package com.yangmama.mall.utils;

import lombok.extern.java.Log;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Log
public class WorkbookUtil {

    public static Workbook getWorkbook(String filePath) throws IOException {
        FileInputStream inputFile = new FileInputStream(new File(filePath));
        return new XSSFWorkbook(inputFile);
    }

    public static void writeWorkbook(Workbook outputWorkbook, String filePath) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(filePath);
        outputWorkbook.write(outputStream);
        outputWorkbook.close();
    }

    public static String getCellValue(Cell cell) throws Exception {
        CellType cellType = cell.getCellType();
        if (CellType._NONE.equals(cellType)) {
            return "";
        } else if (CellType.NUMERIC.equals(cellType)) {
            return String.valueOf(cell.getNumericCellValue());
        } else {
            try {
                return cell.getStringCellValue();
            } catch (Exception e) {
                log.info(e.getMessage());
                throw new Exception(e.getMessage());
            }
        }
    }

    public static Map<String, Integer> getNameToIndexMap(Row header) {
        Map<String, Integer> nameToIndexMap = new HashMap<>();
        for (int i = 0; i < header.getPhysicalNumberOfCells(); i++) {
            nameToIndexMap.put(header.getCell(i).getStringCellValue(), i);
        }
        return nameToIndexMap;
    }

    public static Map<Integer, String> getIndexToNameMap(Row header) {
        Map<Integer, String> indexToNameMap = new HashMap<>();
        for (int i = 0; i < header.getPhysicalNumberOfCells(); i++) {
            indexToNameMap.put(i, header.getCell(i).getStringCellValue());
        }
        return indexToNameMap;
    }
}
