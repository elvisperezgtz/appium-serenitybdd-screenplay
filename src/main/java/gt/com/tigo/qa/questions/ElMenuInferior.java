package gt.com.tigo.qa.questions;

import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

import java.time.Duration;

public class ElMenuInferior implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(HomeAppUI.MENU_INFERIOR.waitingForNoMoreThan(Duration.ofSeconds(10))).viewedBy(actor).asBoolean();
    }

    public static ElMenuInferior esVisible()
    {
        return new ElMenuInferior();
    }
}
