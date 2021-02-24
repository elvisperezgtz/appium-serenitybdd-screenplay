package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.interactions.Esperar;
import gt.com.tigo.qa.userinterfaces.OTPUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

public class ColocarOTP {

    public static Performable invalido ()
    {
        return Task.where("{0} ingresa el codigo OTP incorrecto",
                Enter.theValue("000000").into(OTPUI.CAMPO_INGRESO_OTP),
                Click.on(OTPUI.BOTON_OTP_VERIFICAR));
    }

}
