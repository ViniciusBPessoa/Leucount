package com.ufrpe.leucount.controladores;

import com.ufrpe.leucount.Alerts;
import com.ufrpe.leucount.ScreenManager;
import dados.interfaces.InterfaceControlContador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import negocio.Amostra;
import negocio.Hemograma;

import java.io.IOException;


public class ControladorContador implements InterfaceControlContador{

    @FXML private TextField numCell;
    @FXML private Label neuCont;
    @FXML private Label segCont;
    @FXML private Label basoCont;
    @FXML private Label bastCont;
    @FXML private Label blastoCont;
    @FXML private Label eosiCont;
    @FXML private Label contCell;
    @FXML private Label eritroCont;
    @FXML private Label linfoCont;
    @FXML private Label linfoContA;
    @FXML private Label linfoContT;
    @FXML private Label metaCont;
    @FXML private Label mieloCont;
    @FXML private Label monoCont;
    @FXML private Label multisegCont;
    @FXML private Label plasmoCont;
    @FXML private Label promieloCont;
    @FXML private Button btnseg;
    @FXML private Button btnmulti;
    @FXML private Button btnbasto;
    @FXML private Button btnmeta;
    @FXML private Button btnmielo;
    @FXML private Button btnpromielo;
    @FXML private Button btnblasto;
    @FXML private Button btnlinfoT;
    @FXML private Button btnlinfoA;
    @FXML private Button btnmono;
    @FXML private Button btneosi;
    @FXML private Button btnbaso;
    @FXML private Button btneritro;
    @FXML private Button btnplasmo;

    @FXML private TextField nAmostra;
    @FXML private TextField nomePaciente;

    private int contTotal = 0;
    private int contSeg = 0;
    private int contBast = 0;
    private int contMeta = 0;
    private int contMielo = 0;
    private int contPromielo = 0;
    private int contMultiseg = 0;
    private int contBlasto = 0;
    private int contLinfoA = 0;
    private int contLinfoT = 0;
    private int contMono = 0;
    private int contEosi = 0;
    private int contBaso = 0;
    private int contEritro = 0;
    private int contPlasmo = 0;
    private int contLinfo = 0;
    private int contNeu = 0;
    private int numCont = 0;

