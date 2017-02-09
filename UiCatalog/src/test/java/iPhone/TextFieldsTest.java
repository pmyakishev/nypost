package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import HomePageTest.NavigateUi;
import HomePageTest.TextFieldsPage.TextFields;
import HomePageTest.UiCatalogPage.UiCatalog;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextFieldsTest extends NavigateUi {

    TextFields textFields = new TextFields();

    @Test
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getTextFields();
        textFields.writeTextToFields();

    }
}
