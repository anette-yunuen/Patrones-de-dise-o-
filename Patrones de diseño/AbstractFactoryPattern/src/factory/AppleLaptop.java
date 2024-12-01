package factory;

public class AppleLaptop implements Laptop {
    @Override
    public void getDetails() {
        System.out.println("Apple Laptop: MacBook Pro");
    }
}
