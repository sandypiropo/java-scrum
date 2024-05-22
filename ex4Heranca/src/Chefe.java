public class Chefe extends Funcionario {
    private int bonusPercentual;
    private double salarioTotal;

    public Chefe(String nome, String funcao, float salario, int bonusPercentual) {
        super(nome, funcao, salario);
        this.bonusPercentual = bonusPercentual;
        calcularSalario();
    }

    public double calcularSalario() {
        return getSalario() + (getSalario() * this.bonusPercentual / 100);
    }

    @Override
    public double calcularLimiteEmprestimo() {
        double salarioTotal = calcularSalario();
        return (salarioTotal * 0.40) + ((salarioTotal - getSalario()) * 0.10);
    }
    @Override
    public void pedirEmprestimo(double valorEmprestimo) {
        double salarioTotal = calcularSalario();
        double limiteEmprestimo = calcularLimiteEmprestimo();
        if (valorEmprestimo <= limiteEmprestimo) {
            System.out.println("Emprestimo concedido!");
        } else {
            System.out.println("Emprestimo não concedido.");
        }
    }

    @Override
    public void promoverFuncionario(String funcao, double salario) {
        super.promoverFuncionario(funcao, salario);
        this.bonusPercentual += 1;
    }

    public int getBonusPercentual() {
        return bonusPercentual;
    }

    public double getSalarioTotal() {
        return calcularSalario();
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    @Override
    public String toString() {
        return super.toString() + "Chefe{" +
                "bonusPercentual=" + bonusPercentual +
                ", salarioTotal=" + calcularSalario() +
                '}';
    }
}
