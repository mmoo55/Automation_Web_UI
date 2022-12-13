package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.*;
import session.Session;
import util.GetProperties;

public class TestBase {
    AddEditModalSection addEditModalSection = new AddEditModalSection();
    AdviceModalSection adviceModalSection = new AdviceModalSection();
    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();
    ProjectSection projectSection = new ProjectSection();
    SubmenuProjectOptionsSection submenuProjectOptionsSection = new SubmenuProjectOptionsSection();
    DeleteModalSection deleteModalSection = new DeleteModalSection();

    // todo property file
    String email = GetProperties.getInstance().getEmail();
    String password = GetProperties.getInstance().getPwd();

    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
