package ChainHandlers;

import Products.Produto;

public class Real extends Handler{
    private final static double VALOR = 1.00;


    public double getValor(){
        return VALOR;
    }

    @Override
    public String getNome() {
        return "Um Real";
    }
}
