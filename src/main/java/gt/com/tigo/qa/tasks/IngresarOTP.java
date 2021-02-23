package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.OTPUI;
import gt.com.tigo.qa.utils.correos.ManejadorDeCorreos;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarOTP {

    public static Performable correcto(){
        return Task.where("{0} ingresa el codigo OTP correcto",
                Enter.theValue(ManejadorDeCorreos.obtenerCodigoOTP()).into(OTPUI.CAMPO_INGRESO_OTP),
                Click.on(OTPUI.BOTON_OTP_VERIFICAR));

    }
}
