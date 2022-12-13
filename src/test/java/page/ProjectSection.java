package page;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class ProjectSection {
    public Button addListButton = new Button(By.xpath("//ul[@id='project-ul']//parent::div//parent::div//preceding::div//button[contains(@class, 'add-icon')]"));
    public Label nameProjectLabel;

    public Button listTaskSubmenuButton;

    public boolean isProjectDisplayedInList(String nameProject){
        nameProjectLabel = new Label(By.xpath("//p[contains(@class, 'text-s')][text()='"+nameProject+"']"));
        return nameProjectLabel.isControlDisplayed();
    }

    public Label getProject(String nameProject){
        nameProjectLabel = new Label(By.xpath("//p[contains(@class, 'text-s')][text()='"+nameProject+"']"));
        return nameProjectLabel;
    }

    public Button getListTaskSubmenu(String nameProject){
        listTaskSubmenuButton = new Button(By.xpath("//p[text()='"+nameProject+"']//following-sibling::div/div[contains(@class, 'peer')]"));
        listTaskSubmenuButton.waitControlIsNotInThePage();
        return listTaskSubmenuButton;
    }
}