    @FXML
    private void onClickButton(ActionEvent event) {
        Button btnDigitado = ((Button) event.getTarget());
        String numString = numCell.getText();
        numCont = Integer.parseInt(numString);

        String digBtn = btnDigitado.getId();

        if (contTotal<numCont) {
            switch (digBtn) {
                case "btnseg":
                    contTotal++;
                    contSeg++;
                    contNeu++;
                    contCell.setText(Integer.toString(contTotal));
                    segCont.setText(Integer.toString(contSeg));
                    neuCont.setText(Integer.toString(contNeu));
                    break;
                case "btnbasto":
                    contTotal++;
                    contBast++;
                    contNeu++;
                    contCell.setText(Integer.toString(contTotal));
                    bastCont.setText(Integer.toString(contBast));
                    neuCont.setText(Integer.toString(contNeu));
                    break;
                case "btnmeta":
                    contTotal++;
                    contNeu++;
                    contMeta++;
                    contCell.setText(Integer.toString(contTotal));
                    metaCont.setText(Integer.toString(contMeta));
                    neuCont.setText(Integer.toString(contNeu));
                    break;
                case "btnmielo":
                    contTotal++;
                    contNeu++;
                    contMielo++;
                    mieloCont.setText(Integer.toString(contMielo));
                    neuCont.setText(Integer.toString(contNeu));
                    contCell.setText(Integer.toString(contTotal));
                    break;
                case "btnpromielo":
                    contTotal++;
                    contPromielo++;
                    contNeu++;
                    promieloCont.setText(Integer.toString(contPromielo));
                    neuCont.setText(Integer.toString(contNeu));
                    contCell.setText(Integer.toString(contTotal));
                    break;
                case "btnmulti":
                    contTotal++;
                    contMultiseg++;
                    contNeu++;
                    multisegCont.setText(Integer.toString(contMultiseg));
                    neuCont.setText(Integer.toString(contNeu));
                    contCell.setText(Integer.toString(contTotal));
                    break;
                case "btnblasto":
                    contTotal++;
                    contBlasto++;
                    blastoCont.setText(Integer.toString(contBlasto));
                    contCell.setText(Integer.toString(contTotal));
                    break;
                case "btnplasmo":
                    contTotal++;
                    contPlasmo++;
                    plasmoCont.setText(Integer.toString(contPlasmo));
                    contCell.setText(Integer.toString(contTotal));

                    break;
                case "btnlinfoA":
                    contTotal++;
                    contLinfo++;
                    contLinfoA++;
                    linfoContA.setText(Integer.toString(contLinfoA));
                    contCell.setText(Integer.toString(contTotal));
                    linfoCont.setText(Integer.toString(contLinfo));

                    break;
                case "btnlinfoT":
                    contTotal++;
                    contLinfo++;
                    contLinfoT++;
                    linfoContT.setText(Integer.toString(contLinfoT));
                    contCell.setText(Integer.toString(contTotal));
                    linfoCont.setText(Integer.toString(contLinfo));
                    break;
                case "btnmono":
                    contTotal++;
                    contMono++;
                    monoCont.setText(Integer.toString(contMono));
                    contCell.setText(Integer.toString(contTotal));
                    break;
                case "btneosi":
                    contTotal++;
                    contEosi++;
                    eosiCont.setText(Integer.toString(contEosi));
                    contCell.setText(Integer.toString(contTotal));
                    break;
                case "btnbaso":
                    contTotal++;
                    contBaso++;
                    basoCont.setText(Integer.toString(contBaso));
                    contCell.setText(Integer.toString(contTotal));
                    break;
                case "btneritro":
                    contTotal++;
                    contEritro++;
                    eritroCont.setText(Integer.toString(contEritro));
                    contCell.setText(Integer.toString(contTotal));
                    break;
            }
        }
        else{
            Alerts.showAlert("Contador Leucocitário", "Contagem finalizada", "" , Alert.AlertType.INFORMATION );
        }

    }
    @FXML
    public void onbtnSalvar() throws IOException {

        if (this.getNomePaciente().getText().equals("")){
            Alerts.showAlert("Nome não digitado!", "Nome do paciente não digitado!", "", Alert.AlertType.INFORMATION);
        }else{
            String numString = numCell.getText();
            numCont = Integer.parseInt(numString);


            if (contTotal<numCont || contTotal>numCont) {
                Alerts.showAlert("Número de celulas insuficiente!!", "Número de celulas insuficiente!!", "", Alert.AlertType.INFORMATION);
            }else {
                Hemograma hemo = new Hemograma(Integer.parseInt(neuCont.getText()), Integer.parseInt(segCont.getText()),
                        Integer.parseInt(basoCont.getText()), Integer.parseInt(bastCont.getText()),
                        Integer.parseInt(blastoCont.getText()), Integer.parseInt(eosiCont.getText()),
                        Integer.parseInt(eritroCont.getText()), Integer.parseInt(linfoCont.getText()),
                        Integer.parseInt(linfoContA.getText()), Integer.parseInt(linfoContT.getText()),
                        Integer.parseInt(metaCont.getText()), Integer.parseInt(mieloCont.getText()),
                        Integer.parseInt(monoCont.getText()), Integer.parseInt(multisegCont.getText()),
                        Integer.parseInt(plasmoCont.getText()), Integer.parseInt(promieloCont.getText()));

                Amostra amostra = new Amostra(nAmostra.getText(), nomePaciente.getText(), hemo, contTotal);

                ScreenManager.getInstancia().trocatela("hemogramaTela", amostra);
            }
        }



    }

    @FXML
    public void onbtnLimpar() throws IOException {
        ScreenManager.getInstancia().ReloadContador();
    }

    public TextField getNumCell() {
        return numCell;
    }

