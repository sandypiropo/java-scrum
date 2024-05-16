public class Main {
    public static void main(String[] args) {

    Empresa empresa = new Empresa("Empresa S", "123456789-0");
    empresa.contratarEmpregado(new Empregado("Sandy", "16161616161", "Prorgamador", 2000));

    empresa.emitirRelatoriaFolhaPagamento("Dezembro", 10);
    }
}