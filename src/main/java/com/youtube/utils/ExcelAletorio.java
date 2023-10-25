package com.youtube.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcelAletorio {
    public static List<String> leerExcelAleatoriamente(String excelFilePath) {
        List<String> datosFila = new ArrayList<>();

        try (FileInputStream inputStream = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(inputStream)) {

            Sheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
            List<Row> filas = new ArrayList<>();

            for (int i = 1; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    filas.add(row);
                }
            }
            Random random = new Random();
            int filaAleatoriaIndex = random.nextInt(filas.size());
            Row filaAleatoria = filas.get(filaAleatoriaIndex);
            for (Cell cell : filaAleatoria) {
                datosFila.add(cell.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datosFila;
    }
}
