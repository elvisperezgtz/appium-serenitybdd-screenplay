package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CompraUI {

    public  static final Target PESTANA_INTERNET = Target.the("Paquetes de Internet")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");

    public  static final Target PESTANA_MINUTO_MENSAJES = Target.the("Paquetes de llamadas y mensajes")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");

    public static final Target  PAQUETE = Target.the("Paquete: {0}")
            .locatedBy("//*[@text='{0}']");

    public static final Target NOMBREPAQUETE = Target.the("NombrePaquete: {0}")
            .locatedBy("//*[@text='{0}']");
}
