package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class DataTable_steps {
    DataTablesPage dtp=new DataTablesPage();



    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");


    }

    @Given("User clicks to New Button")
    public void user_clicks_to_New_Button() {

        dtp.newButton.click();
    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() {

        Assert.assertTrue(dtp.newEntryBox.isDisplayed());

    }

    @Then("User should enter first name")
    public void user_should_enter_first_name() {
        dtp.firstNameInput.sendKeys("JOE");

    }

    @Then("User should enter last name")
    public void user_should_enter_last_name() {
        dtp.lastNameInput.sendKeys("WICK");
    }

    @Then("User should enter position")
    public void user_should_enter_position() {

        dtp.positionInput.sendKeys("Retired");
    }

    @Then("User should enter office")
    public void user_should_enter_office() {

        dtp.officeInput.sendKeys("London");

    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
        dtp.extensionInput.sendKeys("123");
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {

        dtp.startDateInput.sendKeys("2019-10-24");
    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
        dtp.salaryInput.sendKeys("120000");

    }

    @Then("User should clicks to create button")
    public void user_should_clicks_to_create_button() {

        dtp.createButton.click();
    }

    @Then("User enters first name to search box")
    public void user_enters_first_name_to_search_box() {

        dtp.tableSearchBox.sendKeys("JOE");
    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() {
       Assert.assertTrue(dtp.nameOnList.getText().contains("JOE"));
    }

    @Then("User should enter first name {string}")
    public void user_should_enter_first_name(String firstName) {
      dtp.firstNameInput.sendKeys(firstName);
    }

    @Then("User should enter last name {string}")
    public void user_should_enter_last_name(String lastName) {

        dtp.lastNameInput.sendKeys(lastName);
    }

    @Then("User should enter position {string}")
    public void user_should_enter_position(String position) {
        dtp.positionInput.sendKeys(position);

    }

    @Then("User enters first name {string}  to search box")
    public void user_enters_first_name_to_search_box(String firstName) {
        dtp.tableSearchBox.sendKeys(firstName);

    }

    @Then("User should see first name {string} is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String expectedName) {
        //TODO
        BrowserUtils.wait(1);
        Assert.fail();
        Assert.assertTrue(dtp.nameOnList.getText().contains(expectedName));
    }

    @Then("User should enter office {string}")
    public void user_should_enter_office(String office) {
        dtp.officeInput.sendKeys(office);
    }

    @Then("User should enter extension {string}")
    public void user_should_enter_extension(String extension) {
        dtp.extensionInput.sendKeys(extension);

    }

    @Then("User should enter start date {string}")
    public void user_should_enter_start_date(String startDate) {
        dtp.startDateInput.sendKeys(startDate);
    }

    @Then("User should enter salary {string}")
    public void user_should_enter_salary(String salary) {

        dtp.salaryInput.sendKeys(salary);
    }



}
