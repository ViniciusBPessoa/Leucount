package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.Alerts;
import dados.ControladorAmostras;
import dados.enumeradores.Hematopoiese;
import dados.enumeradores.Leucocito;
import dados.interfaces.InterfaceControladorCadHemograma;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Pair;
import negocio.Amostra;
import negocio.social.LogUser;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ControladorCadHemograma implements InterfaceControladorCadHemograma {

    private Leucocito leucos;
    private Hematopoiese hematos;
    private ControladorCadHemograma cadHemogramaHemo;
    private String id;

    private int eritro;
    private boolean caluculados = false;
    private int totalcel;
    private Amostra internalAmostra;

    @FXML
    private TextField codigo;
    @FXML
    private TextField nome;
    @FXML
    private DatePicker datanascimento;
    @FXML
    private TextField hemacia;
    @FXML
    private TextField hematocrito;
    @FXML
    private TextField hemoglobina;
    @FXML
    private TextField rdwEd;
    @FXML
    private TextField hcmEd;
    @FXML
    private TextField chcmEd;
    @FXML
    private TextField vcmEd;
    @FXML
    private TextField LeucoTot;
    @FXML
    private TextField linfoAAbs;
    @FXML
    private TextField linfoARel;
    @FXML
    private TextField linfoTRel;
    @FXML
    private TextField linfoAbs;
    @FXML
    private TextField metaAbs;
    @FXML
    private TextField metaRel;
    @FXML
    private TextField mielAbs;
    @FXML
    private TextField mielRel;
    @FXML
    private TextField monoRel;
    @FXML
    private TextField monoAbs;
    @FXML
    private TextField segRel;
    @FXML
    private TextField segAbs;
    @FXML
    private TextField basoAbs;
    @FXML
    private TextField basoRel;
    @FXML
    private TextField eosiAbs;
    @FXML
    private TextField eosiRel;
    @FXML
    private TextField blastRel;
    @FXML
    private TextField blastAbs;
    @FXML
    private TextField bastAbs;
    @FXML
    private TextField bastRel;
    @FXML
    private TextField promielRel;
    @FXML
    private TextField promielAbs;
    @FXML
    private TextField plasmoRel;
    @FXML
    private TextField plasmoAbs;
    @FXML
    private TextField plaqEd;
    @FXML
    private TextField neuAbs;
    @FXML
    private TextField neuRel;
    @FXML
    private TextArea hemObserv;
    @FXML
    private TextArea leucoObserv;
    @FXML
    private TextArea plaqObserv;

    @FXML
    private ComboBox<String> sexo;

    @FXML
    public void onContadorButton() {

        if (hemacia.getText().equals("") || hemoglobina.getText().equals("") || hematocrito.getText().equals("") ||
                LeucoTot.getText().equals("") || rdwEd.getText().equals("") || plaqEd.getText().equals("") ||
                datanascimento.getValue() == null || sexo.getValue() == null) {
            Alerts.showAlert("Preencha todos oa locais!", "Preencha todos oa locais!", "", Alert.AlertType.INFORMATION);

        } else {

            chcmEd.setText(String.valueOf(Integer.parseInt(hemacia.getText()) / Integer.parseInt(hematocrito.getText())));
            chcmEd.setEditable(false);

            vcmEd.setText(String.valueOf(Integer.parseInt(hematocrito.getText()) / Integer.parseInt(hemacia.getText())));
            vcmEd.setEditable(false);

            hcmEd.setText(String.valueOf(Integer.parseInt(hemoglobina.getText()) / Integer.parseInt(hemacia.getText())));
            hcmEd.setEditable(false);

            int eritropont = Integer.parseInt(LeucoTot.getText()) - eritro;

            monoAbs.setText(relat(monoRel.getText(), eritropont));
            monoAbs.setEditable(false);

            eosiAbs.setText(relat(eosiRel.getText(), eritropont));
            eosiAbs.setEditable(false);

            blastAbs.setText(relat(blastRel.getText(), eritropont));
            blastAbs.setEditable(false);

            plasmoAbs.setText(relat(plasmoRel.getText(), eritropont));
            plasmoAbs.setEditable(false);

            neuAbs.setText(relat(neuRel.getText(), eritropont));
            neuAbs.setEditable(false);

            segAbs.setText(relat(segRel.getText(), eritropont));
            segAbs.setEditable(false);

            bastAbs.setText(relat(bastRel.getText(), eritropont));
            bastAbs.setEditable(false);

            metaAbs.setText(relat(metaRel.getText(), eritropont));
            metaAbs.setEditable(false);

            mielAbs.setText(relat(mielRel.getText(), eritropont));
            mielAbs.setEditable(false);

            promielAbs.setText(relat(promielRel.getText(), eritropont));
            promielAbs.setEditable(false);

            basoAbs.setText(relat(basoRel.getText(), eritropont));
            basoAbs.setEditable(false);

            linfoAbs.setText(relat(linfoTRel.getText(), eritropont));
            linfoAbs.setEditable(false);

            linfoAAbs.setText(relat(linfoARel.getText(), eritropont));
            linfoAAbs.setEditable(false);

            this.caluculados = true;

        }
    }

    public String relat(String valor, int eritropont){

        int ponteiro = Integer.parseInt(valor);
        double parcial = (double) (ponteiro * eritropont) / this.totalcel;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);


        return String.valueOf(df.format(parcial));
    }

    @FXML
    public void onSalvarButton() {

        if (!caluculados){
            Alerts.showAlert("Ative o contador", "Ative o contador", "", Alert.AlertType.INFORMATION);
        }else {

            this.internalAmostra.setSexopct(sexo.getValue());

            long anos = ChronoUnit.YEARS.between(LocalDate.now(), datanascimento.getValue());

            internalAmostra.setObsHema(hemObserv.getText());
            internalAmostra.setObsplaq(plaqObserv.getText());
            internalAmostra.setObsLinfo(leucoObserv.getText());


        }

    }



    public void inicializate(Amostra amostra){

        this.totalcel = amostra.getContcell();
        this.internalAmostra = amostra;

        sexo.setItems(FXCollections.observableArrayList("M", "F"));

        for (Pair<String, Integer> ponteiro:   amostra.getHemograma().getValores() ) {

            switch (ponteiro.getKey()) {
                case "Neutrófilo" -> {
                    neuRel.setText(String.valueOf(ponteiro.getValue()));
                    neuRel.setEditable(false);
                }
                case "Segmentado" -> {
                    segRel.setText(String.valueOf(ponteiro.getValue()));
                    segRel.setEditable(false);
                }
                case "Bastonete" -> {
                    bastRel.setText(String.valueOf(ponteiro.getValue()));
                    bastRel.setEditable(false);
                }
                case "Metamielófito" -> {
                    metaRel.setText(String.valueOf(ponteiro.getValue()));
                    metaRel.setEditable(false);
                }
                case "Mielócito" -> {
                    mielRel.setText(String.valueOf(ponteiro.getValue()));
                    mielRel.setEditable(false);
                }
                case "Promielócito" -> {
                    promielRel.setText(String.valueOf(ponteiro.getValue()));
                    promielRel.setEditable(false);
                }
                case "Blasto" -> {
                    blastRel.setText(String.valueOf(ponteiro.getValue()));
                    blastRel.setEditable(false);
                }
                case "Linfócito" -> {
                    linfoTRel.setText(String.valueOf(ponteiro.getValue()));
                    linfoTRel.setEditable(false);
                }
                case "Linfócito A" -> {
                    linfoARel.setText(String.valueOf(ponteiro.getValue()));
                    linfoTRel.setEditable(false);
                }
                case "Basófilo" -> {
                    basoRel.setText(String.valueOf(ponteiro.getValue()));
                    basoRel.setEditable(false);
                }
                case "Eosinófilo" -> {
                    eosiRel.setText(String.valueOf(ponteiro.getValue()));
                    eosiRel.setEditable(false);
                }
                case "Monócito" -> {
                    monoRel.setText(String.valueOf(ponteiro.getValue()));
                    monoRel.setEditable(false);
                }
                case "Plasmócito" -> {
                    plasmoRel.setText(String.valueOf(ponteiro.getValue()));
                    plasmoRel.setEditable(false);
                }
                case "Eritroblasto" -> {hemObserv.setText("Número de Eritroblastos: " + String.valueOf(ponteiro.getValue()));
                this.eritro = ponteiro.getValue();}
                case "Multisegmentado" -> leucoObserv.setText("Número de Multisegmentados: " + String.valueOf(ponteiro.getValue()));
            }

            nome.setText(amostra.getNomePct());
            codigo.setText(amostra.getIdAmostra());
            nome.setEditable(false);
            codigo.setEditable(false);



        }

    }


}
