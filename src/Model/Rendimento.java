package Model;

import java.math.BigDecimal;

public class Rendimento {
    BigDecimal valor;
    String tipo;

    Rendimento(BigDecimal valor, String tipo){
        this.valor = valor;
        this.tipo = tipo;
    }
}
