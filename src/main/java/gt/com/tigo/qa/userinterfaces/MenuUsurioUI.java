package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuUsurioUI {

    public final static Target INTERNET_LABEL= Target.the("Titulo internet")
            .locatedBy("(//android.view.View[@resource-id='errorTitle' or @text='Internet'])[{0}]");
    public final static Target LLAMADAS_LABEL= Target.the("Titulo Llamadas")
            .locatedBy("(//android.view.View[@resource-id='errorTitle' or @text='Llamadas'])[{0}]");
    public final static Target MENSAJES_LABEL= Target.the("Titulo mensajes")
            .locatedBy("(//android.view.View[@resource-id='errorTitle' or @text='Mensajes'])[{0}]");
    public final static Target TITULOS= Target.the("Titulos")
            .locatedBy("//android.view.View[@resource-id='errorTitle' or @text='{0}']");
    public final static Target VER_DETALLE_INTERNET = Target.the("Ver detalles")
            .locatedBy("//android.widget.TextView[@text='VER DETALLES']");
    public final static Target VER_DETALLE = Target.the("Ver detalles")
            .locatedBy("(//android.widget.TextView[@text='VER DETALLES' or resource-id='verDetallesBtnClick'])");
    public final static Target VER_DETALLE_LLAMADAS = Target.the("Ver detalles de llamadas")
            .locatedBy("//android.view.View[@resource-id='verDetallesBtnClick']");
    public final static Target VER_DETALLE_MENSAJES  = Target.the("Ver detalles de mensajes")
            .locatedBy("//android.view.View[@text='VER DETALLES']");
    public final static Target DETALLES_CONSUMO = Target.the("Detalles del consumo de Internet")
            .locatedBy("//android.view.View[@text='0 MB consumidos de 230 MB']");
    public final static Target LAYOUT = Target.the("Layout")
            .locatedBy("//android.widget.FrameLayout[@resource-id='android:id/content']");


}
