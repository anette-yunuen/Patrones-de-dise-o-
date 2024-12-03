public class Main {
    public static void main(String[] args) {
        // Crear una instancia de WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // Crear observadores
        Observer phone1 = new PhoneDisplay("Phone 1");
        Observer phone2 = new PhoneDisplay("Phone 2");
        Observer desktop = new DesktopDisplay("Desktop");

        // Registrar observadores en la estación meteorológica
        weatherStation.addObserver(phone1);
        weatherStation.addObserver(phone2);
        weatherStation.addObserver(desktop);

        // Actualizar la temperatura y notificar a los observadores
        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);

        // Eliminar un observador
        weatherStation.removeObserver(phone1);

        // Actualizar la temperatura nuevamente
        weatherStation.setTemperature(28.0f);
    }
}
