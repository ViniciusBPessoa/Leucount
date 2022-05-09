package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.MainClass;
import dados.RepositorioUsuarios;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import negocio.social.Usuario;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorCadastro implements Initializable {

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
    private ComboBox<String> titulo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

        titulo.setItems(FXCollections.observableArrayList("Gerente", "Analista", "Estudante"));

    }

    @FXML
    public void concluirButton(){

        if (usuario.getText().equals("") || senha.getText().equals("") || senhaConf.getText().equals("") || dataNascimento.getValue() == null || titulo.getValue() == null) {
            radPlot.setText("Por favor, preencha todos os campos");
        }else {
            radPlot.setText("");

            if (senha.getText().equals(senhaConf.getText())){

                Usuario user = new Usuario(usuario.getText(), senha.getText(), dataNascimento.getValue(), titulo.getValue());
                MainClass.usuarios.inserir(user);

                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Confimação!!");
                alerta.setHeaderText("Seu perfil foi criado com sucesso!!");
                alerta.show();

                usuario.clear();
                senha.clear();
                senhaConf.clear();

                MainClass.trocaTela("loginCena");

            }else {
                radPlot.setText("As senhas não são iguais");
                senhaConf.clear();
            }

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
