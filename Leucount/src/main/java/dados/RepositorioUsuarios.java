package dados;

import dados.interfaces.InterfaceRepositorioUsuarios;
import negocio.social.Usuario;

import java.util.HashMap;
import java.util.Map;

public class RepositorioUsuarios implements InterfaceRepositorioUsuarios {

    private Map <String, Usuario> usuarios = new HashMap<>();

    public RepositorioUsuarios(Map<String, Usuario> usuarios) {

        this.usuarios = usuarios;
    }

    public RepositorioUsuarios(){ }

    @Override
    public void inserir(Usuario usuario){
        this.usuarios.put(usuario.getNome() + usuario.getSenha(), usuario); /* Ainda sem tratamento de exceção */
    }

    @Override
    public void deletar(String codigo){

        this.usuarios.remove(codigo);
    }

    @Override
    public Usuario buscar(String codigo){
        Usuario usuario = this.usuarios.get(codigo);
        return usuario;
    }

    @Override
    public boolean buscarContaBoolean(String codigo){
        boolean usuario = this.usuarios.containsKey(codigo);
        return usuario;
    }

    public Map<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Map<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
