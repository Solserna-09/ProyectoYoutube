package com.youtube.steps;

import com.youtube.pageObjects.YoutubeCatalogoPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class YoutubeCatalogoStep {

    YoutubeCatalogoPageObject youtubeCatalogoPageObject = new YoutubeCatalogoPageObject();


    @Step
    public void seleccionarCancion () throws InterruptedException {
        List<WebElement> listaCancion = youtubeCatalogoPageObject.getDriver().findElements(youtubeCatalogoPageObject.getLblCanciones());
        Random random = new Random();
        int randomCancion = random.nextInt(listaCancion.size());
        listaCancion.get(randomCancion).click();
        Thread.sleep(11000);
    }

}
