public class Main {
    public static void main(String[] args) {
        // Construir una casa usando el Builder
        Casa casa = new Casa.Builder()
                .setVentanas(5)
                .setPuertas(2)
                .setTipoDeTecho("Teja")
                .build();

        // Mostrar detalles de la casa
        System.out.println(casa);
    }
}
