package tests;

import org.testng.annotations.Test;
import pageObjects.HRMAccountPage;
import pageObjects.HRMHomePage;
import pageObjects.Utils;

import static com.codeborne.selenide.Selenide.open;

public class SearchEmployeeWithValidDataTC02 {
    @Test
    public void searchEmployeeWithValidData() {
        HRMHomePage hrmHomePage = open(Utils.URL, HRMHomePage.class);
        HRMAccountPage hrmAccountPage = hrmHomePage.loginValidAdmin("Admin", "admin123");
        hrmAccountPage.searchEmployeeInfo("Linda Anderson", "John Smith", "0001",
                "HR Manager", "Full-Time Permanent");
    }
}
