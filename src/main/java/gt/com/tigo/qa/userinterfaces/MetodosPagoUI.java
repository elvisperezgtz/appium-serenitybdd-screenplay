package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MetodosPagoUI {

    public  static final Target TITULO_METODOS = Target.the("Titulo Metodos de pago")
            .locatedBy("//*[contains(@text,'todos de pago')]");

    public static final  Target SALDO_RECARGA = Target.the("saldo de Recargas")
            .locatedBy("//*[contains(@text,'Saldo de Recargas')]");

   }
