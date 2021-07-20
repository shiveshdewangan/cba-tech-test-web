package StepDefinitions;

import PageObjects.BattleFieldPage;
import PageObjects.GamePage;
import PageObjects.HomePage;
import PageObjects.LeaderBoardPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Utilities.ConfigFileReader;

public class Steps {

    private static WebDriver driver;
    public BattleFieldPage battleFieldPage;
    public GamePage gamePage;
    public HomePage homePage;
    public LeaderBoardPage leaderBoardPage;
    private ConfigFileReader config = new ConfigFileReader();
    private final String AUT_URL = config.getProperty("aut_url");
    private final String USER_NAME = config.getProperty("username");

    public Steps() {
        this.driver = Hooks.getDriver();
    }

    @Given("^The user is on the home page$")
    public void theUserIsOnTheHomePage() throws Throwable {
        driver.get(AUT_URL);
    }

    @Then("^The user creates a new warrior$")
    public void theUserCreatesANewWarrior() throws Throwable {
        homePage = new HomePage(driver);

        if (homePage.getWarriorNameHeaderText().equalsIgnoreCase("Tell me your warrior name")) {
            homePage.typeWarriorName(USER_NAME);
            homePage.clickCreateWarriorBtn();
            homePage.clickStartYourJourneyBtn();
        } else {
            Assert.fail("Home page was not loaded");
        }
    }

    @Then("^The user chooses the battle field$")
    public void theUserChoosesTheBattleField() throws Throwable {
        battleFieldPage = new BattleFieldPage(driver);

        if (battleFieldPage.getWelcomeText().contains("Choose your battle field")) {
            Assert.assertTrue(battleFieldPage.isBusLinkDisplayed());
            Assert.assertTrue(battleFieldPage.isNewsLinkDisplayed());
            Assert.assertTrue(battleFieldPage.isOfficeLinkDisplayed());
            Assert.assertTrue(battleFieldPage.isRestaurantLinkDisplayed());
            battleFieldPage.startBusGame();
        }
    }

    @Then("^The user plays the game$")
    public void theUserPlaysTheGame() throws Throwable {
        gamePage = new GamePage(driver);

        gamePage.clickBusGameStartBtn();
        gamePage.clickBusAnswerBtn();
        gamePage.clickCheckFinalScoreBtn();
    }

    @And("^The user can see score on the leaderboard$")
    public void theUserCanSeeScoreOnTheLeaderboard() throws Throwable {
        leaderBoardPage = new LeaderBoardPage(driver);

        Assert.assertEquals(leaderBoardPage.getLeaderBoardHeaderText(), "COVID-19 THE GAME - LEADERBOARD");
        String finalScore = leaderBoardPage.getFinalScore();
    }
}
