package com.youtube.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class YoutubeCatalogoPageObject extends PageObject {

    By lblCanciones = By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer' and not (@is-empty)]");

    public By getLblCanciones() {
        return lblCanciones;
    }
}
