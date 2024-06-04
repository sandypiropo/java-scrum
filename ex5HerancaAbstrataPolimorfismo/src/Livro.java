public class Livro extends Titulo {
    private String autorPrincipal;
    private String resumo;

    public Livro(String nome, String editora, double preco, String autorPrincipal, String resumo) {
        super(nome, editora, preco);
        this.autorPrincipal = autorPrincipal;
        this.resumo = resumo;
    }

    @Override
    public double comprar(int quantidade) {
        double total = getPreco() * quantidade;
        return total * 0.97; // Desconto de 3%
    }


}
