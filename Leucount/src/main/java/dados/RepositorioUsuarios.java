package dados;

import negocio.usuarios.Usuario;

import java.util.Map;

public class RepositorioUsuarios {

    private Map <String, Usuario> usuarios;

    public RepositorioUsuarios(Map<String, Usuario> usuarios) {

        this.usuarios = usuarios;
    }

    public RepositorioUsuarios(){ }

    public void inserir(Usuario usuario){
        this.usuarios.put(usuario.getCodigo(), usuario); /* Ainda sem tratamento de exceção */
    }

    public void deletar(String codigo){

        this.usuarios.remove(codigo);
    }

    public Usuario buscar(String codigo){
        Usuario usuario = this.usuarios.get(codigo);
        return usuario;
    }

    public Map<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Map<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
