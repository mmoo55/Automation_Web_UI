package com.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import session.Session;
import util.GetProperties;

public class TestBase {
    private Container container;

    public TestBase(Container container) {
        this.container = container;
    }

    @Given("I am on ticktick page")
    public void iAmOnTicktickPage() {
        // todo create property file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @And("I press sign in button")
    public void iPressSignInButton() {
        container.mainPage.signInLabel.click();
    }

    @And("I sign in as a user")
    public void iSignInAsAUser() {
        container.loginSection.login(container.email, container.password);
    }

    @And("I press on save button")
    public void iPressOnSaveButton() {
        container.addEditModalSection.saveButton.click();
    }

    @After
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

}
