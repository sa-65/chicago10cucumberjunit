package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {

    public DataTablesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy(xpath = "//div[@class='DTE_Body']")
    public WebElement newEntryBox;

    @FindBy(css = "#DTE_Field_first_name")
    public WebElement firstNameInput;

    @FindBy(css = "#DTE_Field_last_name")
    public WebElement lastNameInput;

    @FindBy(css = "#DTE_Field_position")
    public WebElement positionInput;

    @FindBy(css = "#DTE_Field_office")
    public WebElement officeInput;

    @FindBy(css = "#DTE_Field_extn")
    public WebElement extensionInput;

    @FindBy(css = "#DTE_Field_start_date")
    public WebElement startDateInput;

    @FindBy(css = "#DTE_Field_salary")
    public WebElement salaryInput;

    @FindBy(css = "button.btn[tabindex='0']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement tableSearchBox;

    @FindBy(css = "td.sorting_1")
    public WebElement nameOnList;










}
