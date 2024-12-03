public class EstadoSinMoneda implements Estado {
    private MaquinaDeCaramelos maquina;

    public EstadoSinMoneda(MaquinaDeCaramelos maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda() {
        System.out.println("Moneda insertada. Puedes obtener un caramelo.");
        maquina.setEstado(maquina.getEstadoConMoneda());
    }

    @Override
    public void devolverMoneda() {
        System.out.println("No has insertado ninguna moneda.");
    }

    @Override
    public void despacharCaramelo() {
        System.out.println("Primero necesitas insertar una moneda.");
    }
}
