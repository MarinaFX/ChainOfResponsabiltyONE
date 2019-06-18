package Application;

import ChainHandlers.*;
import Products.Chocolate;
import Products.Produto;
import Products.Refrigerante;
import Products.Salgadinho;

public class App {
    public static void main(String[] args) {
        Produto produtos[] = {new Salgadinho("Ruffles"), new Salgadinho("Cebolitos"), new Chocolate("Laka-oreo"), new Refrigerante("Coca-Cola"), new Salgadinho("Pepsi")};
        Produto p1 = new Salgadinho("Ruffles");

        System.out.println("Bem vindo ao cassaniq... digo máquina de comidas");
        Handler rootChain = new UmCentavo();
        rootChain.add(produtos[0]);
        rootChain.add(new CincoCentavos());
        rootChain.add(new DezCentavos());
        rootChain.add(new VinteCinco());
        rootChain.add(new Cinquenta());
        rootChain.add(new Real());
        rootChain.resetChain(rootChain);

        produtos[0].setPreco(2.50);
        produtos[1].setPreco(3.70);
        produtos[2].setPreco(4.20);
        produtos[3].setPreco(5.25);
        produtos[4].setPreco(6.99);

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Teste #" + i);
            rootChain.comprar(10);
            System.out.println();
            if (!(i == 4))
            rootChain.add(produtos[i+1]);
        }
    }
}
