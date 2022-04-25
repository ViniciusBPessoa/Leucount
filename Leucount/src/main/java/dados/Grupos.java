package dados;

import dados.interfaces.InterfaceGrupos;

import java.util.ArrayList;

public class Grupos implements InterfaceGrupos {

    private String grupoNome;
    private String idGrupo;
    private String adm;
    private ArrayList<String> idUsuarios;
    private ArrayList<String> idAmostras;

    public Grupos(String grupoNome, String idGrupo, String adm) {
        this.grupoNome = grupoNome;
        this.idGrupo = idGrupo;
        this.adm = adm;
    }

    @Override
    public void inserirUsuario(String idUsuario){
        this.idUsuarios.add(idUsuario);
    }

    @Override
    public void inserirAmostra(String idAmostra){
        this.idAmostras.add(idAmostra);
    }

    @Override
    public void removerAmostra(String idAmostra){
        int item = 0;

        for (String c : this.idAmostras){
            if(c.equals(idAmostra)){
                item = this.idAmostras.indexOf(c);
                break;
            }
        }this.idAmostras.remove(item);
    }

    @Override
    public void removerUsuario(String idUsuario){
        int item = 0;

        for (String c : this.idUsuarios){
            if(c.equals(idUsuario)){
                item = this.idUsuarios.indexOf(c);
                break;
            }
        }this.idUsuarios.remove(item);
    }

    public String getGrupoNome() {
        return grupoNome;
    }

    public void setGrupoNome(String grupoNome) {
        this.grupoNome = grupoNome;
    }

    public String getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getAdm() {
        return adm;
    }

    public void setAdm(String adm) {
        this.adm = adm;
    }

    public ArrayList<String> getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(ArrayList<String> idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public ArrayList<String> getIdAmostras() {
        return idAmostras;
    }

    public void setIdAmostras(ArrayList<String> idAmostras) {
        this.idAmostras = idAmostras;
    }
}
