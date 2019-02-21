package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonSearchPage {

    public AmazonSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(css = "input.nav-input[type='submit']")
    public WebElement searchButton;

    @FindBy(css = ".a-color-state.a-text-bold")
    public WebElement searchResult;

}
