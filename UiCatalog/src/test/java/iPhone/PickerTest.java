package iPhone;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import HomePageTest.PickersPage.Picker;
import HomePageTest.UiCatalogPage.UiCatalog;

/**
 * Created by Bilal on 24-01-2017.
 */
public class PickerTest extends Base {
    String[] pickerName = {"Chris Armstrong","3"};
    String[] pickerDate = {"March","10","2018"};
    public Picker picker(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getPickers();
        return PageFactory.initElements(ad,Picker.class);
    }
    @Test
    public void testUIPicker(){
//        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
//        uiCatalog.getPickers();
//        Picker picker = PageFactory.initElements(ad, Picker.class);
        picker().getUIPicker();//.selectPickerTwoWheels("Chris Armstrong","3");
        scrollKeys(ad, pickerName,"//UIAPicker[1]");
    }
    @Test
    public void testDatePicker(){
//        UiCatalog uiCatalog = PageFactory.initElements(ad,UiCatalog.class);
//        uiCatalog.getPickers();
//        Picker picker = PageFactory.initElements(ad, Picker.class);
        picker().getUIDatePicker();
        scrollKeys(ad, pickerDate,"//UIAPicker[2]");
    }

}
