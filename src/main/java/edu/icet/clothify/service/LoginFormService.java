package edu.icet.clothify.service;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;

public interface LoginFormService {
    public void exit();
    public void signIn(ActionEvent event);
    public void forgotPassword(ActionEvent event);

    public void btnAdminStyle(JFXButton btnAdmin, JFXButton btnEmployee);

    public void btnEmployeeStyle(JFXButton btnAdmin, JFXButton btnEmployee);

    public void clear(JFXTextField txtUserName, JFXPasswordField txtPassword);

    public void login(ActionEvent event, JFXTextField txtUserName, JFXPasswordField txtPassword);
}
