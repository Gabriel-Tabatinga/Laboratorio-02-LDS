package Model;

import java.util.List;

public class Cliente extends Usuario{

    String rg;
    String cpf;
    String nome;
    String endereco;
    String profissao;
    List<Rendimento> rendimentos;
    String entidadesEmpregadoras;

    Cliente(String login, String senha, String rg, String cpf, String nome, String endereco, String profissao, List<Rendimento> rendimentos, String entidadesEmpregadoras) {
        super(login, senha);
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.profissao = profissao;
        this.rendimentos = rendimentos;
        this.entidadesEmpregadoras = entidadesEmpregadoras; 
    }
    
}
