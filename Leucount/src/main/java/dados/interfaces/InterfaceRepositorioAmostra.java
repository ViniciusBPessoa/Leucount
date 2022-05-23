package dados.interfaces;

import negocio.Amostra;

import java.io.Serializable;
import java.util.Map;

public interface InterfaceRepositorioAmostra {


    void inserir(Amostra amostra);

    void remover(Amostra amostra);

    Amostra busca(String idamostra);
}
