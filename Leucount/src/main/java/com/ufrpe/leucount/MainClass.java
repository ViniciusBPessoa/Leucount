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
    private static Scene principalCena;
    private static Scene perfilCena;
    private static Scene contadorCena;

    private int loginx = 600;
    private int loginy = 400;
    private int mainx = 832;
    private int mainy = 656;

    @Override
    public void start(Stage mainstage) throws IOException {

        stage = mainstage;

        FXMLLoader loginTela = new FXMLLoader(MainClass.class.getResource("TelaLogin.fxml"));
        FXMLLoader cadastroTela = new FXMLLoader(MainClass.class.getResource("TelaCadastro.fxml"));
        FXMLLoader chatTela = new FXMLLoader(MainClass.class.getResource("TelaChat.fxml"));
        FXMLLoader principalTela = new FXMLLoader(MainClass.class.getResource("TelaPrincipal.fxml"));
        FXMLLoader perfilTela = new FXMLLoader(MainClass.class.getResource("TelaPerfil.fxml"));
        FXMLLoader contadortela = new FXMLLoader(MainClass.class.getResource("ContadorFx.fxml"));

        logingCena = new Scene(loginTela.load(), loginx, loginy);
        cadastroCena = new Scene(cadastroTela.load(), loginx, loginy);
        principalCena = new Scene(principalTela.load(), loginx, loginy);
        perfilCena = new Scene(perfilTela.load(), loginx, loginy);
        contadorCena = new Scene(contadortela.load(), mainx, mainy);

        stage.setTitle("Leucount");
        stage.setScene(logingCena);
        stage.show();
    }

    public static void trocaTela(String tela){

        switch (tela) {
            case "loginCena" -> stage.setScene(logingCena);
            case "cadastroCena" -> stage.setScene(cadastroCena);
            case "chatCena" -> stage.setScene(chatCena);
            case "telaPrincipalCena" -> stage.setScene(principalCena);
            case "perfilCena" -> stage.setScene(perfilCena);
            case "contadorCena" -> stage.setScene(contadorCena);
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