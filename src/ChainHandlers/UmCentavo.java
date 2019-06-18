package ChainHandlers;

import Products.Produto;

public class UmCentavo extends Handler{
    private final static double VALOR = 0.01;


    public double getValor(){
        return VALOR;
    }

    @Override
    public String getNome() {
        return "Um Centavo";
    }
}
