package gt.com.tigo.qa.utils.actions;

import com.google.common.collect.ImmutableMap;
import gt.com.tigo.qa.utils.enums.Direccion;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.appium.java_client.android.nativekey.AndroidKey.ENTER;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class actions extends PageObject {

    public static void enterTextMethod(WebDriver fecade, String inputText){
        WebDriver driver = ((WebDriverFacade) fecade).getProxiedDriver();
        MobileElement element =  driver.findElement(By.id("com.android.chrome:id/url_bar"));
        element.click();
        List enterText = Arrays.asList("text", inputText);
        Map<String, Object> cmd = ImmutableMap
                .of("command", "input", "args", enterText);
        ((AndroidDriver)driver).executeScript("mobile: shell", cmd);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public static void executeShellCommand(WebElementFacade elementFacade){
        WebDriver driver = ((WebDriverFacade) as(theActorInTheSpotlight()).getDriver()).getProxiedDriver();
        ((AndroidDriver)driver).executeScript("mobile: scroll", ImmutableMap.of("direction","down"));
    }
    public static void abrirApp(WebDriver fecade) {
        WebDriver driver = ((WebDriverFacade) fecade).getProxiedDriver();
        ((AndroidDriver) driver).startActivity(new Activity(" com.android.chrome", "com.google.android.apps.chrome.Main"));

    }
    public static String getActivityName(WebDriver fecade) {
        WebDriver driver = ((WebDriverFacade) fecade).getProxiedDriver();
        return ((AndroidDriver) driver).currentActivity();

    }

    public static void pressEnter(WebDriver fecade,  String text) {
        WebDriver driver = ((WebDriverFacade) fecade).getProxiedDriver();


        ((AndroidDriver)driver).findElement(By.id("com.android.chrome:id/url_bar")).sendKeys(text);
        ((AndroidDriver)driver).findElement(By.id("com.android.chrome:id/url_bar")).click();
        ((AndroidDriver)driver).pressKey(new KeyEvent(ENTER));

    }

    public static void deslizaHacia(Direccion direccion, WebElementFacade elemento, WebDriver facade){
        WebDriver driver= ((WebDriverFacade) facade).getProxiedDriver();
        TouchAction actions = new TouchAction((MobileDriver)driver) ;

        int intento;
        int maxIntento = 5;

        int puntoX = (int)(facade.manage().window().getSize().width / 2.1);
        int abajoY = (int)(facade.manage().window().getSize().height * 0.8);
        int arribaY = (int)(facade.manage().window().getSize().height * 0.6);
        intento = 1;

        switch (direccion) {
            case ABAJO:
                while ( intento < maxIntento )
                {
                    actions.press(PointOption.point(puntoX, abajoY)).moveTo(PointOption.point(puntoX, arribaY)).release().perform();
                    intento++;
                    if (elemento.isVisible()){
                        break;
                    }
                }
                break;
            case ARRIBA:
                while ( intento < maxIntento ) {
                    actions.press(PointOption.point(puntoX, arribaY)).moveTo(PointOption.point(puntoX, abajoY)).release().perform();
                    intento++;
                    if (elemento.isVisible()){
                        break;
                    }
                }
                break;
        }
    }
}
