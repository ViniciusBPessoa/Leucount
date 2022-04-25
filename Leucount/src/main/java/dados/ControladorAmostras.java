package dados;

import dados.interfaces.InterfaceControladorAmostras;
import negocio.usuarios.Usuario;

import java.util.ArrayList;

public class ControladorAmostras implements InterfaceControladorAmostras {

    private ArrayList<RepositoAmostras> amostras; /* Revisar meios de salvamento emarquivo com prof */

    public ControladorAmostras(ArrayList<RepositoAmostras> amostras) {
        this.amostras = amostras;
    }

    public ControladorAmostras(){} /* carregar os arquivos .dat */

    @Override
    public void Inserir(RepositoAmostras repositorio){
        this.amostras.clear();
        this.amostras.add(repositorio);
    }

    @Override
    public void Deletar(Usuario usuario){  /* sem considerar nenhuma exeção */
        this.amostras.clear();
    }

    @Override
    public void salvar(){} /* Responsavel por armazenar em um arquivo */

    public ArrayList<RepositoAmostras> getAmostras() {
        return amostras;
    }

    public void setAmostras(ArrayList<RepositoAmostras> amostras) {
        this.amostras = amostras;
    }
}
