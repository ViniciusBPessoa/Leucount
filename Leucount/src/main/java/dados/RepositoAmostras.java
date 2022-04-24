package dados;

import negocio.Amostra;

import java.util.Map;

public class RepositoAmostras {

    private Map<String, Amostra> amostras;

    public RepositoAmostras(Map<String, Amostra> amostras) {
        this.amostras = amostras;
    }

    public RepositoAmostras() {
    }

    public void incerir(Amostra amostra){  /* exeções ainda não tratadas */
        this.amostras.put(amostra.getIdAmostra(), amostra);
    }

    public void remover(Amostra amostra){
        this.amostras.remove(amostra.getIdAmostra());
    }

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
