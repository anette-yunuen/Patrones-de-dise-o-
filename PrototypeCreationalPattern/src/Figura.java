public abstract class Figura implements Cloneable {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Figura clone() {
        try {
            return (Figura) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar la figura", e);
        }
    }

    @Override
    public String toString() {
        return "Figura [color=" + color + "]";
    }
}
