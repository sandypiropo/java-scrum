//Uma empresa deseja automatizar a sua folha de pagamento.
// A empresa tem o nome e o cnpj e uma coleção de empregados.
// Cada empregado tem nome, cpf, função e salário mensal.
// Escreva em java funcionalidades para :
// 1) Contratar um empregado,
// 2) Demitir um funcionário indicando o seu cpf,
// 3) Emitir o relatório da folha de pagamento mensal da seguinte.
// A folha é iniciada passando o mês e opcionalmente um percentual de bônus
// para o mês, exemplo (dezembro, 100). Neste caso o salário do funcionário receberá
// um acréscimo de 100%.  O relatório deve ter no cabeçalho os dados da empresa,
// mês e bônus. Segue então a lista dos funcionários com cpf, nome e salário total.

public class Main {
    public static void main(String[] args) {

    Empresa empresa = new Empresa("Empresa S", "123456789-0");
    empresa.contratarEmpregado(new Empregado("Sandy", "16161616161", "Prorgamador", 2000));

    empresa.emitirRelatoriaFolhaPagamento("Dezembro", 10);
    }
}