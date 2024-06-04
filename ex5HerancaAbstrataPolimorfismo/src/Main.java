//Uma livraria precisa de um sistema para cadastrar seus títulos. A livraria trabalha com livros e revistas.
// Sabe-se que todo livro possui um nome, autor principal, editora, resumo e preço.
// Existem livros que são didáticos. Para estes também é registrada a sua área (ex. informática, história, geografia, etc).
// As revistas possuem um nome, editora, preço e periodicidade.
// Nesta Livraria deve-se implementar um método comprar utilizando o conceito de polimorfismo.
// Na nota fiscal deve aparecer o nome da livraria, o nome do Titulo, a quantidade,
// o preço total que deve ter um desconto de 3% de para livro, 10% para Livro didático e 2% para revista
public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria("Livraria Bahia");

        Livro livro = new Livro("Percy Jackson", "ABC", 40.00, "Rick", "Ficção");
        Revista revista = new Revista("Magazine", "TR", 12.50, "Mensal");
        LivroDidatico livroDidatico = new LivroDidatico("Matematica básica", "Mat", 120.00, "Matematica");

        livraria.comprarTitulo(livro, 2);
        livraria.comprarTitulo(livroDidatico, 3);
        livraria.comprarTitulo(revista, 1);

        // SAIDA:
        //Nome da Livraria: Livraria Bahia
        //Nome do Título: Percy Jackson
        //Quantidade: 2
        //Preço Total: R$77.6
        //
        //Nome da Livraria: Livraria Bahia
        //Nome do Título: Matematica básica
        //Quantidade: 3
        //Preço Total: R$324.0
        //
        //Nome da Livraria: Livraria Bahia
        //Nome do Título: Magazine
        //Quantidade: 1
        //Preço Total: R$12.25
    }
}