public interface Dispositivo {
    String marca;
    boolean status = false;

    public boolean ligaEdesliga(boolean estado);
}
