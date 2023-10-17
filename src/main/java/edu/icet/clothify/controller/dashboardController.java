package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;

public class dashboardController {

    @FXML
    private AnchorPane root1;

    @FXML
    private Pane context;

    @FXML
    private Text dateDisplay;

    @FXML
    private Text digitalClock;

    @FXML
    private VBox dashboardpane;

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private JFXButton btnNewuser;

    @FXML
    private JFXButton btnAllReports;

    @FXML
    private JFXButton btnCustomers;

    @FXML
    private JFXButton btnAdditems;

    @FXML
    private JFXButton btnSupplier;

    @FXML
    private JFXButton btnplaceorder;

    @FXML
    private Button btnabout;

    @FXML
    void aboutonaction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/About.fxml");
        Parent load = FXMLLoader.load(resource);
        this.context.getChildren().clear();
        this.context.getChildren().add(load);
    }

    @FXML
    void openadditem(ActionEvent event) {

    }

    @FXML
    void openallreports(ActionEvent event) {

    }

    @FXML
    void opencustomers(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/CustomerForm.fxml");
        Parent load = FXMLLoader.load(resource);
        this.context.getChildren().clear();
        this.context.getChildren().add(load);
    }

    @FXML
    void opendashboard(ActionEvent event) {

    }

    @FXML
    void opennewuser(ActionEvent event) {

    }

    @FXML
    void openplaceorder(ActionEvent event) {

    }

    @FXML
    void opensupplier(ActionEvent event) {

    }

}
