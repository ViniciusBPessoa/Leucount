package dados;

import dados.interfaces.InterfaceControladorChats;
import negocio.Chat;

import java.util.ArrayList;

public class ControladorChats implements InterfaceControladorChats {

    private ArrayList<Chat> chats;

    /* Revisar meios de salvamento emarquivo com prof */

    public ControladorChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public ControladorChats(){} /* carregar os arquivos .dat */

    @Override
    public void Inserir(Chat chat){
        this.chats.clear();
        this.chats.add(chat);
    }

    @Override
    public void Deletar(){  /* sem considerar nenhuma exeção */
        chats.clear();
    }

    @Override
    public void salvar(){} /* Responsavel por armazenar em um arquivo */

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }
}
