package Products;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome;
    }
}
