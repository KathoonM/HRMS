package com.cognitest.testcases;

import java.util.List;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.listener.TestListener;
import com.page.base.MenuPage;
import com.page.base.CognitestPageHook;

@Listeners(TestListener.class)
public class TC_05 extends CognitestPageHook {

    @BeforeTest(groups = {"Tier1Admin", "Tier1User", "Tier2Admin", "Tier2User"})
    public void setReportValues() {
        testcaseName = "TC_Login_Test";
        testDescription = "Successful login with valid credentials redirects to the dashboard.";
        authors = "YourName";
        category = "Login";
    }

    @Test(priority = 1, groups = {"Tier1Admin", "Tier1User", "Tier2Admin", "Tier2User"})
    public void Generalinformationupdation() {
        startTestCase();
        setNode();

        // Steps for the login test case
        new MenuPage()

                .navigateToLoginPage()  // Method to navigate to login page
                .enterUsername("Admin")  // Method to enter username
                .enterPassword("admin123")  // Method to enter password
                .clickOnLoginButton()// Method to click login
                .navigateToAdminModule()// Method to navigate to admin module
                .organizationButton() // Method to click organization
                .clickOnGeneralinformation() // Method to click general information option
                .editToggle() // Method to click on edit toggle
                .enterOrganizationName("tickingminds software limited") // Method to enter the organization name
                .updatingGeneralinformation(); // Method to update the general information
    }
}