package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.regex.Pattern;

public class Log3Controller {

    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private JFXButton btnSignIn;

    @FXML
    private JFXButton btnCLose;
    public void signinaction(ActionEvent actionEvent) throws IOException {
        String userName = txtUserName.getText().trim();
        String password = txtPassword.getText().trim();
        if (Pattern.compile("^(Sithum)$").matcher(userName).matches()) {


        } else {
            txtUserName.setFocusColor(Paint.valueOf("red"));
            txtUserName.requestFocus();


        }
        if (Pattern.compile("^(Anjana123)$").matcher(userName).matches()) {
        } else {
            txtPassword.setFocusColor(Paint.valueOf("red"));
            txtPassword.requestFocus();

        }
        if (userName.length() > 0 && password.length() > 0) {
            if (userName.equalsIgnoreCase("Sithum")
                    && password.equals("Anjana123")) {

                Stage window = (Stage) this.root.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/Dashboard1.fxml"))));
                window.centerOnScreen();
                String tilte = "Sign In";
                String message = "WELCOME TO Clothify POS System ";


            } else {
                System.out.println("hellooooooooo");
            }
        }
    }

    public void ExitOnAction(ActionEvent actionEvent) {
    }
}
