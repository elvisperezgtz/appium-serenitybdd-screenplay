package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class IngresarCorreo {

    public static Performable invalido(String correoInvalido)
    {
        return Task.where("{0} ingresa un correo no registrado",
                Click.on(LoginUI.INGRESAR_CON_CORREO),
                Enter.theValue(correoInvalido).into(LoginUI.CAMPO_CORREO),
                Click.on(LoginUI.BOTON_INGRESAR)
        );
    }

}
