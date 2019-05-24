package tests;

import org.testng.annotations.Test;
import pageObjects.HRMAccountPage;
import pageObjects.HRMHomePage;
import pageObjects.Utils;

import static com.codeborne.selenide.Selenide.*;

public class LoginWithValidDataTC01 extends BaseTest {

    @Test
    public void loginWithValidData() {
        HRMHomePage hrmHomePage = open(Utils.URL, HRMHomePage.class);
        HRMAccountPage hrmAccountPage = hrmHomePage.login("Admin", "admin123");
        hrmAccountPage.logout();
    }

}
