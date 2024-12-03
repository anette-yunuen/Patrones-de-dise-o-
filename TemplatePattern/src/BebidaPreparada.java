public abstract class BebidaPreparada {
    // Método plantilla
    public final void preparar() {
        hervirAgua();
        prepararBebida();
        verterEnTaza();
        agregarCondimentos();
    }

    // Pasos comunes
    private void hervirAgua() {
        System.out.println("Hirviendo agua...");
    }

    private void verterEnTaza() {
        System.out.println("Vertiendo en la taza...");
    }

    // Métodos abstractos que las subclases implementarán
    protected abstract void prepararBebida();
    protected abstract void agregarCondimentos();
}
