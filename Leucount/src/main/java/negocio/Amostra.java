package negocio;

import dados.Hemograma;

public class Amostra {

    private String idAmostra;
    private String idPct;
    private String nomePct;
    private int idadePct;
    private char sexoPct;
    private String descricao;
    private Hemograma hemograma;

    public Amostra(String idAmostra, String idPct, String nomePct, int idadePct, char sexoPct, String descricao) {
        this.idAmostra = idAmostra;
        this.idPct = idPct;
        this.nomePct = nomePct;
        this.idadePct = idadePct;
        this.sexoPct = sexoPct;
        this.descricao = descricao;
    }

    public Amostra(String idAmostra, String idPct, String nomePct, Integer idadePct, char sexoPct, String descricao, Hemograma hemograma) {
        this.idAmostra = idAmostra;
        this.idPct = idPct;
        this.nomePct = nomePct;
        this.idadePct = idadePct;
        this.sexoPct = sexoPct;
        this.descricao = descricao;
        this.hemograma = hemograma;
    }

    public String getIdAmostra() {
        return idAmostra;
    }

    public void setIdAmostra(String idAmostra) {
        this.idAmostra = idAmostra;
    }

    public String getIdPct() {
        return idPct;
    }

    public void setIdPct(String idPct) {
        this.idPct = idPct;
    }

    public String getNomePct() {
        return nomePct;
    }

    public void setNomePct(String nomePct) {
        this.nomePct = nomePct;
    }

    public Integer getIdadePct() {
        return idadePct;
    }

    public void setIdadePct(Integer idadePct) {
        this.idadePct = idadePct;
    }

    public char getSexoPct() {
        return sexoPct;
    }

    public void setSexoPct(char sexoPct) {
        this.sexoPct = sexoPct;
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
}
