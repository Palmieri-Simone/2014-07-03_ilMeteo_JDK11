package it.polito.tdp.meteo;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.meteo.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

//controller turno C --> passare agli altri branch master_turnoA o master_turnoB per turni A o B

public class FXMLController {
	
	private Model model;

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> boxCitta;

    @FXML
    private Button btnElencoDate;

    @FXML
    private TextField txtProbabilita;

    @FXML
    private TextField txtTecnici;

    @FXML
    private Button btnSimula;

    @FXML
    private TextArea txtResult;

    @FXML
    void initialize() {
        assert boxCitta != null : "fx:id=\"boxCitta\" was not injected: check your FXML file 'Meteo.fxml'.";
        assert btnElencoDate != null : "fx:id=\"btnElencoDate\" was not injected: check your FXML file 'Meteo.fxml'.";
        assert txtProbabilita != null : "fx:id=\"txtProbabilita\" was not injected: check your FXML file 'Meteo.fxml'.";
        assert txtTecnici != null : "fx:id=\"txtTecnici\" was not injected: check your FXML file 'Meteo.fxml'.";
        assert btnSimula != null : "fx:id=\"btnSimula\" was not injected: check your FXML file 'Meteo.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Meteo.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
