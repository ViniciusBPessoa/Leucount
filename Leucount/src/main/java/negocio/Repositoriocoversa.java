package negocio;

import javafx.util.Pair;

import java.util.ArrayList;

public class Repositoriocoversa {

    private ArrayList<Pair<String, String>> historico;
    private String codigo;

    public Repositoriocoversa(String codigo) {
        this.codigo = codigo;
    }

    public void inserir(String nome, String msg){
            historico.add(new Pair<>(nome, msg));
    }

    public void remover(String nome, String msg){

        boolean encontrado = false;
        int posicao = 0;

        for (Pair<String, String> c : historico){
            if (c.getKey().equals(nome) && c.getValue().equals(msg)){
                encontrado = true;
                posicao = historico.indexOf(c);
                break;
            }
        }if (encontrado){
            historico.remove(posicao);
        }
    }

    public ArrayList<Pair<String, String>> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Pair<String, String>> historico) {
        this.historico = historico;
    }
}
