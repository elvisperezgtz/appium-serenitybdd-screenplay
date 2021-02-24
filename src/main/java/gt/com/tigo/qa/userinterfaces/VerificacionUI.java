package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class VerificacionUI {

    public  static final Target TITULO_VERIFICACION = Target.the("Titulo de verificacion")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]");

    public static final Target RESUMEN_COMPRA = Target.the("Resumen del paquete")
            .locatedBy("//*[contains(@text,'verificationSummary')]");

    public static final  Target BOTON_COMPRAR = Target.the("Boton comprar internet")
            .locatedBy("(//*[contains(@text,'COMPRAR')])[2]");

    public static final  Target BOTON_CANCELAR = Target.the("Boton Cancelar")
            .locatedBy("//*[contains(@text,'CANCELAR')]");
}