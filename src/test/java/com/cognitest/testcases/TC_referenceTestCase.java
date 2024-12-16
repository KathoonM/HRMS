package com.cognitest.testcases;

import java.util.List;

import com.config.ConfigurationManager;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.data.dynamic.FakerDataFactory;
import com.listener.TestListener;
import com.page.base.MenuPage;
import com.page.base.CognitestPageHook;

@Listeners(TestListener.class)
public class TC_referenceTestCase extends CognitestPageHook {

    @BeforeTest(groups = {"Tier1Admin", "Tier1User", "Tier2Admin", "Tier2User"})
    public void setReportValues() {
        testcaseName = "TC_Login_Test";
        testDescription = "Successful login with valid credentials redirects to the dashboard.";
        authors = "YourName";
        category = "Login";
    }

    @Test(priority = 1, groups = {"Tier1Admin", "Tier1User", "Tier2Admin", "Tier2User"})
    public void successfulLogin() {
        startTestCase();
        setNode();

        // Steps for the login test case
        new MenuPage()

                .navigateToLoginPage()  // Method to navigate to login page
                .enterUsername("Admin")  // Method to enter username
                .enterPassword("admin123")  // Method to enter password
                .clickOnLoginButton()// Method to click login
                .navigateToPIMModule()
                .clickOnAddEmployeeButton()
                .enterFirstName()
                .enterMiddleName()
                .enterLastName()
                .clickOnSaveButton();



    }
}

