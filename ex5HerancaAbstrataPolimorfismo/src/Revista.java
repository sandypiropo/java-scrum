public class Revista extends Titulo{
    private String periodicidade;

    public Revista(String nome, String editora, double preco, String periodicidade) {
        super(nome, editora, preco);
        this.periodicidade = periodicidade;
    }

    @Override
    public double comprar(int quantidade) {
        double total = getPreco() * quantidade;
        return total * 0.98; // Desconto de 2%
    }
}
