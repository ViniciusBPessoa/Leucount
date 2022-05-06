package dados.interfaces;

import negocio.Grupos;

public interface InterfaceControladorGrupos {

    void inserir(Grupos chat);

    void deletar();

    void salvar() /* Responsavel por armazenar em um arquivo */;
}
