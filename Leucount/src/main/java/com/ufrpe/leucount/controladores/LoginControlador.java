package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.MainClass;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginControlador {

    @FXML
    private TextField usuario;

    @FXML
    private TextField senha;

    @FXML
    private Label redText;

    @FXML
    public void entrar(){
        if (usuario.getText().equals("") || senha.getText().equals("")){
            redText.setText("Por favor digite em todos os campos");
        }else {
            String codigo = usuario.getText() + senha.getText();

            if (MainClass.usuarios.buscarContaBoolean(codigo)){

                MainClass.setUser(MainClass.usuarios.buscar(codigo));
                MainClass.trocaTela("telaPrincipalCena");

            }else {
                redText.setText("Usuario não cadastrado");
            }
        }
    }

    @FXML
    public void cadastroButton() {

        MainClass.trocaTela("cadastroCena");

    }

}
