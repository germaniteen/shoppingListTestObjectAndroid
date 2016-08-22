package scenarios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testobject.appium.testng.AppiumDriverProvider;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Thanh Nguyen on 22/08/2016.
 */
public class AndroidSetup implements AppiumDriverProvider {

    protected AndroidDriver driver;

    @Override
    public AppiumDriver getAppiumDriver() {
        return this.driver;
    }

    protected void prepareAndroidForAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("testobject_api_key","A32593F9DB0F4BB3AFEB6AB20DD710DE");
        capabilities.setCapability("testobject_app_id","1");
        capabilities.setCapability("testobject_device","LG_Nexus_4_E960_real");
        driver = new AndroidDriver(new URL("http://appium.testobject.com/wd/hub"), capabilities);
    }
}
