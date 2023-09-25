package Controller;

import java.util.HashMap;

import Model.Aluguel;

public class PedidoControl {

    HashMap<Integer, Aluguel> alugueis;

    PedidoControl() {
        this.alugueis = new HashMap<Integer, Aluguel>();
    }

    public static boolean IntroduzirPedido(String matricula, String login, String empresa){
        Aluguel a = new Aluguel(matricula, login, empresa);
        return a.Persistir();
    }
    public boolean ModificarPedidoCliente(String numero, String banco, String contrato){
        Aluguel a = alugueis.get(Integer.parseInt(numero));
        return a.Update(banco, contrato);
    }
    public boolean ModificarPedidoAgente(String numero, String banco, String contrato, String cliente){
        Aluguel a = alugueis.get(Integer.parseInt(numero));
        return a.Update(banco, contrato, cliente);
    }

    public Aluguel ConsultarPedido(String numero){
        return alugueis.get(Integer.parseInt(numero));
    }
    public boolean CancelarPedido(String numero){
        return alugueis.get(Integer.parseInt(numero)).Deletar();
    }
}
