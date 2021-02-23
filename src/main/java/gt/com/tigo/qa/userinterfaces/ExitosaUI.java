package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ExitosaUI {

    public static final Target VOLVER_AL_INICIO = Target.the("Volver al inicio")
            .locatedBy("//*[contains(@text,'VOLVER AL INICIO')]");

    public static final Target DETALLES_DE_LA_TRANSACCION = Target.the("Detalles de la transaccion")
            .locatedBy("//*[contains(@text,'detailsTitle')]");

}
