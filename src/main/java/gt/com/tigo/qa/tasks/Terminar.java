package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Terminar {

    public static Performable laSesion ()
    {
        return Task.where("{0} sale de la sesion",
                Click.on(HomeAppUI.ICONO_PERFIL),
                Click.on(HomeAppUI.BOTON_CERRAR_SESION)
                );
    }

}
