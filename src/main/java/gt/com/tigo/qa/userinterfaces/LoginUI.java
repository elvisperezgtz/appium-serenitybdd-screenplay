package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target INGRESAR_CON_CORREO = Target.the("Boton ingresar con correo")
            .locatedBy("//android.widget.Button[contains(@text,'INGRESAR CON CORREO')] | //*[@resource-id=\"goToLogin\"]");
    public static final Target CAMPO_CORREO = Target.the("Campo correo")
            .locatedBy("//android.widget.EditText");
    public static final Target BOTON_INGRESAR = Target.the("Boton ingresar")
            .locatedBy("//android.widget.Button[@text='INGRESAR']");
    public static final Target CAMPO_CONTRASENIA = Target.the("Campo contrasenia")
            .locatedBy("//android.view.View[@resource-id='passwordInput']//android.widget.EditText");

    public static final Target OLVIDO_CONTRASENIA = Target.the("¿Olvidaste tu contrasenia")
            .locatedBy("//*[@resource-id='forgotPasswordLbl']");
    public static final Target NUMERO_MOVIL = Target.the("Campo numero movil")
            .locatedBy("//*[@resource-id='forgotPasswordLbl']");
    public static final Target BOTON_CONTINUAR = Target.the("Boton continuar")
            .locatedBy("//android.widget.Button[@text='CONTINUAR']");
    public static final Target BOTON_CONTINUAR2 = Target.the("Boton continuar")
            .locatedBy("(//android.widget.Button[@text='CONTINUAR'])[2]");
    public static final Target BOTON_AHORA_NO = Target.the("Boton ahora no")
            .locatedBy("//*[@text='AHORA NO']");
    public static final Target MENSAJE_ACTUALIZACION = Target.the("Boton ahora no")
            .locatedBy("(//*[contains(@text,'disponible')])[1]");

    public static final Target LISTADO_LINEA = Target.the("listado lineas")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View");

}
