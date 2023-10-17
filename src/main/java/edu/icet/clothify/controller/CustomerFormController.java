package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import edu.icet.clothify.service.impl.CustomerService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.event.MouseEvent;

public class CustomerFormController {

    @FXML
    private JFXTextField txtCustomerId;

    @FXML
    private TableView<?> tblCustomer;

    @FXML
    private TableColumn<?, ?> colCustomerId;

    @FXML
    private TableColumn<?, ?> colCustomerName;

    @FXML
    private TableColumn<?, ?> colContactNumber;

    @FXML
    private TableColumn<?, ?> colCustomerEmail;

    @FXML
    private TableColumn<?, ?> colqty1;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtAddress1;

    @FXML
    private JFXTextField txtCustomerName;

    @FXML
    private JFXTextField txtContactNumber;

    @FXML
    private JFXTextField txtCustomerEmail;

    @FXML
    private JFXTextField txtAddress21;

    @FXML
    private JFXButton btnRegisterCustomer;

    CustomerService customerService = new CustomerService();

    public void initialize(){
        customerService.loadTable(tblCustomer,colCustomerId,colCustomerName,colCustomerEmail,colContactNumber);
    }

    @FXML
    void btnRegisterOnAction(ActionEvent event) {
        customerService.registerCustomer(txtCustomerId,txtCustomerName,txtCustomerEmail,txtContactNumber);
        customerService.loadTable(tblCustomer,colCustomerId,colCustomerName,colCustomerEmail,colContactNumber);
    }

    @FXML
    void placeOrderOnAction(ActionEvent event) {

    }

    @FXML
    void tblMouseClick(MouseEvent event) {

    }

    @FXML
    void tbltemsOnMouoseReleased(MouseEvent event) {

    }

}
