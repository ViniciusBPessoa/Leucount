package dados.interfaces;

import negocio.Amostra;

import java.util.Map;

public interface InterfaceRepositorioAmostra {


    void incerir(Amostra amostra);

    void remover(Amostra amostra);

    Amostra busca(String idamostra);
}