    public void setNumCell(TextField numCell) {
        this.numCell = numCell;
    }

    public Label getNeuCont() {
        return neuCont;
    }

    public void setNeuCont(Label neuCont) {
        this.neuCont = neuCont;
    }

    public Label getSegCont() {
        return segCont;
    }

    public void setSegCont(Label segCont) {
        this.segCont = segCont;
    }

    public Label getBasoCont() {
        return basoCont;
    }

    public void setBasoCont(Label basoCont) {
        this.basoCont = basoCont;
    }

    public Label getBastCont() {
        return bastCont;
    }

    public void setBastCont(Label bastCont) {
        this.bastCont = bastCont;
    }

    public Label getBlastoCont() {
        return blastoCont;
    }

    public void setBlastoCont(Label blastoCont) {
        this.blastoCont = blastoCont;
    }

    public Label getEosiCont() {
        return eosiCont;
    }

    public void setEosiCont(Label eosiCont) {
        this.eosiCont = eosiCont;
    }

    public Label getContCell() {
        return contCell;
    }

    public void setContCell(Label contCell) {
        this.contCell = contCell;
    }

    public Label getEritroCont() {
        return eritroCont;
    }

    public void setEritroCont(Label eritroCont) {
        this.eritroCont = eritroCont;
    }

    public Label getLinfoCont() {
        return linfoCont;
    }

    public void setLinfoCont(Label linfoCont) {
        this.linfoCont = linfoCont;
    }

    public Label getLinfoContA() {
        return linfoContA;
    }

    public void setLinfoContA(Label linfoContA) {
        this.linfoContA = linfoContA;
    }

    public Label getLinfoContT() {
        return linfoContT;
    }

    public void setLinfoContT(Label linfoContT) {
        this.linfoContT = linfoContT;
    }

    public Label getMetaCont() {
        return metaCont;
    }

    public void setMetaCont(Label metaCont) {
        this.metaCont = metaCont;
    }

    public Label getMieloCont() {
        return mieloCont;
    }

    public void setMieloCont(Label mieloCont) {
        this.mieloCont = mieloCont;
    }

    public Label getMonoCont() {
        return monoCont;
    }

    public void setMonoCont(Label monoCont) {
        this.monoCont = monoCont;
    }

    public Label getMultisegCont() {
        return multisegCont;
    }

    public void setMultisegCont(Label multisegCont) {
        this.multisegCont = multisegCont;
    }

    public Label getPlasmoCont() {
        return plasmoCont;
    }

    public void setPlasmoCont(Label plasmoCont) {
        this.plasmoCont = plasmoCont;
    }

    public Label getPromieloCont() {
        return promieloCont;
    }

    public void setPromieloCont(Label promieloCont) {
        this.promieloCont = promieloCont;
    }

    public Button getBtnseg() {
        return btnseg;
    }

    public void setBtnseg(Button btnseg) {
        this.btnseg = btnseg;
    }

    public Button getBtnmulti() {
        return btnmulti;
    }

    public void setBtnmulti(Button btnmulti) {
        this.btnmulti = btnmulti;
    }

    public Button getBtnbasto() {
        return btnbasto;
    }

    public void setBtnbasto(Button btnbasto) {
        this.btnbasto = btnbasto;
    }

    public Button getBtnmeta() {
        return btnmeta;
    }

    public void setBtnmeta(Button btnmeta) {
        this.btnmeta = btnmeta;
    }

    public Button getBtnmielo() {
        return btnmielo;
    }

    public void setBtnmielo(Button btnmielo) {
        this.btnmielo = btnmielo;
    }

    public Button getBtnpromielo() {
        return btnpromielo;
    }

    public void setBtnpromielo(Button btnpromielo) {
        this.btnpromielo = btnpromielo;
    }

    public Button getBtnblasto() {
        return btnblasto;
    }

    public void setBtnblasto(Button btnblasto) {
        this.btnblasto = btnblasto;
    }

    public Button getBtnlinfoT() {
        return btnlinfoT;
    }

