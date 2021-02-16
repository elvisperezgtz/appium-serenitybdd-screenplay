package gt.com.tigo.qa.tasks;

import com.google.common.collect.ImmutableMap;

import gt.com.tigo.qa.interactions.Nueva;
import gt.com.tigo.qa.userinterfaces.ChromeUI;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.appium.java_client.android.nativekey.AndroidKey.ENTER;
import static org.openqa.selenium.By.id;

public class AbrirElNavegador implements Task {

    private WebDriver webDriverFacade;
    private String link;

    public AbrirElNavegador(WebDriver webDriverFacade, String link) {
        this.webDriverFacade = webDriverFacade;
        this.link = link;
    }

    @Override
    @Step("{0} ingresa el link #link en la barra de direcciones del navegador")
    public <T extends Actor> void performAs(T actor) {

        if(ChromeUI.TITULO_BIENVENIDA.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Configurar.elNavegador()
            );
        }
        actor.attemptsTo(Nueva.pestania());
            WebDriver driver = ((WebDriverFacade) webDriverFacade).getProxiedDriver();
            MobileElement element = driver.findElement(id("com.android.chrome:id/url_bar"));
            element.click();
            List enterText = Arrays.asList("text", link);
            Map<String, Object> cmd = ImmutableMap
                    .of("command", "input", "args", enterText);
            ((AndroidDriver) driver).executeScript("mobile: shell", cmd);
            ((AndroidDriver) driver).pressKey(new KeyEvent(ENTER));

    }
    public static AbrirElNavegador en(WebDriver webDriverFacade, String url){
        return Tasks.instrumented(AbrirElNavegador.class, webDriverFacade,url);
    }
}
