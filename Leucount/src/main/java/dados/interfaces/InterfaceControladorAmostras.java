package dados.interfaces;

import dados.RepositoAmostras;
import negocio.usuarios.Usuario;

public interface InterfaceControladorAmostras {
    void Inserir(RepositoAmostras repositorio);

    void Deletar(Usuario usuario);

    void salvar() /* Responsavel por armazenar em um arquivo */;
}
