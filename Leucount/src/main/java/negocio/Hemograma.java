package negocio;

import javafx.util.Pair;

import java.io.Serializable;
import java.util.ArrayList;

public class Hemograma implements Serializable {

    private ArrayList<Pair<String, Integer>> valores = new ArrayList<>();

    public Hemograma(int neuCont, int segCont, int basoCont, int bastCont,
                     int blastoCont, int eosiCont, int eritroCont ,
                     int linfoCont ,int linfoContA ,int linfoContT, int metaCont,
                     int mieloCont ,int monoCont,int multisegCont,int plasmoCont,int promieloCont) {

        Pair<String, Integer> ponteiro = new Pair<>("Neutrófilo", neuCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Segmentado", segCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Bastonete", bastCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Metamielófito", metaCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Mielócito", mieloCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Promielócito", promieloCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Blasto", blastoCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Linfócito", linfoCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Linfócito T", linfoContT);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Linfócito A", linfoContA);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Basófilo", basoCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Eosinófilo", eosiCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Monócito", monoCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Plasmócito", plasmoCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Eritroblasto", eritroCont);
        this.valores.add(ponteiro);

        ponteiro = new Pair<>("Multisegmentado", multisegCont);
        this.valores.add(ponteiro);
    }

    public ArrayList<Pair<String, Integer>> getValores() {
        return valores;
    }

    public void setValores(ArrayList<Pair<String, Integer>> valores) {
        this.valores = valores;
    }
}
