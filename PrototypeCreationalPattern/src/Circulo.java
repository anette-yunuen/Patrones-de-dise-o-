public class Circulo extends Figura {
    private int radio;

    public Circulo(int radio, String color) {
        super(color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Círculo [radio=" + radio + ", color=" + getColor() + "]";
    }
}
