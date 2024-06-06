public class Camera implements Dispositivo{
    private String resoulucao;

    public Camera(String resoulucao) {
        this.resoulucao = resoulucao;
    }

    public void iniciarRemotamente(){

    }
    @Override
    public boolean ligaEdesliga(boolean estado) {
        return false;
    }
}
