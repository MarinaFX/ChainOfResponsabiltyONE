package ChainHandlers;

import Products.Produto;

public abstract class Handler {
    private Handler nextInChain;
    private Produto produto;
    private double saldo;

    public void add(Produto produto){
        this.produto = produto;
    }

    public abstract String getNome();

    public void add(Handler next){
        if (nextInChain == null){
            nextInChain = next;
        }
        else{
            nextInChain.add(next);
        }

    }

    public void resetChain(Handler root){
        if (nextInChain == null){
            nextInChain = root;
        }
        else{
            nextInChain.resetChain(root);
        }
    }

    public void comprar(double moedas){
        saldo = moedas;
        handle(produto);
    }

    public void handle(Produto p){
        if (p.getValor() > saldo){
            saldo-= p.getValor();
            nextInChain.handle(p);
        }
        else{
            if (p.getValor() < saldo){
                double sobra = saldo - p.getValor();
                saldo -= p.getValor();
                System.out.println("Retire o produto: " + produto.toString() +  " e seu troco: " + saldo);
            } else {
                if (saldo < 0){
                    System.out.println("Saldo insuficiente");
                }
                else {
                    System.out.println("Retire o produto: " + produto.toString());
                }
            }
        }
    }
}
