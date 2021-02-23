package gt.com.tigo.qa.interactions;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Esperar implements Interaction {

    private int segundos;

    public Esperar(int segundos) {this.segundos = segundos;}

    @Override
    @Step("{0} espera por la lista de lineas")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver()).getProxiedDriver();
        ((AndroidDriver)driver).manage().timeouts().implicitlyWait(segundos,TimeUnit.SECONDS);
    }

    public static Esperar por(int segundos){return Tasks.instrumented(Esperar.class,segundos);}
}
