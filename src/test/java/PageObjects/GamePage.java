package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamePage extends BasePage {

    @FindBy(id = "bus_timer_start")
    WebElement busGameStartBtn;

    @FindBy(id = "bus_answer_1")
    WebElement busAnswerBtn;

    @FindBy(id = "leaderboard_link")
    WebElement checkFinalScoreBtn;

    public GamePage(WebDriver driver) {
        super(driver);
    }

    public void clickBusGameStartBtn() {
        busGameStartBtn.click();
    }

    public void clickBusAnswerBtn() {
        busAnswerBtn.click();
    }

    public void clickCheckFinalScoreBtn() {
        checkFinalScoreBtn.click();
    }
}
