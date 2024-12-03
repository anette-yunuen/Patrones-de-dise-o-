public class Te extends BebidaPreparada {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando el té...");
    }

    @Override
    protected void agregarCondimentos() {
        System.out.println("Agregando limón al té...");
    }
}
