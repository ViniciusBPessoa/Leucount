package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.MainClass;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PerfilControlador {

    @FXML
    private static Label nome;

    @FXML
    private Label idade;

    @FXML
    private Label titulo;

    @FXML
    private Label codigo;

    @FXML
    public void voltar(){
        MainClass.trocaTela("telaPrincipalCena");
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

        String texto = nome.getText();
        nome.setText(texto + MainClass.getUser().getNome());

        texto = idade.getText();
        idade.setText(texto + MainClass.getUser().idade());

        texto = titulo.getText();
        titulo.setText(texto + MainClass.getUser().getTitulo());

        texto = codigo.getText();
        codigo.setText(texto + MainClass.getUser().getCodigo());

    }

    public Label getNome() {
        return nome;
    }

    public void setNome(Label nome) {
        this.nome = nome;
    }

    public Label getIdade() {
        return idade;
    }

    public void setIdade(Label idade) {
        this.idade = idade;
    }

    public Label getTitulo() {
        return titulo;
    }

    public void setTitulo(Label titulo) {
        this.titulo = titulo;
    }
}
