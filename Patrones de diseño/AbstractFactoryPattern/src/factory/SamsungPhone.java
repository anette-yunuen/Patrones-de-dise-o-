package factory;

public class SamsungPhone implements Phone {
    @Override
    public void getDetails() {
        System.out.println("Samsung Phone: Galaxy S23");
    }
}
