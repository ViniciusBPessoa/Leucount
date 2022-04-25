package dados.interfaces;

import dados.RepositorioUsuarios;
import negocio.usuarios.Usuario;

public interface InterfaceControladorUsuariosArquivos {

    void inserir(RepositorioUsuarios repositorio);

    void deletar(Usuario usuario);

    void salvar() /* Responsavel por armazenar em um arquivo */;
}
