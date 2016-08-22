package scenarios;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testobject.appium.testng.TestObjectTestNGTestResultWatcher;
import pages.HomePage;

/**
 * Created by Thanh Nguyen on 22/08/2016.
 */

@Listeners({ TestObjectTestNGTestResultWatcher.class })
public class AppiumTest extends AndroidSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test( priority = 1 )
    public void AddNewItemTest()
    {
        HomePage homePage = new HomePage(driver);
        Integer beforeAddNewItem;
        Integer afterAddNewItem;

        beforeAddNewItem = homePage.GetTotalItems();
        homePage.AddNewItem();
        afterAddNewItem = homePage.GetTotalItems();

        Assert.assertEquals(true,afterAddNewItem == beforeAddNewItem + 1);
    }
}
