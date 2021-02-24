package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    private final static String BASE = "android.widget.";
    public final static Target INGRESAR_CON_CORREO = Target.the("Boton ingresar con correo")
            .locatedBy("//android.widget.Button[contains(@text,'INGRESAR CON CORREO')]");
    public final static Target CAMPO_CORREO = Target.the("Campo correo")
            .locatedBy("//android.widget.EditText");
    public final static Target BOTON_INGRESAR = Target.the("editText correo")
            .locatedBy("//android.widget.Button[@text='INGRESAR']");
    public final static Target CAMPO_CONTRASENIA = Target.the("editText correo")
            .locatedBy("//android.view.View[@resource-id='passwordInput']//android.widget.EditText");
    public final static Target BOTON_EDITAR_CORREO = Target.the("Botón editar correo")
            .locatedBy("//android.widget.EditText");
    public final static Target OLVIDO_CONTRASENIA = Target.the("¿Olvidaste tu contrasenia")
            .locatedBy("//*[@resource-id='forgotPasswordLbl']");
    public final static Target NUMERO_MOVIL = Target.the("Campo numero movil")
            .locatedBy("//*[@resource-id='forgotPasswordLbl']");
    public final static Target BOTON_CONTINUAR = Target.the("Boton continuar")
            .locatedBy("//android.widget.Button[@text='CONTINUAR']");
    public final static Target BOTON_CONTINUAR2 = Target.the("Boton continuar")
            .locatedBy("(//android.widget.Button[@text='CONTINUAR'])[2]");
    public final static Target BOTON_AHORA_NO = Target.the("Boton ahora no")
            .locatedBy("//*[@text='AHORA NO']");
    public final static Target MENSAJE_ACTUALIZACION = Target.the("Boton ahora no")
            .locatedBy("(//*[contains(@text,'disponible')])[1]");
    public final static Target INGRESAR_CON_TELEFONO = Target.the("Boton ingresar con telefono")
            .locatedBy("//*[@resource-id=\"hePhoneLoginNotCurrentCountry\"]");
    public final static Target BOTON_CAMBIA_INGRESO_TELEFONO = Target.the("Boton cambiar ingreso por telefono")
            .locatedBy("//*[@resource-id=\"onLoginWithPhoneLbl\"]");
    public final static Target CAMPO_TELEFONO = Target.the("Campo Numero movil")
            .locatedBy("//android.view.View[2]/android.widget.EditText");
    public final static Target BOTON_CONTINUAR_OTP = Target.the("Boton continuar")
            .locatedBy("//*[@resource-id=\"doOTPLoginBtn\"]");
    public final static Target MENSAJE_CORREO_INVALIDO = Target.the("Mensaje de correo invalido")
            .locatedBy("//*[@resource-id=\"errorMessageEmailPhone\"]");
    public final static Target MENSAJE_CONTRASENIA_INVALIDA = Target.the("Mensaje de contrasenia invalida")
            .locatedBy("//*[@resource-id=\"errorMessageNotEmailPhone\"]");
    public static final Target LISTADO_LINEA = Target.the("listado lineas")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View");


}
