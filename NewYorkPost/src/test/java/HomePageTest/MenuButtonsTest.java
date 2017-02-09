package HomePageTest;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by admin on 2/9/17.
 */
public class MenuButtonsTest extends Base{

    public MainPage mp(){
        return PageFactory.initElements(ad,MainPage.class);
    }

    @Test
    public void menuButtonsTest(){
//        mp().getTopStories();
        mp().getSavedArticles();
        mp().getNews();
        mp().getMetro();
        mp().getPageSix();
        mp().getSports();
        mp().getBusiness();
        mp().getOpinion();
        mp().getEntertainment();
    }
}
