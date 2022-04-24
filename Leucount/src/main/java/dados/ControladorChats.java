package dados;

import negocio.Chat;

import java.util.ArrayList;

public class ControladorChats {

    private ArrayList<Chat> chats;

    /* Revisar meios de salvamento emarquivo com prof */

    public ControladorChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public ControladorChats(){} /* carregar os arquivos .dat */

    public void Inserir(Chat chat){
        this.chats.clear();
        this.chats.add(chat);
    }

    public void Deletar(){  /* sem considerar nenhuma exeção */
        chats.clear();
    }

    public void salvar(){} /* Responsavel por armazenar em um arquivo */

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }
}
