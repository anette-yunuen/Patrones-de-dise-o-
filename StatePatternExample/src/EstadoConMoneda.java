public class EstadoConMoneda implements Estado {
    private MaquinaDeCaramelos maquina;

    public EstadoConMoneda(MaquinaDeCaramelos maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda() {
        System.out.println("Ya hay una moneda insertada.");
    }

    @Override
    public void devolverMoneda() {
        System.out.println("Moneda devuelta.");
        maquina.setEstado(maquina.getEstadoSinMoneda());
    }

    @Override
    public void despacharCaramelo() {
        System.out.println("Dispensando un caramelo...");
        maquina.reducirCaramelo();
        if (maquina.getCaramelos() > 0) {
            maquina.setEstado(maquina.getEstadoSinMoneda());
        } else {
            System.out.println("Se acabaron los caramelos.");
            maquina.setEstado(maquina.getEstadoSinCaramelos());
        }
    }
}
