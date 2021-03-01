package gt.com.tigo.qa.tasks;

import net.serenitybdd.screenplay.Tasks;


public class Quitar  {
    public static ElBanner elBanner(){
        return Tasks.instrumented(ElBanner.class);
    }
    public static LaEncuesta laEncuesta(){
        return Tasks.instrumented(LaEncuesta.class);
    }

}
