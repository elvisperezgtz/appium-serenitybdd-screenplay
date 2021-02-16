package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TigoResetUI {
    public final static Target CONTRASENIA= Target.the("Campo contrasenia")
            .locatedBy("(//android.widget.EditText)[1]");
    public final static Target CONTINUAR= Target.the("Boton continuar")
            .locatedBy("//android.widget.Button[@resource-id='idSubmit']");
    public final static Target BARRA_DIRECCION= Target.the("Barra direccion")
            .located(By.id("com.android.chrome:id/url_bar"));


}
