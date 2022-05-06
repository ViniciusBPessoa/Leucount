package dados.enumeradores;

public enum Titulos {

    Gerente("Gerente"),
    Analista("Analista"),
    Estudante("Estudante");

    private String titulo;

    Titulos(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}
