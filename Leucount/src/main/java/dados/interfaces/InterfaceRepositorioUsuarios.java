package dados.interfaces;

import negocio.social.Usuario;

public interface InterfaceRepositorioUsuarios {

    void inserir(Usuario usuario);

    void deletar(String codigo);

    Usuario buscar(String codigo);
}
