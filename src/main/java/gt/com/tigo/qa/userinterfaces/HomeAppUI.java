package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeAppUI {
    public final static Target ICONO_PERFIL = Target.the("Perfil del usuario")
            .locatedBy("(//android.widget.Image)[4] | (//android.widget.Image)[3]");

    public final static Target LINEA = Target.the("Linea: {0}")
            .locatedBy("//*[contains(@text,'{0}')]");

    public final static Target LISTADO_LINEA = Target.the("Listado de lineas")
            .locatedBy("//*[@resource-id=\"openAccountsMoviles0\"]");

    public final static Target MENU_INFERIOR = Target.the("Tab de opciones")
            .locatedBy("//android.view.View[2]/android.widget.TabWidget");

}
