package dados.interfaces;

import dados.Grupos;

public interface InterfaceControladorGrupos {
    void Inserir(Grupos chat);

    void Deletar();

    void salvar() /* Responsavel por armazenar em um arquivo */;
}
