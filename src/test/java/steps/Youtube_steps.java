package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.YoutubeSearchPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class Youtube_steps {

    YoutubeSearchPage ytb=new YoutubeSearchPage();
    @Given("User is on the youtube homepage")
    public void user_is_on_the_youtube_homepage() {
        Driver.getDriver().get("https://www.youtube.com/");
    }

    @Given("User is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
        Assert.assertTrue(ytb.searchBox.isDisplayed());
    }

    @Given("User is able to see the search button")
    public void user_is_able_to_see_the_search_button() {

      Assert.assertTrue(ytb.searchButton.isDisplayed());
    }

    @When("User searches for FUNNY CAT VIDEOS")
    public void user_searches_for_FUNNY_CAT_VIDEOS() {
        ytb.searchBox.sendKeys("FUNNY CAT VIDEOS");
        ytb.searchButton.click();

    }

    @Then("User should see the results related funny cat videos")
    public void user_should_see_the_results_related_funny_cat_videos() {
        BrowserUtils.wait(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("FUNNY CAT VIDEOS"));
    }

    @When("User searches for FUNNY DOG VIDEOS")
    public void user_searches_for_FUNNY_DOG_VIDEOS() {
        ytb.searchBox.sendKeys("FUNNY DOG VIDEOS");
        ytb.searchButton.click();
    }

    @Then("User should see the results related funny dog videos")
    public void user_should_see_the_results_related_funny_dog_videos() {
        BrowserUtils.wait(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("FUNNY DOG VIDEOS"));
    }

    @When("User searches for FUNNY PET VIDEOS")
    public void user_searches_for_FUNNY_PET_VIDEOS() {
        ytb.searchBox.sendKeys("FUNNY PET VIDEOS");
        ytb.searchButton.click();
    }

    @Then("User should see the results related funny pet videos")
    public void user_should_see_the_results_related_funny_pet_videos() {
        BrowserUtils.wait(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("FUNNY PET VIDEOS"));
    }

}
