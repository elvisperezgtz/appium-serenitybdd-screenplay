package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeAppUI {
    public final static Target ICONO_PERFIL = Target.the("Perfil del usuario")
            .locatedBy("(//android.widget.Image)[4]");

}
