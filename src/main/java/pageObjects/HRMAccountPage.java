package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class HRMAccountPage {

    @FindBy(xpath = "//a[@id='welcome']")
    private SelenideElement welcomeButton;

    @FindBy(xpath = "//*[@id='welcome-menu']/ul/li[2]/a")
    private SelenideElement logoutButton;

    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
    private SelenideElement pimButton;

    @FindBy(xpath = "//input[@name='empsearch[employee_name][empName]']")
    private SelenideElement empNameTextBox;

    @FindBy(xpath = "//input[@name='empsearch[supervisor_name]']")
    private SelenideElement superNameTextBox;

    @FindBy(xpath = "//input[@name='empsearch[id]']")
    private SelenideElement idTextBox;

    @FindBy(xpath = "//select[@name='empsearch[job_title]']")
    private SelenideElement jobTitleDropBox;

    @FindBy(xpath = "//select[@name='empsearch[employee_status]']")
    private SelenideElement empStatusDropBox;

    @FindBy(xpath = "//input[@id='searchBtn']")
    private SelenideElement searchButton;

    @FindBy(xpath = "//input[@id='btnAdd']")
    private SelenideElement addButton;

    @FindBy(xpath = "//input[@id='firstName']")
    private SelenideElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='middleName']")
    private SelenideElement middleNameTextBox;

    @FindBy(xpath = "//input[@id='lastName']")
    private SelenideElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='chkLogin']")
    private SelenideElement createLoginDetailsRadioButton;

    @FindBy(xpath = "//input[@id='btnSave']")
    private SelenideElement saveButton;

    @FindBy(xpath = "//input[@id='user_name']")
    private SelenideElement usernameTextBox;

    @FindBy(xpath = "//input[@id='user_password']")
    private SelenideElement userPasswordTextBox;

    @FindBy(xpath = "//input[@id='re_password']")
    private SelenideElement confirmUserPasswordTextBox;

    @FindBy(xpath = "//select[@id='status']")
    private SelenideElement statusDropBox;

    @FindBy(xpath = "//*[@id='profile-pic']/h1")
    private SelenideElement employeeDetails;

    public HRMAccountPage logout(String successMessage) {
        welcomeButton.shouldHave(Condition.matchesText(successMessage));
        welcomeButton.shouldBe(Condition.visible).click();
        logoutButton.shouldBe(Condition.visible).click();
        return page(HRMAccountPage.class);
    }

    public HRMAccountPage searchEmployeeInfo(String empName, String superName, String id, String jobTitle, String empStatus) {
        pimButton.shouldBe(Condition.visible).click();
        empNameTextBox.shouldBe(Condition.visible).setValue(empName);
        superNameTextBox.shouldBe(Condition.visible).setValue(superName);
        idTextBox.shouldBe(Condition.visible).setValue(id);
        jobTitleDropBox.shouldBe(Condition.visible).selectOptionContainingText(jobTitle);
        empStatusDropBox.shouldBe(Condition.visible).selectOptionContainingText(empStatus);
        searchButton.shouldBe(Condition.visible).click();
        return page(HRMAccountPage.class);
    }

    public HRMAccountPage addEmployee(String firstName, String middleName, String lastName, String username, String userPassword) {
        pimButton.shouldBe(Condition.visible).click();
        addButton.shouldBe(Condition.visible).click();
        firstNameTextBox.shouldBe(Condition.visible).setValue(firstName);
        middleNameTextBox.shouldBe(Condition.visible).setValue(middleName);
        lastNameTextBox.shouldBe(Condition.visible).setValue(lastName);
        createLoginDetailsRadioButton.shouldBe(Condition.visible).selectRadio("1");
        usernameTextBox.shouldBe(Condition.visible).setValue(username);
        userPasswordTextBox.shouldBe(Condition.visible).setValue(userPassword);
        confirmUserPasswordTextBox.shouldBe(Condition.visible).setValue(userPassword);
        statusDropBox.shouldBe(Condition.visible).selectOptionContainingText("Enabled");
        saveButton.shouldBe(Condition.visible).click();
        employeeDetails.shouldBe(Condition.matchesText(firstName+" "+middleName+" "+lastName));
        return page(HRMAccountPage.class);
    }
}
