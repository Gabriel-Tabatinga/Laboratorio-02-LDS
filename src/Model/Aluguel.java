package Model;

public class Aluguel {
    
    public Aluguel(String matricula, String login, String empresa) {
    }
    public boolean Persistir(){
        return true;
    }
    public boolean Deletar() {
        return true;
    }
    public boolean Update(String banco, String contrato) {
        return true;
    }
    public boolean Update(String banco, String contrato, String cliente) {
        return false;
    }
}
