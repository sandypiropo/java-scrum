public class Empregado {
    private String nome;
    private String cpf;
    private String funcao;
    private float salarioMensal;

    public Empregado(String nome, String cpf, String funcao, float salarioMensal) {

        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

}
