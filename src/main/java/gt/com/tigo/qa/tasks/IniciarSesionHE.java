package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IniciarSesionHE {

    public static Performable porHeaderEnrichment(){
         return Task.where("{0} inicia sesion por Header Enrichment",
                Click.on(LoginUI.INGRESAR_CON_TELEFONO));
    }
}
