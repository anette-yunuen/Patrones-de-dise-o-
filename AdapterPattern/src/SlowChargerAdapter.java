public class SlowChargerAdapter implements Charger {
    private SlowChargingDevice slowChargingDevice;

    public SlowChargerAdapter(SlowChargingDevice slowChargingDevice) {
        this.slowChargingDevice = slowChargingDevice;
    }

    @Override
    public void charge() {
        slowChargingDevice.slowCharge();
    }
}
