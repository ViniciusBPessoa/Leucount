package dados;

import dados.interfaces.InterfaceControladorAmostras;
import negocio.social.Usuario;

import java.io.*;
import java.util.ArrayList;

public class ControladorAmostras implements InterfaceControladorAmostras {

    private ArrayList<RepositorioAmostras> amostras; /* Revisar meios de salvamento emarquivo com prof */

    private static ControladorAmostras instanciaamostra;

    public ControladorAmostras(ArrayList<RepositorioAmostras> amostras) {
        this.amostras = amostras;
    }

    public ControladorAmostras(){} /* carregar os arquivos .dat */

    @Override
    public void inserir(RepositorioAmostras repositorio){
        this.amostras.clear();
        this.amostras.add(repositorio);
    }

    @Override
    public void deletar(Usuario usuario){  /* sem considerar nenhuma exeção */
        this.amostras.clear();
    }

    private static void lerDoArquivo(){
        ControladorAmostras instancialocal = null;

        File in = new File("controladoramostrar.dat");
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{
            fis = new FileInputStream(in);
            ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            instancialocal = (ControladorAmostras) o;
        }catch (Exception e){
            instancialocal = new ControladorAmostras();
        }finally {
            if (ois != null){
                try{
                    ois.close();
                }catch (IOException ignored){}
            }
        }


    }

    @Override
    public void salvar(){
        if (instanciaamostra == null) {
            return;
        }
        File out = new File("controladoramostras.dat");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(out);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(instanciaamostra);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                }catch (IOException e){
                    /* Silent*/
                }
            }
        }

    } /* Responsavel por armazenar em um arquivo */

    public ArrayList<RepositorioAmostras> getAmostras() {
        return amostras;
    }

    public void setAmostras(ArrayList<RepositorioAmostras> amostras) {
        this.amostras = amostras;
    }

}
