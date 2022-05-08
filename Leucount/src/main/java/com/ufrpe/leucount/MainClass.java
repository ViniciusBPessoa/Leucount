package com.ufrpe.leucount;

import dados.RepositorioUsuarios;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import negocio.social.Usuario;

import java.io.IOException;

public class MainClass extends Application {

    public static RepositorioUsuarios usuarios;

    private static Usuario user;

    private static Stage stage;

    private static Scene logingCena;
    private static Scene cadastroCena;
    private static Scene chatCena;
    private static Scene perfilCena;

    private int loginx = 600;
    private int loginy = 400;

    @Override
    public void start(Stage mainstage) throws IOException {

        stage = mainstage;

        FXMLLoader loginTela = new FXMLLoader(MainClass.class.getResource("TelaLogin.fxml"));
        FXMLLoader cadastroTela = new FXMLLoader(MainClass.class.getResource("TelaCadastro.fxml"));
        FXMLLoader chatTela = new FXMLLoader(MainClass.class.getResource("TelaChat.fxml"));

        logingCena = new Scene(loginTela.load(), loginx, loginy);
        cadastroCena = new Scene(cadastroTela.load(), loginx, loginy);
        chatCena = new Scene(chatTela.load(), loginx, loginy);

        stage.setTitle("Leucount");
        stage.setScene(logingCena);
        stage.show();
    }

    public static void trocaTela(String tela){

        switch (tela){

            case "loginCena":
                stage.setScene(logingCena);
                break;

            case "cadastroCena":
                stage.setScene(cadastroCena);
                break;

            case "chatCena":
                stage.setScene(chatCena);
                break;

            case "perfilCena":
                stage.setScene(perfilCena);
                break;
        }
    }

    public static void main(String[] args) {

        usuarios = new RepositorioUsuarios();

        launch();
    }

    public static Usuario getUser() {
        return user;
    }

    public static void setUser(Usuario user) {
        MainClass.user = user;
    }
}