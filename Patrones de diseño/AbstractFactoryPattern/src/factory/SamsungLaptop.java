package factory;

public class SamsungLaptop implements Laptop {
    @Override
    public void getDetails() {
        System.out.println("Samsung Laptop: Galaxy Book");
    }
}
