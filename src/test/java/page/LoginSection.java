package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public TextBox emailTxtBox = new TextBox(By.id("emailOrPhone"));
    public TextBox passwordTxtBox = new TextBox(By.id("password"));
    public Button sigInButton = new Button(By.xpath("//button[text()='Sign In']"));

    public void login(String email, String pwd){
        emailTxtBox.setText(email);
        passwordTxtBox.setText(pwd);
        sigInButton.click();
    }
}
