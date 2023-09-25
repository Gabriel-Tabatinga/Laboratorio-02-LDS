package Model;

import java.util.Random;

public class Aluguel {

    Integer numero;
    String cliente;
    String empresa;
    String banco;
    String contratoCredito;
    Automovel automovel;
    
    public Aluguel(Automovel automovel, String cliente, String empresa, String banco, String contratoCredito) {
        Random gerador = new Random();
        this.numero = gerador.nextInt();
        this.cliente = cliente;
        this.empresa = empresa;
        this.banco = banco;
        this.contratoCredito = contratoCredito;
        this.automovel = automovel;
    }

    public boolean Update(String banco, String contrato) {
        this.banco = banco;
        this.contratoCredito = contrato;
        return true;
    }
    public boolean Update(String banco, String contrato, String cliente) {
        this.banco = banco;
        this.contratoCredito = contrato;
        this.cliente = cliente;
        return false;
    }
    public boolean Persistir(){
        return true;
    }
    public boolean Deletar() {
        return true;
    }
}
