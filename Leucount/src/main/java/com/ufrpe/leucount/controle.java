package com.ufrpe.leucount;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controle {

    @FXML
    private Label test;

    @FXML
    private TextField escrita;

    @FXML
    public void bb(){
        String texto = escrita.getText();
        escrita.clear();

        test.setText(texto);
    }

    @FXML
    public void bf(){

        HelloApplication.abrirpop();

    }

    public Label getTest() {
        return test;
    }

    public void setTest(Label test) {
        this.test = test;
    }

    public TextField getEscrita() {
        return escrita;
    }

    public void setEscrita(TextField escrita) {
        this.escrita = escrita;
    }
}
