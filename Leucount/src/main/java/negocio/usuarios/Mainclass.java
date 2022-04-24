package negocio.usuarios;

import dados.enumeradores.Titulos;

import java.time.LocalDate;

public class Mainclass {

    public static void main(String[] args) {
        Profissional pro = new Profissional("Rony", "1523647", LocalDate.now(), Titulos.Gerente);

        String ti = pro.getTitulo();

        System.out.println(pro.getTitulo());

        Double it = 951651567156761655761657461456716546156.02;
        System.out.println(it);

    }

}
