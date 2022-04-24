package dados.enumeradores;

public enum Titulos {

    Gerente("Gerente"),
    Analista("Analista");

    private String titulo;

    Titulos(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}
