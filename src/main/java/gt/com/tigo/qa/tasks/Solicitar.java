package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static gt.com.tigo.qa.userinterfaces.LoginUI.CAMPO_CORREO;
import static gt.com.tigo.qa.userinterfaces.LoginUI.INGRESAR_CON_CORREO;

public class Solicitar implements Task {

    private String correoElectronico;

    public Solicitar(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    @Step("{0} realiza la solicitud de cambio de contraseña para el correo electronico #correoElectronico")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INGRESAR_CON_CORREO),
                Enter.theValue(correoElectronico).into(CAMPO_CORREO),
                Click.on(LoginUI.BOTON_INGRESAR),
                Click.on(LoginUI.OLVIDO_CONTRASENIA),
                Click.on(LoginUI.BOTON_CONTINUAR),
                Click.on(LoginUI.BOTON_CONTINUAR2)

        );
        System.out.println();
    }

    public static Solicitar cambioContrasenia(String correoElectronico){
        return Tasks.instrumented(Solicitar.class, correoElectronico);
    }
}
