package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.MainClass;
import com.ufrpe.leucount.ScreenManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import negocio.social.LogUser;

import java.io.IOException;

public class LoginControlador {

    @FXML
    private TextField usuario;

    @FXML
    private TextField senha;

    @FXML
    private Label redText;

    @FXML
    public void entrar() throws IOException {
        if (usuario.getText().equals("") || senha.getText().equals("")){
            redText.setText("Por favor digite em todos os campos");
        }else {
            String codigo = usuario.getText() + senha.getText();

            if (MainClass.usuarios.buscarContaBoolean(codigo)){

                LogUser.setLogUser(MainClass.usuarios.buscar(codigo));
                ScreenManager.getInstancia().trocatela("principalTela");

            }else {
                redText.setText("Usuario não cadastrado");
            }
        }
    }

    @FXML
    public void cadastroButton() throws IOException {

        ScreenManager.getInstancia().trocatela("cadastroTela");

    }

}
