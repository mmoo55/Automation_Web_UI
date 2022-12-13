package page;


import control.Label;
import org.openqa.selenium.By;

public class MainPage {
    public Label signInLabel = new Label(By.xpath("//div[contains(@class, 'navRow_236y3')]//a[text()='Sign In']"));
}
