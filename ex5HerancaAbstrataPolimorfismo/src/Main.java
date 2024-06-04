public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria("Livraria Bahia");

        Livro livro = new Livro("Percy Jackson", "ABC", 40.00, "Rick", "Ficção");
        Revista revista = new Revista("Magazine", "TR", 12.50, "Mensal");
        LivroDidatico livroDidatico = new LivroDidatico("Matematica básica", "Mat", 120.00, "Matematica");

        livraria.comprarTitulo(livro, 2);
        livraria.comprarTitulo(livroDidatico, 3);
        livraria.comprarTitulo(revista, 1);

    }
}