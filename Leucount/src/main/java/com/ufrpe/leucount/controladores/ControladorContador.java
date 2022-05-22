package dados;

import dados.interfaces.InterfaceControlContador;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ControladorContador implements InterfaceControlContador{
    private ArrayList<RepositorioContador> contadorlista;

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
    @FXML private Button btnplasmo;
    @FXML private Button btnseg;
    @FXML private Button btnmulti;
    @FXML private Button btnpbasto;
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
    @FXML private Button btnSalvar;
    @FXML private Button btnLimpar;

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

    public ControladorContador(ArrayList<RepositorioContador> contadorlista) {

        this.contadorlista = contadorlista;
    }

    @FXML
    public void onBtnSeg(){
        contTotal++;
        contSeg++;
        contCell.setText(Integer.toString(contTotal));
        segCont.setText(Integer.toString(contSeg));
    }

    @FXML
    public void onBtnBast(){
        contTotal++;
        contBast++;
        contCell.setText(Integer.toString(contTotal));
        bastCont.setText(Integer.toString(contBast));
    }

    @FXML
    public void onBtnMeta(){
        contMeta++;
        metaCont.setText(Integer.toString(contMeta));

    }

    @FXML
    public void onBtnMielo(){
        contMielo++;
        mieloCont.setText(Integer.toString(contMielo));
    }

    @FXML
    public void onBtProMielo(){
        contPromielo++;
        promieloCont.setText(Integer.toString(contPromielo));
    }

    @FXML
    public void onBtnBlasto(){
        contBlasto++;
        blastoCont.setText(Integer.toString(contBlasto));

    }

    @FXML
    public void onBtnPlasmo(){
        contPlasmo++;
        plasmoCont.setText(Integer.toString(contPlasmo));

    }

    @FXML
    public void onBtnLinfoT(){
        contLinfoT++;
        linfoContT.setText(Integer.toString(contLinfoT));

    }

    @FXML
    public void onBtnLinfoA(){
        contLinfoA++;
        linfoContA.setText(Integer.toString(contLinfoA));

    }

    @FXML
    public void onBtnMono(){
        contMono++;
        monoCont.setText(Integer.toString(contMono));

    }

    @FXML
    public void onBtnEosi(){
        contEosi++;
        eosiCont.setText(Integer.toString(contEosi));

    }

    @FXML
    public void onBtnBaso(){
        basoCont.setText(Integer.toString(contBaso));

    }

    @FXML
    public void onBtnEritro(){
        contEritro++;
        eritroCont.setText(Integer.toString(contEritro));

    }

    @FXML
    public void onBtnMulti(){
        contMultiseg++;
        multisegCont.setText(Integer.toString(contMultiseg));

    }

    @FXML
    public void onBtnLimpar(){

    }

    @FXML
    public void onBtnSalvar(){

    }

}
