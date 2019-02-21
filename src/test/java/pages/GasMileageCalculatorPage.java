package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GasMileageCalculatorPage {


    public GasMileageCalculatorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id="uscodreading")
    public WebElement currentOdometerInput;

    @FindBy(id="uspodreading")
    public WebElement previousOdometerInput;

    @FindBy(id="usgasputin")
    public WebElement gallonsInput;

    @FindBy(id="usgasprice")
    public WebElement gasPriceInput;

    @FindBy(css="[type='image']")
    public WebElement calculateButton;

    @FindBy(xpath="//b[contains(text(),'miles per gallon')]")
    public WebElement resultInGallon;




}
