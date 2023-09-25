package Model;

public abstract class Usuario {
    String login;
    String senha;
    
    Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public boolean logar(String login, String senha){
        if(this.login.equals(login) && this.senha.equals(senha)){
            return true;
        }
        return false;
    }
}
