package com.page.base;

import com.data.dynamic.FakerDataFactory;

public class MenuPage extends CognitestPageHook {
    public FakerDataFactory dataFactory ;
    // Locator for username field
    protected String usernameField = "//input[@name = 'username']";

    // Locator for password field
    protected String passwordField = "//input[@name = 'password']";

    // Locator for login button
    protected String loginButton = "//button[@type= 'submit']";

    protected String firstName = "//input[@name = 'firstName']";

    protected String middleName = "//input[@name = 'middleName']";

    protected String lastName = "//input[@name = 'lastName']";


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
}