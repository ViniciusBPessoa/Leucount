package dados.aleatorio;
import java.util.Random;

public class CodeCriator {

    private static Random aleatorio = new Random();
    private static int valor;
    private static int vezes = 6;

    public static String aleatorio(){
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < vezes; i++) {
            string.append(aleatorio.nextInt(10));
        }

        String codigo = String.valueOf(string);

        return codigo;

    }

    public static Random getAleatorio() {
        return aleatorio;
    }

    public static void setAleatorio(Random aleatorio) {
        CodeCriator.aleatorio = aleatorio;
    }

    public static int getValor() {
        return valor;
    }

    public static void setValor(int valor) {
        CodeCriator.valor = valor;
    }
}
