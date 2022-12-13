package com.cucumber;

import page.*;
import util.GetProperties;

import java.util.Date;

public class Container {
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

    /*String taskCreated = "Automation" + new Date().getTime();*/
    String taskCreated = "Automation345346";

    String taskUpdated = "Updated";
}
