//Implementar uma solução em java para o seguinte contexto abaixo
// Uma Tv é caracterizada pela marca, se é smart, se está ligada (power),
// o canal do momento e a senha do wifi se for smart.
// Uma TV comum é instanciada passando a marca e para a smart, uma senha padrão.
// (Sempre) O canal é 100 e desligada. Existem vários modos de ligar a TV.
// Pelo próprio aparelho (sem parâmetros), pelo controle remoto (passa o canal )
// e se for smart passamos  a senha. Retorna-se true ou false.
// Uma Tv  comum não pode ser ligada como uma smart.

public class Main {
    public static void main(String[] args) {

    TV tv1 = new TV("LG","Globo");
        System.out.println(tv1);
    }
}
