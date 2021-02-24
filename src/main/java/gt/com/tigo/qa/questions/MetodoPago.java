package gt.com.tigo.qa.questions;

import gt.com.tigo.qa.userinterfaces.MetodosPagoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

public class MetodoPago implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(MetodosPagoUI.TITULO_METODOS).viewedBy(actor).asBoolean();
            }

            public static MetodoPago esVisible(){
        return  new MetodoPago();
            }


}
