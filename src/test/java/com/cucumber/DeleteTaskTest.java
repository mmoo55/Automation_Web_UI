package com.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class DeleteTaskTest {
    private Container container;

    public DeleteTaskTest(Container container) {
        this.container = container;
    }

    @When("I press on list task submenu button to delete")
    public void iPressOnListTaskSubmenuButtonToDelete() {
        container.projectSection.getListTaskSubmenu(container.taskCreated).click();
    }
    @And("I press on delete button")
    public void iPressOnDeleteButton() {
        container.submenuProjectOptionsSection.deleteLabel.click();
    }

    @And("I press on delete button to confirm")
    public void iPressOnDeleteButtonToConfirm() {
        container.deleteModalSection.deleteButton.click();
    }

    @Then("the task with the name updated has not to be visible on the page")
    public void theTaskWithTheNameUpdatedHasNotToBeVisibleOnThePage() {
        Assertions.assertFalse(container.projectSection.isProjectDisplayedInList(container.taskCreated+container.taskUpdated), "ERROR! the project was not deleted");
    }
}
