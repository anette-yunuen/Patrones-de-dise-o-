public class Main {
    public static void main(String[] args) {
        // Obtener la instancia del logger
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Obtener otra instancia del logger
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Verificar que ambas referencias apuntan a la misma instancia
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        }
    }
}
