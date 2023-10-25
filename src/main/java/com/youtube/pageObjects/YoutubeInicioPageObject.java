package com.youtube.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.youtube.com/")
public class YoutubeInicioPageObject extends PageObject {

 By txtBusqueda = By.name("search_query");
 By btnBusqueda = By.id("search-icon-legacy");

    public By getTxtBusqueda() {
        return txtBusqueda;
    }

    public By getBtnBusqueda() {
        return btnBusqueda;
    }
}
