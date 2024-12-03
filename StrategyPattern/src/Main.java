public class Main {
    public static void main(String[] args) {
        // Crear estrategias
        Estrategia suma = new EstrategiaSuma();
        Estrategia resta = new EstrategiaResta();

        // Crear la calculadora
        Calculadora calculadora = new Calculadora(suma);

        // Usar la estrategia de suma
        System.out.println("Suma: " + calculadora.ejecutarOperacion(5, 3));

        // Cambiar a la estrategia de resta
        calculadora.setEstrategia(resta);
        System.out.println("Resta: " + calculadora.ejecutarOperacion(5, 3));
    }
}
