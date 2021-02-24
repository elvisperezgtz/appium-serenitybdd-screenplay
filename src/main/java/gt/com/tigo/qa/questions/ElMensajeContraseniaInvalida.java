package gt.com.tigo.qa.questions;

import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

import java.time.Duration;

public class ElMensajeContraseniaInvalida implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(LoginUI.MENSAJE_CONTRASENIA_INVALIDA.waitingForNoMoreThan(Duration.ofSeconds(10)))
                .viewedBy(actor).asBoolean();
    }

    public static ElMensajeContraseniaInvalida esVisible()
    {
        return new ElMensajeContraseniaInvalida();
    }

}
