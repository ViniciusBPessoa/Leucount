package dados;

import java.util.Map;


public class Hemograma {

    private Map<String, Integer> inteiros;
    private Map<String, Double> decimais;
    private Map<String, Long> longs;

    /* Contrutor a definir */

    public int switchInt(int valor){return valor;} /* switch case a ser construido */

    public double switchDouble(double valor){return valor;} /* switch case a ser construido */

    public long switchLong(long valor){return valor;} /* switch case a ser construido */

    public Map<String, Integer> getInteiros() {
        return inteiros;
    }

    public void setInteiros(Map<String, Integer> inteiros) {
        this.inteiros = inteiros;
    }

    public Map<String, Double> getDecimais() {
        return decimais;
    }

    public void setDecimais(Map<String, Double> decimais) {
        this.decimais = decimais;
    }

    public Map<String, Long> getLongs() {
        return longs;
    }

    public void setLongs(Map<String, Long> longs) {
        this.longs = longs;
    }

}