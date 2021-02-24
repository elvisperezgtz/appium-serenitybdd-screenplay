package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.CompraUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class CompraPaqueteInternet implements Task {
    private String paquete;
    private String nombrepaquetigo;

    public CompraPaqueteInternet(String paquete, String nombrepaquetigo){
        this.paquete = paquete;
        this.nombrepaquetigo = nombrepaquetigo;
    }

    @Override
    @Step("{0} el usuario selecciona el #paquete y #nombrepaquetigo")
        public <T extends Actor> void performAs(T actor) {
              actor.attemptsTo(Click.on(CompraUI.PAQUETE.of(paquete)));
                actor.attemptsTo(Click.on(CompraUI.NOMBREPAQUETE.of(nombrepaquetigo)));
                                  }

          public static CompraPaqueteInternet paquetes (String paquete, String nombrepaquetigo){
              return Tasks.instrumented(CompraPaqueteInternet.class,paquete, nombrepaquetigo);
          }
}