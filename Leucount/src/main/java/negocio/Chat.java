package negocio;

import javafx.util.Pair;

import java.util.ArrayList;

public class Chat {

    private ArrayList<Pair<String, String>> chats;
    private String idChat;
    private String tipoChat;

    public Chat(String idChat, String tipoChat) {
        this.idChat = idChat;
        this.tipoChat = tipoChat;
    }

    public Chat(String idChat) {
        this.idChat = idChat;
        this.tipoChat = "Pericles";
    }

    public void incerirMSG(String usuario, String msg){
        Pair<String, String> novaMSG = new Pair<>(usuario, msg);
        this.chats.add(novaMSG);
    }

    public ArrayList<Pair<String, String>> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Pair<String, String>> chats) {
        this.chats = chats;
    }

    public String getIdChat() {
        return idChat;
    }

    public void setIdChat(String idChat) {
        this.idChat = idChat;
    }

    public String getTipoChat() {
        return tipoChat;
    }

    public void setTipoChat(String tipoChat) {
        this.tipoChat = tipoChat;
    }
}
