package gt.com.tigo.qa.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static gt.com.tigo.qa.userinterfaces.LoginUI.*;


public class IniciarSesion implements Task {
    private String usuario;
    private String contrasenia;

    public IniciarSesion(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    @Override
    @Step("{0} inicia sesion en la app con el usuario #usuario y la contrasenia #contrasenia")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INGRESAR_CON_CORREO),
                Enter.theValue(usuario).into(CAMPO_CORREO),
                Click.on(BOTON_INGRESAR),
                Enter.theValue(contrasenia).into(CAMPO_CONTRASENIA),
                Click.on(BOTON_INGRESAR)
        );
    }
    public static Performable enLaAplicacion(String usuario, String contrasenia){

        return Tasks.instrumented(IniciarSesion.class, usuario,contrasenia);

    }
}