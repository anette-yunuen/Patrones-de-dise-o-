public class Casa {
    private int ventanas;
    private int puertas;
    private String tipoDeTecho;

    // Constructor privado
    private Casa(Builder builder) {
        this.ventanas = builder.ventanas;
        this.puertas = builder.puertas;
        this.tipoDeTecho = builder.tipoDeTecho;
    }

    // Getters opcionales
    public int getVentanas() {
        return ventanas;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getTipoDeTecho() {
        return tipoDeTecho;
    }

    // Implementación del Builder
    public static class Builder {
        private int ventanas;
        private int puertas;
        private String tipoDeTecho;

        public Builder setVentanas(int ventanas) {
            this.ventanas = ventanas;
            return this;
        }

        public Builder setPuertas(int puertas) {
            this.puertas = puertas;
            return this;
        }

        public Builder setTipoDeTecho(String tipoDeTecho) {
            this.tipoDeTecho = tipoDeTecho;
            return this;
        }

        public Casa build() {
            return new Casa(this);
        }
    }

    // Método toString para mostrar los detalles de la casa
    @Override
    public String toString() {
        return "Casa [ventanas=" + ventanas + ", puertas=" + puertas + ", tipoDeTecho=" + tipoDeTecho + "]";
    }
}
