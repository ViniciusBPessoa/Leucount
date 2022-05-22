package com.ufrpe.leucount;

import dados.ControladorUsuarios;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends Application {

    private int mainx = 832;
    private int mainy = 656;

    @Override
    public void start(Stage mainstage) throws IOException {

        mainstage.setScene(ScreenManager.getInstancia().getMainScene());
        mainstage.setTitle("Leucount!");

        mainstage.setWidth(mainx);
        mainstage.setHeight(mainy);
        mainstage.setResizable(false);

        ScreenManager.getInstancia().setPrimaryStage(mainstage);
        ScreenManager.getInstancia().getPrimaryStage().setScene(ScreenManager.getInstancia().getLogingCena());
        mainstage.show();

    }

    public static void main(String[] args) throws IOException {

        ControladorUsuarios.getInstancea();
        MainClass.launch(args);

    }

}