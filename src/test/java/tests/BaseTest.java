package tests;

import com.codeborne.selenide.Configuration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    @BeforeTest
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.timeout = 4000;
    }

    @AfterTest
    public void cleanUp(){

    }
}
