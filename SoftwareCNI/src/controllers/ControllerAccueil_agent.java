package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControllerAccueil_agent implements Initializable {

    @FXML
    private Button BtnActu;

    @FXML
    private Button BtnTraitmnt;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TextField nameTextField;

    @FXML
    private TableView<?> tableView;

    @FXML
    void ActuDataBtn(ActionEvent event) {

    }

    @FXML
    void TraitmntBtn(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
