package com.ufrpe.leucount;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stage;

    private static Scene scene;
    private static Scene minhah;
    private int x = 600;
    private int y = 700;

    @Override
    public void start(Stage stageg) throws IOException {

        stage = stageg;

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("minha.fxml"));
        FXMLLoader hallo = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        scene = new Scene(fxmlLoader.load(), x, y);
        minhah = new Scene(hallo.load(), x, y);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void abrirpop(){

        stage.setScene(minhah);

    }

    public static void abb(){
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}