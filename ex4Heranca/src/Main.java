public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(123456789, "Minha Empresa");

        Funcionario f1 = new Funcionario("João", "Analista", 3000);
        Chefe c1 = new Chefe("Maria", "Gerente", 5000, 10);

        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(c1);

        empresa.imprimirListagem();

        f1.pedirEmprestimo(800); // Emprestimo concedido!
        c1.pedirEmprestimo(3000); // Emprestimo não concedido.

        f1.promoverFuncionario("Senior Analista", 4000);
        c1.promoverFuncionario("Senior Gerente", 6000);

        empresa.imprimirListagem();
    }
}