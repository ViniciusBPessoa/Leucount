package com.ufrpe.leucount;

import com.ufrpe.leucount.controladores.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ScreenManager {

    private static ScreenManager instancia;

    private Stage primaryStage;
    private Scene mainScene;

    private Scene logingCena;
    private LoginControlador controladorloginCena;

    private Scene cadastroCena;
    private ControladorCadastro controladorCadastroCena;

    private Scene chatCena;
    private ChatControlador chatControladorCena;

    private Scene principalCena;
    private PrincipalTelaControlador principalTelaControladorCena;

    private Scene perfilCena;
    private PerfilControlador perfilControladorCena;



    public static  ScreenManager getInstancia() throws IOException {
        if (instancia == null){
            instancia = new ScreenManager();
        }
        return instancia;
    }

    public ScreenManager() throws IOException {
        this.inicializador();
    }

    public void inicializador() throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            BorderPane loginTela = fxmlLoader.load((Objects.requireNonNull(getClass().getResource("TelaLogin.fxml"))).openStream());
            this.logingCena = new Scene(loginTela);
            this.controladorloginCena = (LoginControlador)  fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            BorderPane cadastroTela = fxmlLoader.load((Objects.requireNonNull(getClass().getResource("TelaCadastro.fxml"))).openStream());
            this.cadastroCena = new Scene(cadastroTela);
            this.controladorCadastroCena = (ControladorCadastro) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            BorderPane chatTela = fxmlLoader.load((Objects.requireNonNull(getClass().getResource("TelaChat.fxml"))).openStream());
            this.chatCena = new Scene(chatTela);
            this.chatControladorCena = (ChatControlador) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            BorderPane principalTela = fxmlLoader.load((Objects.requireNonNull(getClass().getResource("TelaPrincipal.fxml"))).openStream());
            this.principalCena = new Scene(principalTela);
            this.principalTelaControladorCena = (PrincipalTelaControlador) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            BorderPane perfilTela = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("TelaPerfil.fxml")).openStream());
            this.perfilCena = new Scene(perfilTela);
            this.perfilControladorCena = (PerfilControlador) fxmlLoader.getController();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void trocatela(String tela){
        switch (tela){

            case "cadastroTela" -> this.getPrimaryStage().setScene(cadastroCena);

            case "loginTela" -> this.getPrimaryStage().setScene(logingCena);

            case "principalTela" -> this.getPrimaryStage().setScene(principalCena);

            case "perfilTela" -> this.getPrimaryStage().setScene(perfilCena);

        }
    }

    public static void setInstancia(ScreenManager instancia) {
        ScreenManager.instancia = instancia;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Scene getMainScene() {
        return mainScene;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }

    public Scene getLogingCena() {
        return logingCena;
    }

    public void setLogingCena(Scene logingCena) {
        this.logingCena = logingCena;
    }

    public LoginControlador getControladorloginCena() {
        return controladorloginCena;
    }

    public void setControladorloginCena(LoginControlador controladorloginCena) {
        this.controladorloginCena = controladorloginCena;
    }

    public Scene getCadastroCena() {
        return cadastroCena;
    }

    public void setCadastroCena(Scene cadastroCena) {
        this.cadastroCena = cadastroCena;
    }

    public ControladorCadastro getControladorCadastroCena() {
        return controladorCadastroCena;
    }

    public void setControladorCadastroCena(ControladorCadastro controladorCadastroCena) {
        this.controladorCadastroCena = controladorCadastroCena;
    }

    public Scene getChatCena() {
        return chatCena;
    }

    public void setChatCena(Scene chatCena) {
        this.chatCena = chatCena;
    }

    public ChatControlador getChatControladorCena() {
        return chatControladorCena;
    }

    public void setChatControladorCena(ChatControlador chatControladorCena) {
        this.chatControladorCena = chatControladorCena;
    }

    public Scene getPrincipalCena() {
        return principalCena;
    }

    public void setPrincipalCena(Scene principalCena) {
        this.principalCena = principalCena;
    }

    public PrincipalTelaControlador getPrincipalTelaControladorCena() {
        return principalTelaControladorCena;
    }

    public void setPrincipalTelaControladorCena(PrincipalTelaControlador principalTelaControladorCena) {
        this.principalTelaControladorCena = principalTelaControladorCena;
    }

    public Scene getPerfilCena() {
        return perfilCena;
    }

    public void setPerfilCena(Scene perfilCena) {
        this.perfilCena = perfilCena;
    }

    public PerfilControlador getPerfilControladorCena() {
        return perfilControladorCena;
    }

    public void setPerfilControladorCena(PerfilControlador perfilControladorCena) {
        this.perfilControladorCena = perfilControladorCena;
    }
    
}
