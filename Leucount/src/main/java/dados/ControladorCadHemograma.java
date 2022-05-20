package dados;

import dados.interfaces.InterfaceControladorCadHemograma;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ControladorCadHemograma implements InterfaceControladorCadHemograma {

    private ArrayList<RepositorioCadHemograma> cadHemo;
    @FXML private TextField hemacia;
    @FXML private TextField hematocrito;
    @FXML private TextField hemoglobina;
    @FXML private TextField rdwEd;
    @FXML private TextField hcmEd;
    @FXML private TextField chcmEd;
    @FXML private TextField vcmEd;
    @FXML private TextField LeucoTot;
    @FXML private TextField linfoAAbs;
    @FXML private TextField linfoARel;
    @FXML private TextField linfoTRel;
    @FXML private TextField linfoAbs;
    @FXML private TextField metaAbs;
    @FXML private TextField metaRel;
    @FXML private TextField mielAbs;
    @FXML private TextField mielRel;
    @FXML private TextField monoRel;
    @FXML private TextField monoAbs;
    @FXML private TextField segRel;
    @FXML private TextField segAbs;
    @FXML private TextField basoAbs;
    @FXML private TextField basoRel;
    @FXML private TextField eosiAbs;
    @FXML private TextField eosiRel;
    @FXML private TextField blastRel;
    @FXML private TextField blastAbs;
    @FXML private TextField bastAbs;
    @FXML private TextField bastRel;
    @FXML private TextField promielRel;
    @FXML private TextField promielAbs;
    @FXML private TextField plasmoRel;
    @FXML private TextField plasmoAbs;
    @FXML private TextField plaqEd;
    @FXML private TextField neuAbs;
    @FXML private TextField neuRel;
    @FXML private TextArea hemObserv;
    @FXML private TextArea leucoObserv;
    @FXML private TextArea plaqObserv;

    public ControladorCadHemograma(ArrayList<RepositorioCadHemograma> cadHemo) {
        this.cadHemo = cadHemo;
    }

    @FXML
    public void onContadorButton(){

    }

    @FXML
    public void onSalvarButton(){

    }

}
