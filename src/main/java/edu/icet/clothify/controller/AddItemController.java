package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.event.MouseEvent;

public class AddItemController {

    @FXML
    private TableView<?> tblItem;

    @FXML
    private TableColumn<?, ?> colItemId;

    @FXML
    private TableColumn<?, ?> colSupId;

    @FXML
    private TableColumn<?, ?> colDes;

    @FXML
    private TableColumn<?, ?> colPack;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colBath;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private JFXTextField txtItemId;

    @FXML
    private JFXTextField txtPackSize;

    @FXML
    private JFXTextField TxtQty;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtUnitPrice;

    @FXML
    private JFXTextField txtBatchId;

    @FXML
    private JFXTextField txtSupplierId;

    @FXML
    void tblItemOnAction(MouseEvent event) {

    }

    public void tblItemOnAction(javafx.scene.input.MouseEvent mouseEvent) {

    }
}
