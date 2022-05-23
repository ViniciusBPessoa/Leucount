package dados;

import dados.interfaces.InterfaceRepositorioAmostra;
import negocio.Amostra;

import java.io.Serializable;
import java.util.Map;

public class RepositorioAmostras implements InterfaceRepositorioAmostra , Serializable {

    private Map<String, Amostra> amostras;



    @Override
    public void inserir(Amostra amostra){  /* exeções ainda não tratadas */
        this.amostras.put(amostra.getIdAmostra(), amostra);
    }

    @Override
    public void remover(Amostra amostra){
        this.amostras.remove(amostra.getIdAmostra());
    }

    @Override
    public Amostra busca(String idamostra){
        Amostra amostra = amostras.get(idamostra);
        return amostra;
    }

    public Map<String, Amostra> getAmostras() {
        return amostras;
    }

    public void setAmostras(Map<String, Amostra> amostras) {
        this.amostras = amostras;
    }
}
