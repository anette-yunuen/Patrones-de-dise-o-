package factory;

public class ApplePhone implements Phone {
    @Override
    public void getDetails() {
        System.out.println("Apple Phone: iPhone 15");
    }
}
