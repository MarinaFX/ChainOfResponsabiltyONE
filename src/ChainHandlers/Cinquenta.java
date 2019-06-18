package ChainHandlers;

import Products.Produto;

public class Cinquenta extends Handler{
    private final static double VALOR = 0.50;


    public double getValor(){
        return VALOR;
    }

    @Override
    public String getNome() {
        return "Cinquenta Centavos";
    }
}
