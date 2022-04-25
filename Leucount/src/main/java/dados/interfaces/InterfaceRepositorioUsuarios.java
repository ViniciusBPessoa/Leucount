package dados.interfaces;

import negocio.usuarios.Usuario;

public interface InterfaceRepositorioUsuarios {

    void inserir(Usuario usuario);

    void deletar(String codigo);

    Usuario buscar(String codigo);
}
