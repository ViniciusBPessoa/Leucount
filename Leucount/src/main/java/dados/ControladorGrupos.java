package dados;

import dados.interfaces.InterfaceControladorGrupos;

import java.util.ArrayList;

public class ControladorGrupos implements InterfaceControladorGrupos {

    private ArrayList<Grupos> grupos;

    /* Revisar meios de salvamento emarquivo com prof */

    public ControladorGrupos(ArrayList<Grupos> grupos) {
        this.grupos = grupos;
    }

    public ControladorGrupos(){} /* carregar os arquivos .dat */

    @Override
    public void Inserir(Grupos chat){
        this.grupos.clear();
        this.grupos.add(chat);
    }

    @Override
    public void Deletar(){  /* sem considerar nenhuma exeção */
        this.grupos.clear();
    }

    @Override
    public void salvar(){} /* Responsavel por armazenar em um arquivo */

    public ArrayList<Grupos> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupos> grupos) {
        this.grupos = grupos;
    }
}
