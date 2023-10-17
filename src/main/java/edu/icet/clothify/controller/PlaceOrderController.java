package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class PlaceOrderController {

    @FXML
    private JFXTextField txtItemId;

    @FXML
    private JFXTextField txtPackSize;

    @FXML
    private JFXTextField TxtQty;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtBatchId;

    @FXML
    private JFXTextField txtSupplierId;

    @FXML
    private TableView<?> dtm;

    @FXML
    private TableColumn<?, ?> colitemcode;

    @FXML
    private TableColumn<?, ?> colitemname;

    @FXML
    private TableColumn<?, ?> colprice;

    @FXML
    private TableColumn<?, ?> colqty;

    @FXML
    private Label txtTotal;

    @FXML
    private JFXTextField Discount;

    @FXML
    private Label finalTotal;

    @FXML
    void adddiscountKey(KeyEvent event) {

    }

    @FXML
    void placeOrderOnAction(ActionEvent event) {

    }

    @FXML
    void printBillOnAction(ActionEvent event) {

    }

    @FXML
    void searchItemOnAction(ActionEvent event) {

    }

    @FXML
    void tblMouseClick(MouseEvent event) {

    }

    @FXML
    void tbltemsOnMouoseReleased(MouseEvent event) {

    }

}
