package negocio.usuarios;

import java.time.LocalDate;

public class Estudante extends Usuario{

    private String tipo = "Estudante";

    public Estudante(String nome, String codigo, LocalDate dataNascimento) {
        super(nome, codigo, dataNascimento);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
