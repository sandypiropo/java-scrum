import java.util.ArrayList;

public class Empresa {
    private int cnpj;
    private String razaoSocial;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(int cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void imprimirListagem() {
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + ", Salário: " + f.getSalario() + ", Limite de Empréstimo: " + f.calcularLimiteEmprestimo());
        }
    }

}
