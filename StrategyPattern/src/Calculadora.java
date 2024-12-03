public class Calculadora {
    private Estrategia estrategia;

    public Calculadora(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(Estrategia nuevaEstrategia) {
        this.estrategia = nuevaEstrategia;
    }

    public int ejecutarOperacion(int a, int b) {
        return estrategia.ejecutar(a, b);
    }
}
