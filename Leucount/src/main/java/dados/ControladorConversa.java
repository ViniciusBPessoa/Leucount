package dados;

import java.util.Map;

public class ControladorConversa {
    private Map<String, Repositoriocoversa> chats;

    public ControladorConversa(Map<String, Repositoriocoversa> chats) {
        this.chats = chats;
    }

    public void incerir(String codigo, Repositoriocoversa conversa){this.chats.put(codigo, conversa);}  /* Sem exeções */

    public void remover(String codigo){this.chats.remove(codigo);}

    public Repositoriocoversa buscar(String codigo){
        Repositoriocoversa chat = this.chats.get(codigo);
        return chat;
    }

    public Map<String, Repositoriocoversa> getChats() {
        return chats;
    }

    public void setChats(Map<String, Repositoriocoversa> chats) {
        this.chats = chats;
    }
}
