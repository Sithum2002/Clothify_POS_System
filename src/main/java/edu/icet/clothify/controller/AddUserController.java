package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.event.MouseEvent;

public class AddUserController {

    @FXML
    private JFXTextField txtusername;

    @FXML
    private JFXButton btnotp;

    @FXML
    private JFXTextField txtpassword;

    @FXML
    private JFXTextField txtotp;

    @FXML
    private JFXTextField txtnewname;

    @FXML
    private JFXTextField txtnewemail;

    @FXML
    private JFXTextField txtnewpassword;

    @FXML
    private JFXTextField txtconfirmpassword;

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
    private JFXButton btndeleteuser;

    @FXML
    private JFXButton btnupdateuser;

    @FXML
    private JFXButton btnrefreshuser;

    @FXML
    private JFXTextField txtnewname1;

    @FXML
    private JFXTextField txtnewname2;

    @FXML
    private JFXTextField txtnewpassword1;

    @FXML
    void sendotp(ActionEvent event) {

    }

    @FXML
    void tblMouseClick(MouseEvent event) {

    }

    @FXML
    void tbltemsOnMouoseReleased(MouseEvent event) {

    }

    @FXML
    void userdelete(ActionEvent event) {

    }

    @FXML
    void userrefresh(ActionEvent event) {

    }

    @FXML
    void userupdate(ActionEvent event) {

    }

    public void tblMouseClick(javafx.scene.input.MouseEvent mouseEvent) {

    }

    public void tbltemsOnMouoseReleased(javafx.scene.input.MouseEvent mouseEvent) {

    }
}
