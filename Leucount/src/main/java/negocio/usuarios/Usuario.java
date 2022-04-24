package negocio.usuarios;

import java.time.LocalDate;

public abstract class Usuario {

    private String nome;
    private String codigo;
    private LocalDate dataNascimento;


    public Usuario(String nome, String codigo, LocalDate dataNascimento) {
        this.nome = nome;
        this.codigo = codigo;
        this.dataNascimento = dataNascimento;
    }


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

}
