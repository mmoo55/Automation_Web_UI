package page;

import control.Button;
import org.openqa.selenium.By;

public class AdviceModalSection {
    public Button nextButton = new Button(By.xpath("//button[text()='Next']"));
    public Button readyToGoButton = new Button(By.xpath("//button[text()='Ready to go']"));

    public void skipAdvice() {
        nextButton.click();
        nextButton.click();
        readyToGoButton.click();
    }
}
