package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Thanh Nguyen on 22/08/2016.
 */
public class BasePage {

    protected WebDriver driver;
    String app_package_name = "org.openintents.shopping:id/";
    Faker faker = new Faker();
    String randomBook = faker.book().title();

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void find_and_click_element(By locator) {
        driver.findElement(locator).click();
    }

    protected void find_and_sent_text_element(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    protected boolean isElementDisplayed(By locator) {
        return !driver.findElements(locator).isEmpty();
    }

    protected Integer find_and_count_items(By locator) {
        if (isElementDisplayed(locator) == true) {
            return driver.findElements(locator).size();
        }else{
            return 0;
        }
    }

}
