package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubeSearchPage {


    public YoutubeSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#search")
    public WebElement searchBox;

    @FindBy(css = "#search-icon-legacy")
    public WebElement searchButton;

}
