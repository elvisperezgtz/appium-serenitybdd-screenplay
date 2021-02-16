package gt.com.tigo.qa.interactions;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

public class Abrir {

    public static void laApp(WebDriver fecade, String appPackage, String activity) {
        WebDriver driver = ((WebDriverFacade) fecade).getProxiedDriver();
        ((AndroidDriver) driver).startActivity(new Activity(appPackage, activity));
    }
    public static void cerrarApp(WebDriver fecade){
        WebDriver driver = ((WebDriverFacade) fecade).getProxiedDriver();
        ((AndroidDriver) driver).closeApp();
    }
}
