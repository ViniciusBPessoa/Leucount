package dados.interfaces;

import dados.RepositorioUsuarios;
import negocio.social.Usuario;

public interface InterfaceControladorUsuariosArquivos {

    void inserir(RepositorioUsuarios repositorio);

    void deletar(Usuario usuario);

    void salvar() /* Responsavel por armazenar em um arquivo */;
}
