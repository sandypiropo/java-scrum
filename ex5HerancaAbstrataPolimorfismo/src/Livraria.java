public class Livraria {
    private String nome;

    public Livraria(String nome) {
        this.nome = nome;
    }

    public void comprarTitulo(Titulo titulo, int quantidade) {
        double precoTotal = titulo.comprar(quantidade);
        gerarNotaFiscal(titulo, quantidade, precoTotal);
    }

    public void gerarNotaFiscal(Titulo titulo, int quantidade, double precoTotal) {
        System.out.println("Nome da Livraria: " + nome);
        System.out.println("Nome do Título: " + titulo.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço Total: R$" + precoTotal);
        System.out.println("");
    }
}
