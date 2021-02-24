package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.ClearTarget;
import net.serenitybdd.screenplay.actions.Click;

public class Editar {

    public static Performable correo ()
    {
        return Task.where("{0} selecciona editar correo",
                Click.on(LoginUI.BOTON_EDITAR_CORREO));
    }

}
