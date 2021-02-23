package gt.com.tigo.qa.questions;

import gt.com.tigo.qa.userinterfaces.EncuestaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

import java.time.Duration;

public class Encuesta implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(EncuestaUI.TITULO_ENCUESTA.waitingForNoMoreThan(Duration.ofSeconds(10))).viewedBy(actor).asBoolean();
    }
    public static Encuesta CompraPaquete() {
        return new Encuesta();
    }
}
