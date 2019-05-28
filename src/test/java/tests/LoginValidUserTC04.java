package tests;

import org.testng.annotations.Test;
import pageObjects.HRMAccountPage;
import pageObjects.HRMHomePage;
import pageObjects.Utils;

import static com.codeborne.selenide.Selenide.open;

public class LoginValidUserTC04 extends BaseTest {
    @Test
    public void loginValidUser() {
        HRMHomePage hrmHomePage = open(Utils.URL, HRMHomePage.class);
        HRMAccountPage hrmAccountPage = hrmHomePage.login("AprilMay", "SSdd00AA00");
        hrmAccountPage.logout("Welcome April");
    }

}
