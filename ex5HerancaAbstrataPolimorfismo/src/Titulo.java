public abstract class Titulo {
    private String nome;
    private String editora;
    private double preco;

    public Titulo(String nome, String editora, double preco) {
        this.nome = nome;
        this.editora = editora;
        this.preco = preco;
    }

    public abstract double comprar(int quantidade);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

