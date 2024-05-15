// Criar uma Classe para uma classe que represente uma casa.
// A casa é descrita pelo seu endereço, cor e quantidade de quartos.
// Quando criamos uma casa, não é necessário passar o parâmetro
// entrada cor quando esta é branca. A casa pode ser pintada de uma
// outra cor (mudar de cor, ex azul, verde, etc) e, neste caso
// deve ser testada se a cor é diferente da  original (retornar true ou false).
// Da mesma forma que na hora da criação de instancias, quando a nova cor
// é branca, não é necessário passar parametros.
// Além disto desejamos imprimir os dados da casa ou de qualquer outra casa.
public class Casa {
    private String endereco;
    private String cor;
    private int quantidadeQuartos;

    // Construtor padrão para casa branca
    public Casa(String endereco, int quantidadeQuartos) {
        this.endereco = endereco;
        this.cor = "branca"; // Cor padrão
        this.quantidadeQuartos = quantidadeQuartos;
    }

    // Construtor para casa com cor específica
    public Casa(String endereco, String cor, int quantidadeQuartos) {
        this.endereco = endereco;
        this.cor = cor.equalsIgnoreCase("branca") ? "branca" : cor; // Se cor for "branca", mantém cor padrão
        this.quantidadeQuartos = quantidadeQuartos;
    }

    // Método para pintar a casa
    public boolean pintarCasa(String novaCor) {
        if (!cor.equalsIgnoreCase(novaCor)) {
            cor = novaCor;
            return true; // Casa foi pintada com sucesso
        } else {
            return false; // A cor nova é igual à cor atual
        }
    }

    // Método para imprimir os dados da casa
    public void imprimirDados() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Cor: " + cor);
        System.out.println("Quantidade de Quartos: " + quantidadeQuartos);
    }
}
