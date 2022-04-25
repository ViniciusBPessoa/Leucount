package dados;

import dados.interfaces.InterfaceControladorUsuariosArquivos;
import negocio.usuarios.Usuario;

import java.util.ArrayList;
import java.util.Map;

public class ControladorUsuariosArquivos implements InterfaceControladorUsuariosArquivos {

    private ArrayList<RepositorioUsuarios> usuarios; /* Revisar meios de salvamento emarquivo com prof */

    public ControladorUsuariosArquivos(ArrayList<RepositorioUsuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public ControladorUsuariosArquivos(){} /* carregar os arquivos .dat */

    @Override
    public void inserir(RepositorioUsuarios repositorio){
        this.usuarios.clear();
        this.usuarios.add(repositorio);
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
