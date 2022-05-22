package dados;

import dados.interfaces.InterfaceControladorUsuariosArquivos;
import negocio.social.Usuario;

import java.util.ArrayList;
import java.util.Map;

public class ControladorUsuarios implements InterfaceControladorUsuariosArquivos {

    private RepositorioUsuarios usuarios; /* Revisar meios de salvamento emarquivo com prof */


    @Override
    public void inserir(RepositorioUsuarios repositorio) {

    }

    @Override
    public void deletar(Usuario usuario){  /* sem considerar nenhuma exeção */
        usuarios.clear();
    }

    @Override
    public void salvar(){} /* Responsavel por armazenar em um arquivo */

    public Map<String, Usuario> getUsuarios() {
        return this.usuarios.get(0).getUsuarios();
    }

    public void setUsuarios(ArrayList<RepositorioUsuarios> usuarios) {
        this.usuarios = usuarios;
    }

}
