package com.ufrpe.leucount;

import com.ufrpe.leucount.controladores.*;
import dados.aleatorio.CodeCriator;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import negocio.Amostra;
import negocio.Hemograma;

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

    private Scene contadorCena;
    private ControladorContador contadorcontroladorcena;

    private Scene hemogranaCena;
    private ControladorCadHemograma hemogramaControladorCena;



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

            fxmlLoader = new FXMLLoader();
            BorderPane contadorTela = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("ContadorFx.fxml")).openStream());
            this.contadorCena = new Scene(contadorTela);
            this.contadorcontroladorcena = (ControladorContador) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            BorderPane hemogramaTela = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("hemoFx.fxml")).openStream());
            this.hemogranaCena = new Scene(hemogramaTela);
            this.hemogramaControladorCena = (ControladorCadHemograma) fxmlLoader.getController();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void ReloadContador() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        BorderPane contadorTela = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("ContadorFx.fxml")).openStream());
        this.contadorCena = new Scene(contadorTela);
        this.contadorcontroladorcena = (ControladorContador) fxmlLoader.getController();
        this.trocatela("contadorTela");
    }

    public void trocatela(String tela) throws IOException {

        if (tela.equals("hemogramaTela")){

            ScreenManager.getInstancia().primaryStage.setHeight(720);
            ScreenManager.getInstancia().primaryStage.setWidth(1200);

        }else{
            ScreenManager.getInstancia().primaryStage.setHeight(656);
            ScreenManager.getInstancia().primaryStage.setWidth(832);
        }

        switch (tela) {
            case "cadastroTela" -> this.getPrimaryStage().setScene(cadastroCena);

            case "loginTela" -> this.getPrimaryStage().setScene(logingCena);

            case "principalTela" -> this.getPrimaryStage().setScene(principalCena);

            case "perfilTela" -> {
                this.getPrimaryStage().setScene(perfilCena);
                ScreenManager.getInstancia().getPerfilControladorCena().initialize();
            }

            case "contadorTela" -> {

                this.getContadorcontroladorcena().getnAmostra().setText(CodeCriator.aleatorio());
                this.getContadorcontroladorcena().getnAmostra().setEditable(false);;
                this.getPrimaryStage().setScene(contadorCena);

            }

            case "hemogramaTela" -> this.getPrimaryStage().setScene(hemogranaCena);
        }
    }
    public void trocatela(String tela, Amostra amostra) throws IOException {

        ScreenManager.getInstancia().primaryStage.setHeight(720);
        ScreenManager.getInstancia().primaryStage.setWidth(1200);

        this.hemogramaControladorCena.inicializate(amostra);

        this.getPrimaryStage().setScene(hemogranaCena);

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

    public Scene getContadorCena() {
        return contadorCena;
    }

    public void setContadorCena(Scene contadorCena) {
        this.contadorCena = contadorCena;
    }

    public ControladorContador getContadorcontroladorcena() {
        return contadorcontroladorcena;
    }

    public void setContadorcontroladorcena(ControladorContador contadorcontroladorcena) {
        this.contadorcontroladorcena = contadorcontroladorcena;
    }

    public Scene getHemogranaCena() {
        return hemogranaCena;
    }

    public void setHemogranaCena(Scene hemogranaCena) {
        this.hemogranaCena = hemogranaCena;
    }

    public ControladorCadHemograma getHemogramaControladorCena() {
        return hemogramaControladorCena;
    }

    public void setHemogramaControladorCena(ControladorCadHemograma hemogramaControladorCena) {
        this.hemogramaControladorCena = hemogramaControladorCena;
    }
}
