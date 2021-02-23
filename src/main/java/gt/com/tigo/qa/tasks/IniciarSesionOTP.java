package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesionOTP {

    public static Performable porCodigoOTP(String telefono){
        return Task.where("{0} inicia sesion por Codigo OTP",
                Click.on(LoginUI.INGRESAR_CON_CORREO),
                Click.on(LoginUI.BOTON_CAMBIA_INGRESO_TELEFONO),
                Enter.theValue(telefono).into(LoginUI.CAMPO_TELEFONO),
                Click.on(LoginUI.BOTON_CONTINUAR_OTP)
        );
    }

}
