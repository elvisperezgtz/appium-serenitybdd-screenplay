package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeAppUI {
    public final static Target ICONO_PERFIL = Target.the("Perfil del usuario")
            .locatedBy("//android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Image");

    public final static Target LINEA = Target.the("Linea: {0}")
            .locatedBy("//*[contains(@text,'{0}')]");

    public final static Target LISTADO_LINEA = Target.the("Listado de lineas")
            .locatedBy("//android.view.View[contains(@text,'Prepago') or contains(@text,'Postpago') or contains(@text, 'Controlado') or contains(@text,'brido')]");

    public final static Target MENU_INFERIOR = Target.the("Tab de opciones")
            .locatedBy("//android.view.View[2]/android.widget.TabWidget");

    public final static Target BOTON_CERRAR_SESION = Target.the("Boton cerrar sesion")
            .locatedBy("//android.widget.TabWidget");

}
