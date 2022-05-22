package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.ScreenManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class PrincipalTelaControlador {

    @FXML
    public void sair(ActionEvent event) throws IOException {

        ScreenManager.getInstancia().trocatela("loginTela");


    }

    @FXML
    public void perfil(ActionEvent event){
    }

    @FXML
    public void novopost(){
    }

}
