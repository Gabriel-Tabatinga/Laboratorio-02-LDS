package Controller;

import java.util.HashMap;

import Model.Aluguel;
import Model.Automovel;

public class PedidoControl {

    static HashMap<Integer, Aluguel> alugueis;
    static HashMap<String, Automovel> automoveis;

    static {
        alugueis = new HashMap<Integer, Aluguel>();
        automoveis = new HashMap<String, Automovel>();
    }

    public static boolean IntroduzirPedido(String matricula, String login, String empresa, String banco, String contrato){
        Aluguel a = new Aluguel(automoveis.get(matricula), login, empresa, banco, contrato);
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
