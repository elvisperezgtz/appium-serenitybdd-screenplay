package gt.com.tigo.qa.tasks;

import net.serenitybdd.screenplay.Tasks;

public class Seleccionar {
    public static LosDetallesDeMensajes losDetallesDeMensajes(){
        return Tasks.instrumented(LosDetallesDeMensajes.class);
    }
}
