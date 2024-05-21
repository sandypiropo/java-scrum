public class TV {
    private String marca;
    private boolean ligada;
    private String canalDoMomento;
    private TVSmart tvSmart;

    public TV(String marca, String canalDoMomento) {
        this.marca = marca;
        this.ligada = false;
        this.canalDoMomento = canalDoMomento;
    }

    public TV(String marca, String canalDoMomento, TVSmart tvSmart) {
        this.marca = marca;
        this.ligada = false;
        this.canalDoMomento = canalDoMomento;
        this.tvSmart = tvSmart;
    }

    ligarAparelho() {

    }

    ligarPeloControle() {

    }
}
