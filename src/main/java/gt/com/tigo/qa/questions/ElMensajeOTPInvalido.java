package gt.com.tigo.qa.questions;

import gt.com.tigo.qa.interactions.Esperar;
import gt.com.tigo.qa.userinterfaces.OTPUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

import java.time.Duration;

public class ElMensajeOTPInvalido implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return CurrentVisibility.of(OTPUI.MENSAJE_OTP_INVALIDO.waitingForNoMoreThan(Duration.ofSeconds(10)))
                .viewedBy(actor).asBoolean();
    }

    public static ElMensajeOTPInvalido esVisible()
    {
        return new ElMensajeOTPInvalido();
    }
}
