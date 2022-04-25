package dados.interfaces;

import dados.RepositorioUsuarios;
import negocio.usuarios.Usuario;

public interface InterfaceControladorUsuariosArquivos {
    void Inserir(RepositorioUsuarios repositorio);

    void Deletar(Usuario usuario);

    void salvar() /* Responsavel por armazenar em um arquivo */;
}
