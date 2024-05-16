import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Empregado> empregados;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregados = new ArrayList<>();
    }

    public void contratarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void demitirFuncionarioPorCPF(String cpf) {
        empregados.removeIf(empregado -> empregado.getCpf().equals(cpf));
    }

    public void emitirRelatoriaFolhaPagamento(String mes, double bonus) {
        System.out.println("Relatório de Folha de Pagamento");
        System.out.println("Empresa: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Mês: " + mes);
        if (bonus > 0) {
            System.out.println("Bônus: " + bonus + "%");
        }
        System.out.println("Lista de empregados: ");
        for (Empregado empregado : empregados) {
            float salarioTotal = (float) (empregado.getSalarioMensal() + (empregado.getSalarioMensal() * bonus / 100));
            System.out.println("CPF: " + empregado.getCpf() + ", Nome: " + empregado.getNome()  + ", Salário Total: " + salarioTotal);
        }
    }


}
