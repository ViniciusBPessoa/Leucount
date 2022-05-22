package dados;

import dados.interfaces.InterfaceControladorUsuarios;

import java.io.*;

public class ControladorUsuarios implements InterfaceControladorUsuarios, Serializable {

    private RepositorioUsuarios usuarios; /* Revisar meios de salvamento em arquivo com prof */

    private static ControladorUsuarios instancia;

    private ControladorUsuarios(){
        this.usuarios = new RepositorioUsuarios();
    }

    public static ControladorUsuarios getInstancea() {
        if (instancia == null) {
            instancia = lerDoArquivo();
        }
        return instancia;
    }

    private static ControladorUsuarios lerDoArquivo() {
        ControladorUsuarios instancialocal;

        File in = new File("controladoruser.dat");
        FileInputStream fis;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(in);
            ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            instancialocal = (ControladorUsuarios) o;
        }catch (Exception e){
            instancialocal = new ControladorUsuarios();

        }finally {
            if (ois != null){
                try {
                    ois.close();
                }catch (IOException ignored){}
            }
        }

        return instancialocal;
    }

    @Override
    public void salvar() {
        if (instancia == null) {
            return;
        }
        File out = new File("controladoruser.dat");
        FileOutputStream fos;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(out);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(instancia);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    /* Silent */}
            }
        }
    }

    public RepositorioUsuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(RepositorioUsuarios usuarios) {
        this.usuarios = usuarios;
    }

    public static void setInstancia(ControladorUsuarios instancia) {
        ControladorUsuarios.instancia = instancia;
    }

}
