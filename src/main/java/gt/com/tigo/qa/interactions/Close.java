package gt.com.tigo.qa.interactions;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

public class Close implements Interaction {
    private WebDriver driverFacade;


    public Close(WebDriver driverFacade) {
        this.driverFacade = driverFacade;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ((WebDriverFacade) driverFacade).getProxiedDriver();
        ((AndroidDriver)driver).closeApp();
    }
    public static Close theActivity(WebDriver driverFacade){
        return Tasks.instrumented(Close.class, driverFacade);
    }
}
