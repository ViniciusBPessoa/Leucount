package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.MainClass;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


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
    }

    public void initialize() {

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
