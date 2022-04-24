package negocio.usuarios;

import dados.enumeradores.Titulos;

import java.time.LocalDate;

public class Profissional extends Usuario{

    private String titulo;

    public Profissional(String nome, String codigo, LocalDate dataNascimento, Titulos titulo) {
        super(nome, codigo, dataNascimento);
        this.titulo = titulo.getTitulo();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
