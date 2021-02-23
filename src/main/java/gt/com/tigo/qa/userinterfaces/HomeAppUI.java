package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeAppUI {
    public static final  Target ICONO_PERFIL = Target.the("Perfil del usuario")
            .locatedBy("//android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Image");

    public static final  Target LINEA = Target.the("Linea: {0}")
            .locatedBy("//*[@text='{0}']");

    public static final Target PAQUETE_ACTIVO_INTERNET = Target.the("Paquetigo activo internet")
            .locatedBy("//android.widget.SeekBar");

    public static final Target PAQUETE_ACTIVO_LLAMADAS = Target.the("Paquetigo activo llamadas")
            .locatedBy("//*[contains(@text,'MIN')]");

    public static final Target PAQUETE_ACTIVO_MENSAJES = Target.the("Paquetigo activo mensajes")
            .locatedBy("//*[contains(@text,'SMS')]");

    public static final Target PAQUETE_ENCOLADO = Target.the("Paquetigo encolado")
            .locatedBy("//*[contains(@text,'En espera')]");

   public static final Target APPS_ILIMITADAS = Target.the("Card Apps Ilimitadas")
           .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]");

       public static final Target BOTON_COMPRAR_INTERNET =Target.the("Boton comprar internet")
            .locatedBy("(//android.widget.Button[@text='COMPRAR'])[1]");

    public static final Target BOTON_COMPRAR_MINUTOS =Target.the("Boton comprar llamadas")
            .locatedBy("(//android.widget.Button[@text='COMPRAR'])[2]");

    public static final Target BOTON_COMPRAR_MENSAJES =Target.the("Boton comprar mensajes")
            .locatedBy("(//android.widget.Button[@text='COMPRAR'])[3]");

    public static final Target BOTON_DETALLE_PRE = Target.the("Boton consumo prepago")
            .locatedBy("//*[@text='currentTabTitle0'] | /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.TabWidget/android.view.View[1]/android.view.View");

    public static final Target BOTON_DETALLES_POS = Target.the("Boton Consumo Postpago")
            .locatedBy("//*[@text='currentTabTitle1']");

    public  static final Target CARD_INTERNET = Target.the(" Card Internet")
            .locatedBy("(//*[@resource-id=\"errorTitle\"])[1] | //*[@resource-id=\"internetCardTitle\"] | ");

    public  static final Target CARD_LLAMADAS = Target.the("Card Llamadas")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View");

    public  static final Target CARD_MENSAJES = Target.the("Card Mensajes")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View");

        public  static final Target BOTON_DETALLES_INTERNET = Target.the("Boton detalles consumo")
            .locatedBy("(//android.view.View[@text='verDetallesBtnClick'])[1]");

    public  static final Target BOTON_DETALLES_LLAMADAS_TIGO = Target.the("Boton detalles consumo tigo")
            .locatedBy("//android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]");

    public  static final Target BOTON_DETALLES_LLAMADAS_OTROS = Target.the("Boton detalles consumo otros")
            .locatedBy("//android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[5]");

    public  static final Target BOTON_DETALLES_MENSAJES = Target.the("Boton detalles consumo mensajes")
            .locatedBy("(//android.view.View[@text='verDetallesBtnClick'])[3]");

    public  static final Target BOTON_DETALLES_MINUTOS = Target.the("Boton detalles consumo llamadas")
            .locatedBy("(//android.view.View[@text='verDetallesBtnClick'])[2]");

    public static final Target TITULO_DETALLES = Target.the("Detalles de consumo")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]");

}
