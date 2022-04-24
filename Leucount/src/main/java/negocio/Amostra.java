package negocio;

import negocio.usuarios.Profissional;

import java.time.LocalDate;
import java.util.PrimitiveIterator;

public class Amostra {

    private String idAmostra;
    private String nomePct;
    private int idadePct;
    private char sexopct;
    private String descricao;
    private Hemograma hemograma;
    private LocalDate dataAmostra;

    public Amostra(String idAmostra, String nomePct, int idadePct, char sexopct, String descricao, Hemograma hemograma, LocalDate dataAmostra) {
        this.idAmostra = idAmostra;
        this.nomePct = nomePct;
        this.idadePct = idadePct;
        this.sexopct = sexopct;
        this.descricao = descricao;
        this.hemograma = hemograma;
        this.dataAmostra = dataAmostra;
    }

    public Amostra(String idAmostra, String nomePct, int idadePct, char sexopct, Hemograma hemograma, LocalDate dataAmostra) {
        this.idAmostra = idAmostra;
        this.nomePct = nomePct;
        this.idadePct = idadePct;
        this.sexopct = sexopct;
        this.hemograma = hemograma;
        this.dataAmostra = dataAmostra;
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

    public char getSexopct() {
        return sexopct;
    }

    public void setSexopct(char sexopct) {
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
}
