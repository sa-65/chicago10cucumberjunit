package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikipediaPage {

    public  WikipediaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#searchInput")
    public WebElement searchBox;

    @FindBy(css = "#firstHeading")
    public WebElement firstHeader;


}
