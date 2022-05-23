package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.ScreenManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import negocio.social.LogUser;

import java.io.IOException;


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
    public void voltar() throws IOException {

        ScreenManager.getInstancia().trocatela("principalTela");

    }

    public void initialize() {

        if (LogUser.getLogInstancia() != null) {

            String test = String.valueOf((LogUser.getLogInstancia().getLogUser().idade()));
            idade.setText(test);

            name.setText(LogUser.getLogInstancia().getLogUser().getNome());

            titulo.setText(LogUser.getLogInstancia().getLogUser().getTitulo());

            codigo.setText(LogUser.getLogInstancia().getLogUser().getCodigo());
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
