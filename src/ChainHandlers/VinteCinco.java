package ChainHandlers;

import Products.Produto;

public class VinteCinco extends Handler{
    private final static double VALOR = 0.25;


    public double getValor(){
        return VALOR;
    }

    @Override
    public String getNome() {
        return "Vinte Cinco Centavos";
    }
}
