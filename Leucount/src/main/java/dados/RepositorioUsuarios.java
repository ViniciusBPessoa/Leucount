package dados;

import dados.interfaces.InterfaceRepositorioUsuarios;
import negocio.social.Usuario;

import java.io.Serializable;
import java.util.HashMap;

public class RepositorioUsuarios implements InterfaceRepositorioUsuarios, Serializable {

    private HashMap <String, Usuario> usuarios = new HashMap<>();

    public RepositorioUsuarios(HashMap<String, Usuario> usuarios) {
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
        return this.usuarios.get(codigo);
    }

    @Override
    public boolean buscarContaBoolean(String codigo){
        return this.usuarios.containsKey(codigo);
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
