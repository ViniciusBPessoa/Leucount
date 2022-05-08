package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.MainClass;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControladorCadastro {

    @FXML
    private TextField usuario;

    @FXML
    private PasswordField senha;

    @FXML
    private PasswordField senhaConf;

    @FXML
    private DatePicker dataNascimento;

    @FXML
    private Label radPlot;

    @FXML
    public void concluirButton(){

        if (usuario.getText().equals("") || senha.getText().equals("") || senhaConf.getText().equals("") || dataNascimento.getValue() == null){
            radPlot.setText("Por favor, preencha todos os campos");
        }else {
            radPlot.setText("");



        }

    }

    @FXML
    public void logButton(){
        MainClass.trocaTela("loginCena");
    }

    public TextField getUsuario() {
        return usuario;
    }

    public void setUsuario(TextField usuario) {
        this.usuario = usuario;
    }

    public PasswordField getSenha() {
        return senha;
    }

    public void setSenha(PasswordField senha) {
        this.senha = senha;
    }

    public PasswordField getSenhaConf() {
        return senhaConf;
    }

    public void setSenhaConf(PasswordField senhaConf) {
        this.senhaConf = senhaConf;
    }

    public Label getRadPlot() {
        return radPlot;
    }

    public void setRadPlot(Label radPlot) {
        this.radPlot = radPlot;
    }

    public DatePicker getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(DatePicker dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
