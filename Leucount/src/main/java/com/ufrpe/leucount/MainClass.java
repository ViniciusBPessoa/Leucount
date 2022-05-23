package com.ufrpe.leucount;

import dados.ControladorAmostras;
import dados.ControladorUsuarios;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends Application {

    private static int mainx = 832;
    private static int mainy = 656;

    @Override
    public void start(Stage mainstage) throws IOException {

        mainstage.setScene(ScreenManager.getInstancia().getMainScene());
        mainstage.setTitle("Leucount!");

        mainstage.setWidth(MainClass.mainx);
        mainstage.setHeight(MainClass.mainy);
        mainstage.setResizable(false);

        ScreenManager.getInstancia().setPrimaryStage(mainstage);
        ScreenManager.getInstancia().getPrimaryStage().setScene(ScreenManager.getInstancia().getLogingCena());
        mainstage.show();

    }

    public static void main(String[] args) throws IOException {

        ControladorUsuarios.getInstancea();
        ControladorAmostras.getInstanciaamostra();
        MainClass.launch(args);

    }

    public static int getMainx(int i) {
        return mainx;
    }

    public static void setMainx(int mainx) {
        MainClass.mainx = mainx;
    }

    public static int getMainy() {
        return mainy;
    }

    public static void setMainy(int mainy) {
        MainClass.mainy = mainy;
    }
}