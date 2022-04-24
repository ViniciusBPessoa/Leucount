package dados;

import java.util.ArrayList;

public class ControladorGrupos {

    private ArrayList<Grupos> grupos;

    /* Revisar meios de salvamento emarquivo com prof */

    public void ControladorGrupos(ArrayList<Grupos> grupos) {
        this.grupos = grupos;
    }

    public ControladorGrupos(){} /* carregar os arquivos .dat */

    public void Inserir(Grupos chat){
        this.grupos.clear();
        this.grupos.add(chat);
    }

    public void Deletar(){  /* sem considerar nenhuma exeção */
        this.grupos.clear();
    }

    public void salvar(){} /* Responsavel por armazenar em um arquivo */

    public ArrayList<Grupos> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupos> grupos) {
        this.grupos = grupos;
    }
}
