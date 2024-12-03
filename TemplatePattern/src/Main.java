public class Main {
    public static void main(String[] args) {
        BebidaPreparada cafe = new Cafe();
        BebidaPreparada te = new Te();

        System.out.println("Preparando café...");
        cafe.preparar();

        System.out.println("\nPreparando té...");
        te.preparar();
    }
}
