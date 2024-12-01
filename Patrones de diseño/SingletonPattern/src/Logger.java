public class Logger {
    // Variable estática que contiene la única instancia
    private static Logger instance;

    // Constructor privado para evitar la instanciación externa
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Método estático para obtener la instancia única
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Método para registrar mensajes
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
