package tests;

import org.testng.annotations.Test;
import pageObjects.HRMAccountPage;
import pageObjects.HRMHomePage;
import pageObjects.Utils;

import static com.codeborne.selenide.Selenide.open;

public class AddEmployeeWithValidDataTC03 {
    @Test
    public void addEmployeeWithValidData() {
        HRMHomePage hrmHomePage = open(Utils.URL, HRMHomePage.class);
        HRMAccountPage hrmAccountPage = hrmHomePage.login("Admin", "admin123");
        hrmAccountPage.addEmployee("AprilS", "MayS", "SpringS", "AprilMayS", "SSdd00AA00");
    }
}
