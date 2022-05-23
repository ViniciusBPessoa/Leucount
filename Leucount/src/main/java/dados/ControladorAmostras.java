package dados;

import dados.interfaces.InterfaceControladorAmostras;

import java.io.*;

public class ControladorAmostras implements InterfaceControladorAmostras, Serializable {

    private RepositorioAmostras amostras; /* Revisar meios de salvamento emarquivo com prof */

    private static ControladorAmostras instanciaamostra;

    public static ControladorAmostras getInstanciaamostra(){
        if (instanciaamostra != null){
            instanciaamostra = lerDoArquivo();
        }
        return instanciaamostra;
    }


    private static ControladorAmostras lerDoArquivo(){
        ControladorAmostras instancialocal;

        File in = new File("controladoramostras.dat");
        FileInputStream fis;
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
        return instancialocal;
    }
    @Override
    public void salvar(){
        if (instanciaamostra == null) {
            return;
        }
        File out = new File("controladoramostras.dat");
        FileOutputStream fos;
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
    }

    public RepositorioAmostras getAmostras() {
        return amostras;
    }

    public void setAmostras(RepositorioAmostras amostras) {
        this.amostras = amostras;
    }

    public static void setInstanciaamostra(ControladorAmostras instanciaamostra) {
        ControladorAmostras.instanciaamostra = instanciaamostra;
    }
}
