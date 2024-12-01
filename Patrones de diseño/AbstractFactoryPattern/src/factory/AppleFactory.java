package factory;

public class AppleFactory implements DeviceFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}
