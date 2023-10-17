package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.event.MouseEvent;

public class SupplierFormController {

    @FXML
    private TableView<?> tblSup;

    @FXML
    private TableColumn<?, ?> colSupId;

    @FXML
    private TableColumn<?, ?> colComName;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colPhoneNo;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private JFXTextField txtSupId;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtCompanyName;

    @FXML
    private JFXTextField txtPhoneNo;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    void addOnAction(ActionEvent event) {

    }

    @FXML
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void searchItemOnAction(ActionEvent event) {

    }

    @FXML
    void tblSuplayClick(MouseEvent event) {

    }

    @FXML
    void updateOnAction(ActionEvent event) {

    }

}
