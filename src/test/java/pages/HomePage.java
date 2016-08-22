package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Thanh Nguyen on 12/08/2016.
 */
public class HomePage extends BasePage {

    By addItemTxb = By.id(app_package_name + "autocomplete_add_item");
    By addBtn = By.id(app_package_name + "button_add_item");
    By listItem = By.id(app_package_name + "list_items");
    By checkbox = By.id(app_package_name + "check");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public Integer GetTotalItems() {
        waitForVisibilityOf(listItem);
        return find_and_count_items(checkbox);
    }

    public void AddNewItem() {
        waitForVisibilityOf(addItemTxb);
        find_and_sent_text_element(addItemTxb, randomBook);
        find_and_click_element(addBtn);
    }


}
