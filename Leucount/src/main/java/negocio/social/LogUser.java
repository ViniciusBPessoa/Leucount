package negocio.social;

public class LogUser {

    private static Usuario logUser;


    public static Usuario getLogUser() {
        return logUser;
    }

    public static void setLogUser(Usuario logUser) {
        LogUser.logUser = logUser;
    }
}
