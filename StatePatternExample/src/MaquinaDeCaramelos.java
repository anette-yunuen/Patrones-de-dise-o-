public class MaquinaDeCaramelos {
    private Estado estadoActual;
    private int caramelos;

    // Estados
    private Estado sinMoneda;
    private Estado conMoneda;
    private Estado sinCaramelos;

    public MaquinaDeCaramelos(int numeroDeCaramelos) {
        sinMoneda = new EstadoSinMoneda(this);
        conMoneda = new EstadoConMoneda(this);
        sinCaramelos = new EstadoSinCaramelos(this);

        caramelos = numeroDeCaramelos;
        estadoActual = (caramelos > 0) ? sinMoneda : sinCaramelos;
    }

    public void insertarMoneda() {
        estadoActual.insertarMoneda();
    }

    public void devolverMoneda() {
        estadoActual.devolverMoneda();
    }

    public void despacharCaramelo() {
        estadoActual.despacharCaramelo();
    }

    public void setEstado(Estado nuevoEstado) {
        estadoActual = nuevoEstado;
    }

    public Estado getEstadoSinMoneda() {
        return sinMoneda;
    }

    public Estado getEstadoConMoneda() {
        return conMoneda;
    }

    public Estado getEstadoSinCaramelos() {
        return sinCaramelos;
    }

    public int getCaramelos() {
        return caramelos;
    }

    public void reducirCaramelo() {
        if (caramelos > 0) {
            caramelos--;
        }
    }
}
