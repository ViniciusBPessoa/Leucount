package negocio;

import javafx.util.Pair;

import java.util.ArrayList;

public class Hemograma {

    private ArrayList<Pair<String, String>> valores;

    public Hemograma(ArrayList<Pair<String, String>> valores) {
        this.valores = valores;
    }

    public int switchint(){  /* Switch case para calcular as amostras ainda a criar */
        int val = 0;
        return val;
    }

    public double switchdouble(){
        double val = 0;
        return val;
    }

    public long switchlong(){
        long val = 0;
        return val;
    }

    public ArrayList<Pair<String, String>> getValores() {
        return valores;
    }

    public void setValores(ArrayList<Pair<String, String>> valores) {
        this.valores = valores;
    }
}
