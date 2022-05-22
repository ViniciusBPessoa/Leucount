package negocio.social;

import java.io.IOException;

public class LogUser {

    private Usuario logUser;

    private static LogUser instancia;

    public Usuario getLogUser() {
        return logUser;
    }

    public void setLogUser(Usuario logUser) {
        this.logUser = logUser;
    }

    public static LogUser getInstancia(Usuario user) throws IOException {
        if (instancia == null){
            instancia = new LogUser(user);
        }
        return instancia;
    }

    public LogUser(Usuario user) throws IOException {
        this.inicializador(user);
    }

    public void inicializador(Usuario user){
        this.logUser = user;

    }

    public static void setInstancia(LogUser instancia) {
        LogUser.instancia = instancia;
    }
}
