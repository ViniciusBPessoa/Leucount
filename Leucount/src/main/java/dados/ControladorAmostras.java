package dados;

import dados.interfaces.InterfaceControladorAmostras;
import negocio.social.Usuario;

import java.util.ArrayList;

public class ControladorAmostras implements InterfaceControladorAmostras {

    private ArrayList<RepositorioAmostras> amostras; /* Revisar meios de salvamento emarquivo com prof */

    public ControladorAmostras(ArrayList<RepositorioAmostras> amostras) {
        this.amostras = amostras;
    }

    public ControladorAmostras(){} /* carregar os arquivos .dat */

    @Override
    public void inserir(RepositorioAmostras repositorio){
        this.amostras.clear();
        this.amostras.add(repositorio);
    }

    @Override
    public void deletar(Usuario usuario){  /* sem considerar nenhuma exeção */
        this.amostras.clear();
    }

    @Override
    public void salvar(){} /* Responsavel por armazenar em um arquivo */

    public ArrayList<RepositorioAmostras> getAmostras() {
        return amostras;
    }

    public void setAmostras(ArrayList<RepositorioAmostras> amostras) {
        this.amostras = amostras;
    }
}
