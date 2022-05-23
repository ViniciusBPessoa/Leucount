package negocio.social;

import dados.aleatorio.CodeCriator;
import negocio.Grupos;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Usuario implements Serializable {

    private String nome;
    private String codigo;
    private String senha;
    private LocalDate dataNascimento;
    private String titulo;
    private ArrayList<String> feed = new ArrayList<>(10);
    private ArrayList<Grupos> grupos;


    public Usuario(String nome, String senha , LocalDate dataNascimento, String titulo) {
        this.nome = nome;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.titulo = titulo;
        this.codigo = CodeCriator.aleatorio();
    }

    public long idade(){

        LocalDate agora = LocalDate.now();

        return ChronoUnit.YEARS.between(dataNascimento, agora);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", senha='" + senha + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", feed=" + feed +
                ", grupos=" + grupos +
                '}';
    }

    public void adicionarGrupo(){}


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<String> getFeed() {
        return feed;
    }

    public void setFeed(ArrayList<String> feed) {
        this.feed = feed;
    }

    public ArrayList<Grupos> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupos> grupos) {
        this.grupos = grupos;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
