package gt.com.tigo.qa.questions;

import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

public class ElIcono implements Question<Boolean> {
    @Override
    @Step("{0} deberia ver el icono de perfil")
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(HomeAppUI.ICONO_PERFIL.waitingForNoMoreThan(Duration.ofSeconds(10))).viewedBy(actor).asBoolean();
    }

    public static ElIcono delPerfil(){
        return new ElIcono();
    }

}
