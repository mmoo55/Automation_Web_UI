package com.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CreateTaskTest {
    private Container container;

    public CreateTaskTest(Container container) {
        this.container = container;
    }

    @When("I press on add list button")
    public void iPressOnAddListButton() {
        container.projectSection.addListButton.click();
    }

    @And("I send task name")
    public void iSendProjectName() {
        container.addEditModalSection.nameTxtBox.setText(container.taskCreated);
    }

    @Then("the task has to be visible on the page")
    public void theProjectHasToBeVisibleOnThePage() {
        Assertions.assertTrue(container.projectSection.isProjectDisplayedInList(container.taskCreated), "ERROR! the project was not created");
    }

}
