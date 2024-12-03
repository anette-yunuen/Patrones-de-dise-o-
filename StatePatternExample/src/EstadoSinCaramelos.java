public class EstadoSinCaramelos implements Estado {
    private MaquinaDeCaramelos maquina;

    public EstadoSinCaramelos(MaquinaDeCaramelos maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda() {
        System.out.println("No hay caramelos disponibles.");
    }

    @Override
    public void devolverMoneda() {
        System.out.println("No puedes devolver una moneda. La máquina está vacía.");
    }

    @Override
    public void despacharCaramelo() {
        System.out.println("No hay caramelos para dispensar.");
    }
}
