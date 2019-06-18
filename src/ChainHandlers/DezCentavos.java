package ChainHandlers;

import Products.Produto;

public class DezCentavos extends Handler{
    private final static double VALOR = 0.10;


    public double getValor(){
        return VALOR;
    }

    @Override
    public String getNome() {
        return "Dez Centavos";
    }
}
