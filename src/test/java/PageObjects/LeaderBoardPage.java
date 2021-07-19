package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeaderBoardPage extends BasePage {

    @FindBy(className = "option-label")
    WebElement leaderBoardHeaderText;

    @FindBy(tagName = "td")
    List<WebElement> tableRowsCols;

    public LeaderBoardPage(WebDriver driver) {
        super(driver);
    }

    public String getLeaderBoardHeaderText() {
        return leaderBoardHeaderText.getText();
    }

    public String getFinalScore() {
        String score = "";
        for (int i = 0; i < tableRowsCols.size(); i++) {
            if (tableRowsCols.get(i).getText().equalsIgnoreCase("dews1234")) {
                score = tableRowsCols.get(i + 1).getText();
                break;
            }
        }
        return score;
    }
}
