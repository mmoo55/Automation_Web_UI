package page;

import control.Label;
import org.openqa.selenium.By;

public class SubmenuProjectOptionsSection {
    public Label editLabel = new Label(By.xpath("//a[text()='Edit']//parent::li"));
    public Label deleteLabel = new Label(By.xpath("//a[text()='Delete']//parent::li"));
}
