package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class CRUDProjectTest extends TestBase{
    @Test
    public void verifyCRUDProject() {
        String projectCreated = "Automation" + new Date().getTime();
        String projectUpdated = "Updated";

        // LOGIN
        mainPage.signInLabel.click();
        loginSection.login(email, password);

        // ADVICE SECTION
        //adviceModalSection.skipAdvice();

        Session.getInstance().waitPage();
        // CREATE
        projectSection.addListButton.click();
        addEditModalSection.nameTxtBox.setText(projectCreated);
        addEditModalSection.saveButton.click();

        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated), "ERROR! the project was not created");

        // UPDATE
        projectSection.getListTaskSubmenu(projectCreated).click();
        submenuProjectOptionsSection.editLabel.click();
        addEditModalSection.nameTxtBox.setText(projectUpdated);
        addEditModalSection.saveButton.click();

        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated+projectUpdated), "ERROR! the project was not updated");

        Session.getInstance().waitPage();
        // DELETE
        projectSection.getListTaskSubmenu(projectCreated+projectUpdated).click();
        submenuProjectOptionsSection.deleteLabel.click();
        deleteModalSection.deleteButton.click();

        Assertions.assertFalse(projectSection.isProjectDisplayedInList(projectCreated+projectUpdated), "ERROR! the project was not deleted");
    }
}
