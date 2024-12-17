package com.page.base;

import com.data.dynamic.FakerDataFactory;

public class MenuPage extends CognitestPageHook {
    public FakerDataFactory dataFactory;
    // Locator for username field
    protected String usernameField = "//input[@name = 'username']";

    // Locator for password field
    protected String passwordField = "//input[@name = 'password']";

    // Locator for login button
    protected String loginButton = "//button[@type= 'submit']";

    protected String firstName = "//input[@name = 'firstName']";

    protected String middleName = "//input[@name = 'middleName']";

    protected String lastName = "//input[@name = 'lastName']";

    protected String paygradeFieldLocator = "(//input[@class = 'oxd-input oxd-input--active'])[2]";

    protected String jobtitleFieldLocator = "(//input[@class='oxd-input oxd-input--active'])[2]";


    public MenuPage navigateToLoginPage() {
        getPage().navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        return this;
    }

    public MenuPage enterUsername(String username) {
        dataFactory = new FakerDataFactory();
        typeWithType("//input[@name = 'username']", "Admin", "Username");
        return this;
    }

    public MenuPage enterPassword(String password) {
        typeWithType("//input[@name = 'password']", "admin123", "Password");
        return this;
    }

    public MenuPage clickOnLoginButton() {
        click("//button[@type= 'submit']", "Login");
        return this;
    }

    public MenuPage navigateToPIMModule() {
        // Assuming the locator for PIM module navigation
        String pimModuleLocator = "//span[.='PIM']";
        click(pimModuleLocator, "PIM Module");
        return this;
    }

    // Navigation of admin module
    public MenuPage navigateToAdminModule() {
        String adminModuleLocator = "(//span[.='Admin'])[1]";
        click(adminModuleLocator, "Admin Module");
        return this;
    }

    public MenuPage clickOnJobTitleButton() {
        String jobTitleButtonLocator = "(//span[@class ='oxd-topbar-body-nav-tab-item'])[2]";
        click(jobTitleButtonLocator, "job options");
        return this;
    }

    public MenuPage clickOnJobTitle() {
        String jobTitleLocator = "//a[.='Job Titles']";
        click(jobTitleLocator, "job title Button");
        return this;
    }

    public MenuPage clickaddOnJobTitle() {
        String addJobTitleLocator = "(//button[@type = 'button'])[4]";
        click(addJobTitleLocator, "add job title Button");
        return this;
    }

    public MenuPage enterJobTitle(String jobtitle) {
        typeWithType("(//input[@class='oxd-input oxd-input--active'])[2]", "Automation tester - Playwright, Java","jobtitle");
        return this;
    }

    public MenuPage enterJobDescription() {
        type("//textarea[@placeholder = 'Type description here']", FakerDataFactory.getDescription(), "job description");
        return this;

    }

    public MenuPage jobTitlecreation() {
        String jobTitlesaveLocator = "//button[@type = 'submit']";
        click(jobTitlesaveLocator, "job title save Button");
        return this;
    }

    public MenuPage editjobtitle() {
        String editJobtitleLocator = "(//button[@type = 'button'])[6]";
        click(editJobtitleLocator, "job title edit Button");
        return this;
    }

    public MenuPage deletionjobtitle() {
        String deletionJobtitleLocator = "(//button[@type = 'button'])[5]";
        click(deletionJobtitleLocator, "job title delete Button");
        return this;
    }

    public MenuPage confirmDeletion() {
        String deletionconfirmationLocator = "//button[@class ='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']";
        click(deletionconfirmationLocator, "Yes,Delete button");
        return this;
    }

    public MenuPage clickPaygrades() {
        String payGradeLocator = "//a[.='Pay Grades']";
        click(payGradeLocator, "pay Grade Button");
        return this;
    }

    public MenuPage addPaygrades() {
        String addpayGradeLocator = "(//button[@type = 'button'])[4]";
        click(addpayGradeLocator, "pay Grade Button");
        return this;
    }

    public MenuPage enterPayGradeName(String payGradeName) {
        typeWithType("(//input[@class = 'oxd-input oxd-input--active'])[2]", "b+", "PayGrade");
        return this;
    }
    public MenuPage savePayGradeName() {
        String savepayGradeLocator = "//button[@type = 'submit']";
        click(savepayGradeLocator, "save pay Grade Button");
        return this;
    }

   public MenuPage editpaygrade() {
       String editjobPaygradeLocator = "(//button[@type = 'button'])[6]";
       click(editjobPaygradeLocator, "pay grade edit Button");
       return this;
   }

    public MenuPage deletionjobpaygrade() {
        String deletionJobpaygradeLocator = "(//button[@type = 'button'])[5]";
        click(deletionJobpaygradeLocator, "job title delete Button");
        return this;
    }

    public MenuPage confirmDeletionpaygrade() {
        String deletionconfirmationpaygradeLocator = "//button[@class ='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']";
        click(deletionconfirmationpaygradeLocator, "Yes,Delete button");
        return this;
    }

    public MenuPage clickOnAddEmployeeButton() {
        String addEmployeeButtonLocator = "//a[.='Add Employee']";
        click(addEmployeeButtonLocator, "Add Employee Button");
        return this;
    }


    public MenuPage enterFirstName() {
        type("//input[@name = 'firstName']", FakerDataFactory.getFirstName(), "First Name");
        return this;
    }

    public MenuPage enterMiddleName() {
        type("//input[@name = 'middleName']", FakerDataFactory.getMiddleName(), "Middle Name");
        return this;
    }

    public MenuPage enterLastName() {
        type("//input[@name = 'lastName']", FakerDataFactory.getLastName(), "Last Name");
        return this;
    }

    public MenuPage clickOnSaveButton() {
        String saveButtonLocator = "//button[@type ='submit']";
        click(saveButtonLocator, "Save Button");
        return this;
    }

    public MenuPage employeeName() {
        type("//input[@name = 'middleName']", FakerDataFactory.getFirstName(), "Middle Name");
        return this;
    }

    public MenuPage navigateToAddEmployeePage() {
        String addEmployeePageLocator = "//a[.='Employee List']"; // Adjust the locator based on actual implementation
        click(addEmployeePageLocator, "Employee List Button");
        return this;
    }

    public MenuPage employee() {
        type("(//input[@placeholder = 'Type for hints...'])[1]", FakerDataFactory.getFirstName(), "First Name");
        return this;
    }

    public MenuPage clickOnSearch() {
        click("//button[@type = 'submit']", "Search Button");
        return this;
    }

    public MenuPage organizationButton() {
        String organizationLocator = "(//span[@class ='oxd-topbar-body-nav-tab-item'])[3]";
        click(organizationLocator, "job options");
        return this;
    }

    public MenuPage clickOnGeneralinformation() {
        String generalinformationLocator = "//a[.='General Information']";
        click(generalinformationLocator, "general information Button");
        return this;
    }

    public MenuPage editToggle() {
        String editLocator = "//span[@class= 'oxd-switch-input oxd-switch-input--active --label-left']";
        click(editLocator, "edit toggle");
        return this;
    }

    public MenuPage enterOrganizationName(String organizationName) {
        typeWithType("(//input[@class = 'oxd-input oxd-input--active'])[2]", "tickingminds software limited", "organization Name");
        return this;
    }

    public MenuPage updatingGeneralinformation() {
        String GeneralinformationsaveLocator = "//button[@type = 'submit']";
        click(GeneralinformationsaveLocator, "save Button");
        return this;
    }


}



