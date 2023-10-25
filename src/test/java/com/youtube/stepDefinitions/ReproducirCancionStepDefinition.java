package com.youtube.stepDefinitions;

import com.youtube.steps.YoutubeCatalogoStep;
import com.youtube.steps.YoutubeInicioStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ReproducirCancionStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());

    }

    @Steps
    YoutubeInicioStep youtubeInicioStep;
    @Steps
    YoutubeCatalogoStep youtubeCatalogoStep;

    @Given("que el usuario se encuentre en la pagina de youtube")
    public void queElUsuarioSeEncuentreEnLaPaginaDeYoutube() {
        youtubeInicioStep.abrirNavegador();


    }
    @When("el busque una cancion para reproducirla")
    public void elBusqueUnaCancionParaReproducirla() throws IOException, InterruptedException {
        youtubeInicioStep.escribirBusqueda();
        youtubeInicioStep.clickBusqueda();
        youtubeCatalogoStep.seleccionarCancion();

    }
    @Then("el usuario podra visualizar que la cancion que se reproduce es la cancion que busco")
    public void elUsuarioPodraVisualizarQueLaCancionQueSeReproduceEsLaCancionQueBusco() {

    }
}
