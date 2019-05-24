package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class HRMHomePage {
    @FindBy(xpath = "//input[@name='txtUsername']")
    private SelenideElement usernameTextBox;
    @FindBy(xpath = "//input[@name='txtPassword']")
    private SelenideElement passwordTextBox;
    @FindBy(xpath = "//input[@name='Submit']")
    private SelenideElement loginButton;


    public HRMAccountPage login(String username,String password){
        usernameTextBox.shouldBe(Condition.visible).setValue(username);
        passwordTextBox.shouldBe(Condition.visible).setValue(password);
        loginButton.shouldBe(Condition.visible).click();
        return page(HRMAccountPage.class);
    }
}
