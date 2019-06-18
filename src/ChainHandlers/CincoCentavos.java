package ChainHandlers;

import Products.Produto;

public class CincoCentavos extends Handler{
    private final static double VALOR = 0.05;

    public double getValor(){
        return VALOR;
    }

    @Override
    public String getNome() {
        return "Cinco Centavos";
    }
}
