package dados.enumeradores;

public enum Leucocitos {

    Monocito("Monócitos"),
    Eosinofilo("Eosinofilo"),
    Plasmocito("Plasmocito"),
    Eritroblasto("Eritroblasto"),
    Blasto("Blasto"),
    Basofilo("Basofilo"),
    LinfocitoTipico("LinfocitoTipico"),
    LinfocitoAtipico("LinfocitoAtipico"),
    Mielocito("Mielocito"),
    Bastonete("Bastonete"),
    Segmentado("Segmentado"),
    Promielocito("Promielocito"),
    Metamielocito("Metamielocito"),
    Multisegmentado("Multisegmentado");

    private String leucocitos;

    Leucocitos(String leucocitos) {
        this.leucocitos = leucocitos;
    }

    public String getLeucocitos() {
        return leucocitos;
    }
}
