package Model;

public class Banco extends Agente{

    Banco(String login, String senha, String nome) {
        super(login, senha, nome);
    }

    public String gerarContratoCredito(){
        return new ContratoCredito().getNumContrato();
    }
    
}
