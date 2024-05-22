public class Funcionario {
    private String nome;
    private String funcao;
    private double salario;

    public Funcionario(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public double calcularLimiteEmprestimo() {
        return this.salario * 0.30;
    }

    public void pedirEmprestimo(double valorEmprestimo) {
        double limiteEmprestimo = calcularLimiteEmprestimo();
        if (valorEmprestimo <= limiteEmprestimo) {
            System.out.println("Emprestimo concedido!");
        } else {
            System.out.println("Emprestimo não concedido.");
        }
    }
    public void promoverFuncionario(String funcao, double salario) {
        this.funcao = funcao;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }


    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
