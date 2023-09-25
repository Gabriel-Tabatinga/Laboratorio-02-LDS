package Model;

public abstract class Agente extends Usuario{

    String nome;

    Agente(String login, String senha, String nome) {
        super(login, senha);
        this.nome = nome;
    }

}
