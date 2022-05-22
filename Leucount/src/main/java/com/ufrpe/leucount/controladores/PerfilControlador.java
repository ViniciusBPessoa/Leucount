package com.ufrpe.leucount.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import negocio.social.LogUser;


public class PerfilControlador {

    @FXML
    private Label name;

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

        if (LogUser.getLogInstancia() != null) {
            String age = idade.getText();
            idade.setText(age + " \n" + LogUser.getLogInstancia().getLogUser().idade());

            name.setText(LogUser.getLogInstancia().getLogUser().getNome());

            String cargo = titulo.getText();
            titulo.setText(cargo + " \n" + LogUser.getLogInstancia().getLogUser().getTitulo());

            String num = codigo.getText();
            codigo.setText(num + " \n" + LogUser.getLogInstancia().getLogUser().getCodigo());
        }

    }

    public Label getName() {
        return name;
    }

    public void setName(Label name) {
        this.name = name;
    }

    public Label getCodigo() {
        return codigo;
    }

    public void setCodigo(Label codigo) {
        this.codigo = codigo;
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
