package com.youtube.steps;

import com.youtube.pageObjects.YoutubeInicioPageObject;
import com.youtube.utils.Excel;
import com.youtube.utils.ExcelAletorio;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YoutubeInicioStep {
    YoutubeInicioPageObject youtubeInicioPageObject = new YoutubeInicioPageObject();
  // public static ArrayList<Map<String, String>> leerExcel = new ArrayList<>(); // Excel 1

    String excelFilePath = "Excel/DatosExcel.xlsx";
    List<String> datosFila = ExcelAletorio.leerExcelAleatoriamente(excelFilePath);

    @Step
    public void abrirNavegador (){
        youtubeInicioPageObject.open();
    }

    @Step
    public void escribirBusqueda() throws IOException {
        /*leerExcel = Excel.leerDatosDeHojaDeExcel("Excel/DatosExcel.xlsx","DatosCancion");
        youtubeInicioPageObject.getDriver().findElement(youtubeInicioPageObject.getTxtBusqueda()).sendKeys(
                leerExcel.get(0).get("Cancion") //Excel 1
        );*/
      youtubeInicioPageObject.getDriver().findElement(youtubeInicioPageObject.getTxtBusqueda()).sendKeys(
            datosFila.get(1));

    }

    @Step
    public void clickBusqueda (){
        youtubeInicioPageObject.getDriver().findElement(youtubeInicioPageObject.getBtnBusqueda()).click();

    }


}
