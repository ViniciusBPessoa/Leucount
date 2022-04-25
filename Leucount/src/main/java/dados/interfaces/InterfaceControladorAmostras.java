package dados.interfaces;

import dados.RepositorioAmostras;
import negocio.usuarios.Usuario;

public interface InterfaceControladorAmostras {
    void inserir(RepositorioAmostras repositorio);

    void deletar(Usuario usuario);

    void salvar() /* Responsavel por armazenar em um arquivo */;
}
