package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyHomePage {

    public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "search-query")
    public WebElement serachBoxInput;

    @FindBy(css = ".btn.btn-primary[Value='Search']")
    public WebElement serachButton;



}
