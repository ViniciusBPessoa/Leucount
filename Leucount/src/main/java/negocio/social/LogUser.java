package negocio.social;

import java.io.IOException;

public class LogUser {

    private Usuario logUser;

    private static LogUser instancia;
    private static LogUser LogInstancia;

    public static LogUser getLogInstancia() {
        if (LogInstancia != null)
            return LogInstancia;
        else {
            return null;
        }

    }

    public Usuario getLogUser() {
        return logUser;
    }

    public static LogUser getInstancia(Usuario user) throws IOException {
        instancia = new LogUser(user);
        LogInstancia = instancia;
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
    public void setLogUser(Usuario logUser) {
        this.logUser = logUser;
    }
}
