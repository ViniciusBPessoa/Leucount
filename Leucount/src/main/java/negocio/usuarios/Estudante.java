package negocio.usuarios;

import java.time.LocalDate;

public class Estudante extends Usuario{

    private String titulo = "Estudante";

    public Estudante(String nome, String codigo, LocalDate dataNascimento) {
        super(nome, codigo, dataNascimento);
    }

    public String getTipo() {
        return titulo;
    }

    public void setTipo(String tipo) {
        this.titulo = tipo;
    }
}
