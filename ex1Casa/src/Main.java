public class Main {
    public static void main(String[] args) {
        // Criando uma casa com cor padrão branca
        Casa casa1 = new Casa("Rua A, 123", 3);

        // Criando uma casa com cor específica
        Casa casa2 = new Casa("Rua B, 456", "azul", 4);

        // Imprimindo os dados das casas
        System.out.println("Dados da Casa 1:");
        casa1.imprimirDados();
        System.out.println();

        System.out.println("Dados da Casa 2:");
        casa2.imprimirDados();
        System.out.println();

        // Pintando a Casa 1 de verde
        boolean sucessoPintura = casa1.pintarCasa("verde");
        if (sucessoPintura) {
            System.out.println("Casa 1 pintada com sucesso.");
        } else {
            System.out.println("A cor da Casa 1 já é verde.");
        }
        System.out.println();

        // Tentando pintar a Casa 2 de azul novamente (mesma cor)
        sucessoPintura = casa2.pintarCasa("azul");
        if (sucessoPintura) {
            System.out.println("Casa 2 pintada com sucesso.");
        } else {
            System.out.println("A cor da Casa 2 já é azul.");
        }
        System.out.println();

        // Imprimindo os dados atualizados das casas
        System.out.println("Dados atualizados da Casa 1:");
        casa1.imprimirDados();
        System.out.println();

        System.out.println("Dados atualizados da Casa 2:");
        casa2.imprimirDados();
    }
}
