package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChromeUI {
    public static Target TITULO_BIENVENIDA = Target.the("Titulo de bienvenida a chrome")
          .locatedBy("//android.widget.TextView[@resource-id='com.android.chrome:id/title']");
       public static Target BOTON_ACEPTAR = Target.the("Boton acceptar y continuar")
            .locatedBy("//*[@text='Accept & continue']");
       public static Target BOTON_SIGUIENTE = Target.the("Boton siguiente")
            .locatedBy("//*[@text='Next']");

       public static Target BOTON_SI_ACEPTO = Target.the("Boton si, acepto")
            .located(By.id("com.android.chrome:id/positive_button"));
       public static Target BOTON_NO = Target.the("Boton no, gracias")
            .locatedBy("//*[@text='No Thanks']");
       public static Target BOTON_MAS_OPCIONES = Target.the("Boton mas opciones")
            .locatedBy("//*[@resource-id='com.android.chrome:id/menu_button']");
       public static Target NUEVA_PESTANIA = Target.the("Nueva pestaña")
            .locatedBy("(//android.widget.TextView[@resource-id='com.android.chrome:id/menu_item_text'])[1]");
       public static Target CAJA_BUSQUEDA = Target.the("Caja de busqueda")
            .locatedBy("//android.widget.EditText[@resource-id='com.android.chrome:id/search_box_text']");


}
