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

    public Leucocito getLeucos() {
        return leucos;
    }

    public void setLeucos(Leucocito leucos) {
        this.leucos = leucos;
    }

    public Hematopoiese getHematos() {
        return hematos;
    }

    public void setHematos(Hematopoiese hematos) {
        this.hematos = hematos;
    }

    public ControladorCadHemograma getCadHemogramaHemo() {
        return cadHemogramaHemo;
    }

    public void setCadHemogramaHemo(ControladorCadHemograma cadHemogramaHemo) {
        this.cadHemogramaHemo = cadHemogramaHemo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEritro() {
        return eritro;
    }

    public void setEritro(int eritro) {
        this.eritro = eritro;
    }

    public boolean isCaluculados() {
        return caluculados;
    }

    public void setCaluculados(boolean caluculados) {
        this.caluculados = caluculados;
    }

    public int getTotalcel() {
        return totalcel;
    }

    public void setTotalcel(int totalcel) {
        this.totalcel = totalcel;
    }

    public Amostra getInternalAmostra() {
        return internalAmostra;
    }

    public void setInternalAmostra(Amostra internalAmostra) {
        this.internalAmostra = internalAmostra;
    }

    public TextField getCodigo() {
        return codigo;
    }

    public void setCodigo(TextField codigo) {
        this.codigo = codigo;
    }

    public TextField getNome() {
        return nome;
    }

    public void setNome(TextField nome) {
        this.nome = nome;
    }

    public DatePicker getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(DatePicker datanascimento) {
        this.datanascimento = datanascimento;
    }

    public TextField getHemacia() {
        return hemacia;
    }

    public void setHemacia(TextField hemacia) {
        this.hemacia = hemacia;
    }

    public TextField getHematocrito() {
        return hematocrito;
    }

    public void setHematocrito(TextField hematocrito) {
        this.hematocrito = hematocrito;
    }

    public TextField getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(TextField hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public TextField getRdwEd() {
        return rdwEd;
    }

    public void setRdwEd(TextField rdwEd) {
        this.rdwEd = rdwEd;
    }

    public TextField getHcmEd() {
        return hcmEd;
    }

    public void setHcmEd(TextField hcmEd) {
        this.hcmEd = hcmEd;
    }

    public TextField getChcmEd() {
        return chcmEd;
    }

    public void setChcmEd(TextField chcmEd) {
        this.chcmEd = chcmEd;
    }

    public TextField getVcmEd() {
        return vcmEd;
    }

    public void setVcmEd(TextField vcmEd) {
        this.vcmEd = vcmEd;
    }

    public TextField getLeucoTot() {
        return LeucoTot;
    }

    public void setLeucoTot(TextField leucoTot) {
        LeucoTot = leucoTot;
    }

    public TextField getLinfoAAbs() {
        return linfoAAbs;
    }

    public void setLinfoAAbs(TextField linfoAAbs) {
        this.linfoAAbs = linfoAAbs;
    }

    public TextField getLinfoARel() {
        return linfoARel;
    }

    public void setLinfoARel(TextField linfoARel) {
        this.linfoARel = linfoARel;
    }

    public TextField getLinfoTRel() {
        return linfoTRel;
    }

    public void setLinfoTRel(TextField linfoTRel) {
        this.linfoTRel = linfoTRel;
    }

    public TextField getLinfoAbs() {
        return linfoAbs;
    }

    public void setLinfoAbs(TextField linfoAbs) {
        this.linfoAbs = linfoAbs;
    }

    public TextField getMetaAbs() {
        return metaAbs;
    }

    public void setMetaAbs(TextField metaAbs) {
        this.metaAbs = metaAbs;
    }

    public TextField getMetaRel() {
        return metaRel;
    }

    public void setMetaRel(TextField metaRel) {
        this.metaRel = metaRel;
    }

    public TextField getMielAbs() {
        return mielAbs;
    }

    public void setMielAbs(TextField mielAbs) {
        this.mielAbs = mielAbs;
    }

    public TextField getMielRel() {
        return mielRel;
    }

    public void setMielRel(TextField mielRel) {
        this.mielRel = mielRel;
    }

    public TextField getMonoRel() {
        return monoRel;
    }

    public void setMonoRel(TextField monoRel) {
        this.monoRel = monoRel;
    }

    public TextField getMonoAbs() {
        return monoAbs;
    }

    public void setMonoAbs(TextField monoAbs) {
        this.monoAbs = monoAbs;
    }

    public TextField getSegRel() {
        return segRel;
    }

    public void setSegRel(TextField segRel) {
        this.segRel = segRel;
    }

    public TextField getSegAbs() {
        return segAbs;
    }

    public void setSegAbs(TextField segAbs) {
        this.segAbs = segAbs;
    }

    public TextField getBasoAbs() {
        return basoAbs;
    }

    public void setBasoAbs(TextField basoAbs) {
        this.basoAbs = basoAbs;
    }

    public TextField getBasoRel() {
        return basoRel;
    }

    public void setBasoRel(TextField basoRel) {
        this.basoRel = basoRel;
    }

    public TextField getEosiAbs() {
        return eosiAbs;
    }

    public void setEosiAbs(TextField eosiAbs) {
        this.eosiAbs = eosiAbs;
    }

    public TextField getEosiRel() {
        return eosiRel;
    }

    public void setEosiRel(TextField eosiRel) {
        this.eosiRel = eosiRel;
    }

    public TextField getBlastRel() {
        return blastRel;
    }

    public void setBlastRel(TextField blastRel) {
        this.blastRel = blastRel;
    }

    public TextField getBlastAbs() {
        return blastAbs;
    }

    public void setBlastAbs(TextField blastAbs) {
        this.blastAbs = blastAbs;
    }

    public TextField getBastAbs() {
        return bastAbs;
    }

    public void setBastAbs(TextField bastAbs) {
        this.bastAbs = bastAbs;
    }

    public TextField getBastRel() {
        return bastRel;
    }

    public void setBastRel(TextField bastRel) {
        this.bastRel = bastRel;
    }

    public TextField getPromielRel() {
        return promielRel;
    }

    public void setPromielRel(TextField promielRel) {
        this.promielRel = promielRel;
    }

    public TextField getPromielAbs() {
        return promielAbs;
    }

    public void setPromielAbs(TextField promielAbs) {
        this.promielAbs = promielAbs;
    }

    public TextField getPlasmoRel() {
        return plasmoRel;
    }

    public void setPlasmoRel(TextField plasmoRel) {
        this.plasmoRel = plasmoRel;
    }

    public TextField getPlasmoAbs() {
        return plasmoAbs;
    }

    public void setPlasmoAbs(TextField plasmoAbs) {
        this.plasmoAbs = plasmoAbs;
    }

    public TextField getPlaqEd() {
        return plaqEd;
    }

    public void setPlaqEd(TextField plaqEd) {
        this.plaqEd = plaqEd;
    }

    public TextField getNeuAbs() {
        return neuAbs;
    }

    public void setNeuAbs(TextField neuAbs) {
        this.neuAbs = neuAbs;
    }

    public TextField getNeuRel() {
        return neuRel;
    }

    public void setNeuRel(TextField neuRel) {
        this.neuRel = neuRel;
    }

    public TextArea getHemObserv() {
        return hemObserv;
    }

    public void setHemObserv(TextArea hemObserv) {
        this.hemObserv = hemObserv;
    }

    public TextArea getLeucoObserv() {
        return leucoObserv;
    }

    public void setLeucoObserv(TextArea leucoObserv) {
        this.leucoObserv = leucoObserv;
    }

    public TextArea getPlaqObserv() {
        return plaqObserv;
    }

    public void setPlaqObserv(TextArea plaqObserv) {
        this.plaqObserv = plaqObserv;
    }

    public ComboBox<String> getSexo() {
        return sexo;
    }

    public void setSexo(ComboBox<String> sexo) {
        this.sexo = sexo;
    }
}
