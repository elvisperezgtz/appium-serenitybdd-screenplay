package gt.com.tigo.qa.tasks;


import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static gt.com.tigo.qa.userinterfaces.LoginUI.*;

public class Recuperar implements Task {

    private String correoElectronico;

    public Recuperar(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INGRESAR_CON_CORREO),
                Enter.theValue(correoElectronico).into(CAMPO_CORREO),
                Click.on(BOTON_INGRESAR),
                Click.on(LoginUI.OLVIDO_CONTRASENIA),
                Click.on(LoginUI.BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR2)

        );
        System.out.println();
    }

    public static Recuperar contraseniaPorCorreoElectronico(String correoElectronico){
        return Tasks.instrumented(Recuperar.class, correoElectronico);
    }
}
