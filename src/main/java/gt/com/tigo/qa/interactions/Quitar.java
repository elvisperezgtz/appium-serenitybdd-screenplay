package gt.com.tigo.qa.interactions;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.appium.java_client.android.nativekey.AndroidKey.BACK;

public class Quitar implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver()).getProxiedDriver();
        ((AndroidDriver) driver).executeScript("mobile: acceptAlert");
    }
    public static Quitar notificacion () {
        return Tasks.instrumented(Quitar.class);

    }
//    execute("mobile: <commandName>", <JSON serializable argument>)
}
