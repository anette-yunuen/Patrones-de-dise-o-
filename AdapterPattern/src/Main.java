public class Main {
    public static void main(String[] args) {
        // Usar un cargador rápido
        Charger fastCharger = new FastCharger();
        fastCharger.charge();

        // Usar un cargador lento con el adaptador
        SlowChargingDevice slowChargingDevice = new SlowChargingDevice();
        Charger slowChargerAdapter = new SlowChargerAdapter(slowChargingDevice);
        slowChargerAdapter.charge();
    }
}
