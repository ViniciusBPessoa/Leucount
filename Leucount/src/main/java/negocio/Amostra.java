package negocio;

import java.io.Serializable;
import java.time.LocalDate;

public class Amostra implements Serializable {

    private String idAmostra;
    private String nomePct;
    private int idadePct;
    private String sexopct;
    private String descricao;
    private Hemograma hemograma;
    private LocalDate dataAmostra;
    private String obsHema;
    private String obsplaq;
    private String obsLinfo;

    private int contcell;

    public Amostra(String idAmostra, String nomePct, Hemograma hemograma, int numcel) {
        this.idAmostra = idAmostra;
        this.nomePct = nomePct;
        this.hemograma = hemograma;
        this.dataAmostra = LocalDate.now();
        this.contcell = numcel;
    }

    public int getContcell() {
        return contcell;
    }

    public void setContcell(int contcell) {
        this.contcell = contcell;
    }

    public String getIdAmostra() {
        return idAmostra;
    }

    public void setIdAmostra(String idAmostra) {
        this.idAmostra = idAmostra;
    }

    public String getNomePct() {
        return nomePct;
    }

    public void setNomePct(String nomePct) {
        this.nomePct = nomePct;
    }

    public int getIdadePct() {
        return idadePct;
    }

    public void setIdadePct(int idadePct) {
        this.idadePct = idadePct;
    }

    public String getSexopct() {
        return sexopct;
    }

    public void setSexopct(String sexopct) {
        this.sexopct = sexopct;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Hemograma getHemograma() {
        return hemograma;
    }

    public void setHemograma(Hemograma hemograma) {
        this.hemograma = hemograma;
    }

    public LocalDate getDataAmostra() {return dataAmostra;}

    public void setDataAmostra(LocalDate dataAmostra) {this.dataAmostra = dataAmostra;}

    public String getObsHema() {
        return obsHema;
    }

    public void setObsHema(String obsHema) {
        this.obsHema = obsHema;
    }

    public String getObsplaq() {
        return obsplaq;
    }

    public void setObsplaq(String obsplaq) {
        this.obsplaq = obsplaq;
    }

    public String getObsLinfo() {
        return obsLinfo;
    }

    public void setObsLinfo(String obsLinfo) {
        this.obsLinfo = obsLinfo;
    }
}
