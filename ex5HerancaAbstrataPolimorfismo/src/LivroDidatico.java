public class LivroDidatico extends Titulo {
    private String area;

    public LivroDidatico(String nome, String editora, double preco, String area) {
        super(nome, editora, preco);
        this.area = area;
    }

    @Override
    public double comprar(int quantidade) {
        double total = getPreco() * quantidade;
        return total * 0.90;
    }
}
