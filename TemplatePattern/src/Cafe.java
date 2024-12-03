public class Cafe extends BebidaPreparada {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando el café...");
    }

    @Override
    protected void agregarCondimentos() {
        System.out.println("Agregando azúcar y leche al café...");
    }
}
