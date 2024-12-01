package factory;

public class SamsungFactory implements DeviceFactory {
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}
