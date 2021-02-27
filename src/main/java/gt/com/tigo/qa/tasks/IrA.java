package gt.com.tigo.qa.tasks;

import net.serenitybdd.screenplay.Tasks;

public class IrA {
    public static LaSeccion laSeccion (String tipoLLamada){
        return Tasks.instrumented(LaSeccion.class, tipoLLamada);
    }
    public static LaSeccionConsumos laSeccionConsumos(){
        return Tasks.instrumented(LaSeccionConsumos.class);
    }
}
