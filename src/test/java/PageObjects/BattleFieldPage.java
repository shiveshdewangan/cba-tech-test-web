package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BattleFieldPage extends BasePage {

    @FindBy(id = "welcome_text")
    WebElement welcomeText;

    @FindBy(id = "bus")
    WebElement busLink;

    @FindBy(id = "news")
    WebElement newsLink;

    @FindBy(id = "restaurant")
    WebElement restaurantLink;

    @FindBy(id = "office")
    WebElement officeLink;

    public BattleFieldPage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeText() {
        return welcomeText.getText();
        // Choose your battle field dews1234
    }

    public boolean isBusLinkDisplayed() {
        return busLink.isDisplayed();
    }

    public boolean isNewsLinkDisplayed() {
        return newsLink.isDisplayed();
    }

    public boolean isRestaurantLinkDisplayed() {
        return restaurantLink.isDisplayed();
    }

    public boolean isOfficeLinkDisplayed() {
        return officeLink.isDisplayed();
    }

    public void startBusGame() {
        busLink.click();
    }
}
