package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.MainClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PrincipalTelaControlador {

    @FXML
    public void sair(ActionEvent event){
        MainClass.trocaTela("loginCena");
    }

    @FXML
    public void perfil(ActionEvent event){
        MainClass.trocaTela("perfilCena");
    }

    @FXML
    public void novopost(){
        MainClass.trocaTela("contadorCena");
    }

}
