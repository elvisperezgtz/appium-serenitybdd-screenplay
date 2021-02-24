package gt.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OTPUI {

    public final static Target CAMPO_INGRESO_OTP = Target.the("Campo de ingreso de codigo OTP")
            .locatedBy("//*[@resource-id=\"otpInput\"]");
    public final static Target BOTON_OTP_VERIFICAR = Target.the("Boton para verificar OTP")
            .locatedBy("//*[@resource-id=\"onVerifyBtn\"]");
    public final static Target MENSAJE_OTP_INVALIDO = Target.the("Mensaje de codigo OTP invalido")
            .locatedBy("(//android.view.View[3])[1]");
    public final static Target POPUP_SMS_OTP = Target.the("Popup de mensaje OTP")
            .locatedBy("");

}
