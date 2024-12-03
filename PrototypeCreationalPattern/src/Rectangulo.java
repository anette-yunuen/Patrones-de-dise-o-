public class Rectangulo extends Figura {
    private int largo;
    private int ancho;

    public Rectangulo(int largo, int ancho, String color) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Rectángulo [largo=" + largo + ", ancho=" + ancho + ", color=" + getColor() + "]";
    }
}
