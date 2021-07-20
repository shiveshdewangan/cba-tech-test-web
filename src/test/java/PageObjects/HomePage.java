package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(className = "summary")
    WebElement worriorNameHeaderText;

    @FindBy(id = "worrior_username")
    WebElement worriorNameInputField;

    @FindBy(id = "warrior")
    WebElement createWorriorBtn;

    @FindBy(id = "start")
    WebElement startYourJourneyBtn;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getWarriorNameHeaderText() {
        return worriorNameHeaderText.getText();
    }

    public void typeWarriorName(String warrior_name) {
        worriorNameInputField.sendKeys(warrior_name);
    }

    public void clickCreateWarriorBtn() {
        createWorriorBtn.click();
    }

    public void clickStartYourJourneyBtn() {
        startYourJourneyBtn.click();
    }

}
