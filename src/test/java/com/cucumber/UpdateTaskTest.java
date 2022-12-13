package com.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class UpdateTaskTest {

    private Container container;

    public UpdateTaskTest(Container container) {
        this.container = container;
    }

    @When("I press on list task submenu button")
    public void iPressOnListTaskSubmenuButton() {
        container.projectSection.getListTaskSubmenu(container.taskCreated).click();
    }

    @And("I press on edit button")
    public void iPressOnEditButton() {
        container.submenuProjectOptionsSection.editLabel.click();
    }

    @And("I send the name of task updated")
    public void iSendTheNameOfProjectUpdated() {
        container.addEditModalSection.nameTxtBox.setText(container.taskUpdated);
    }

    @Then("the task with the name updated has to be visible on the page")
    public void theProjectWithTheNameUpdatedHasToBeVisibleOnThePage() {
        Assertions.assertTrue(container.projectSection.isProjectDisplayedInList(container.taskCreated+container.taskUpdated), "ERROR! the project was not updated");
    }



}
