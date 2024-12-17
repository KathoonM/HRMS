package com.cognitest.testcases;

import java.util.List;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.listener.TestListener;
import com.page.base.MenuPage;
import com.page.base.CognitestPageHook;

@Listeners(TestListener.class)
public class TC_04 extends CognitestPageHook {

    @BeforeTest(groups = {"Tier1Admin", "Tier1User", "Tier2Admin", "Tier2User"})
    public void setReportValues() {
        testcaseName = "TC_Login_Test";
        testDescription = "Successful login with valid credentials redirects to the dashboard.";
        authors = "YourName";
        category = "Login";
    }

    @Test(priority = 1, groups = {"Tier1Admin", "Tier1User", "Tier2Admin", "Tier2User"})
    public void Jobtitlecreation() {
        startTestCase();
        setNode();

        // Steps for the login test case
        new MenuPage()

                .navigateToLoginPage()  // Method to navigate to login page
                .enterUsername("Admin")  // Method to enter username
                .enterPassword("admin123")  // Method to enter password
                .clickOnLoginButton()// Method to click login
                .navigateToAdminModule()// Method to navigate to admin module
                .clickOnJobTitleButton()//Method to click job drop down menu
                .clickOnJobTitle() // Method to click on job title option
                .clickaddOnJobTitle()// Method to click on add button
                .enterJobDescription()// method to enter job title
                .enterJobTitle() // method to enter job description
                .jobTitlecreation()// method to create job title
                .editjobtitle() // method to click on edit icon
                .enterJobTitle() // method to modify the job title
                .jobTitlecreation() // method to save the updation
                .deletionjobtitle()// method to click delete button
                .confirmDeletion();// method to delete the item
    }
    }