    public void setBtnlinfoT(Button btnlinfoT) {
        this.btnlinfoT = btnlinfoT;
    }

    public Button getBtnlinfoA() {
        return btnlinfoA;
    }

    public void setBtnlinfoA(Button btnlinfoA) {
        this.btnlinfoA = btnlinfoA;
    }

    public Button getBtnmono() {
        return btnmono;
    }

    public void setBtnmono(Button btnmono) {
        this.btnmono = btnmono;
    }

    public Button getBtneosi() {
        return btneosi;
    }

    public void setBtneosi(Button btneosi) {
        this.btneosi = btneosi;
    }

    public Button getBtnbaso() {
        return btnbaso;
    }

    public void setBtnbaso(Button btnbaso) {
        this.btnbaso = btnbaso;
    }

    public Button getBtneritro() {
        return btneritro;
    }

    public void setBtneritro(Button btneritro) {
        this.btneritro = btneritro;
    }

    public Button getBtnplasmo() {
        return btnplasmo;
    }

    public void setBtnplasmo(Button btnplasmo) {
        this.btnplasmo = btnplasmo;
    }

    public int getContTotal() {
        return contTotal;
    }

    public void setContTotal(int contTotal) {
        this.contTotal = contTotal;
    }

    public int getContSeg() {
        return contSeg;
    }

    public void setContSeg(int contSeg) {
        this.contSeg = contSeg;
    }

    public int getContBast() {
        return contBast;
    }

    public void setContBast(int contBast) {
        this.contBast = contBast;
    }

    public int getContMeta() {
        return contMeta;
    }

    public void setContMeta(int contMeta) {
        this.contMeta = contMeta;
    }

    public int getContMielo() {
        return contMielo;
    }

    public void setContMielo(int contMielo) {
        this.contMielo = contMielo;
    }

    public int getContPromielo() {
        return contPromielo;
    }

    public void setContPromielo(int contPromielo) {
        this.contPromielo = contPromielo;
    }

    public int getContMultiseg() {
        return contMultiseg;
    }

    public void setContMultiseg(int contMultiseg) {
        this.contMultiseg = contMultiseg;
    }

    public int getContBlasto() {
        return contBlasto;
    }

    public void setContBlasto(int contBlasto) {
        this.contBlasto = contBlasto;
    }

    public int getContLinfoA() {
        return contLinfoA;
    }

    public void setContLinfoA(int contLinfoA) {
        this.contLinfoA = contLinfoA;
    }

    public int getContLinfoT() {
        return contLinfoT;
    }

    public void setContLinfoT(int contLinfoT) {
        this.contLinfoT = contLinfoT;
    }

    public int getContMono() {
        return contMono;
    }

    public void setContMono(int contMono) {
        this.contMono = contMono;
    }

    public int getContEosi() {
        return contEosi;
    }

    public void setContEosi(int contEosi) {
        this.contEosi = contEosi;
    }

    public int getContBaso() {
        return contBaso;
    }

    public void setContBaso(int contBaso) {
        this.contBaso = contBaso;
    }

    public int getContEritro() {
        return contEritro;
    }

    public void setContEritro(int contEritro) {
        this.contEritro = contEritro;
    }

    public int getContPlasmo() {
        return contPlasmo;
    }

    public void setContPlasmo(int contPlasmo) {
        this.contPlasmo = contPlasmo;
    }

    public int getContLinfo() {
        return contLinfo;
    }

    public void setContLinfo(int contLinfo) {
        this.contLinfo = contLinfo;
    }

    public int getContNeu() {
        return contNeu;
    }

    public void setContNeu(int contNeu) {
        this.contNeu = contNeu;
    }

    public int getNumCont() {
        return numCont;
    }

    public void setNumCont(int numCont) {
        this.numCont = numCont;
    }

    public TextField getnAmostra() {
        return nAmostra;
    }

    public void setnAmostra(TextField nAmostra) {
        this.nAmostra = nAmostra;
    }

    public TextField getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(TextField nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
}
