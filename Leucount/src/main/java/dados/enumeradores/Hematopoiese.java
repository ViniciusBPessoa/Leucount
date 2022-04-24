package dados.enumeradores;

public enum Hematopoiese {
    Hemacias("Hemacias"),
    Hematocrito("Hematocrito"),
    Hemoglobina("Hemoglobina"),
    RDW("RDW"),
    Plaquetas("Plaquetas");

    private String hematopoiese;

    Hematopoiese(String hematopoiese) {
        this.hematopoiese = hematopoiese;
    }

    public String getHematopoiese() {
        return hematopoiese;
    }
}
