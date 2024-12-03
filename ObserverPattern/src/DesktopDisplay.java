public class DesktopDisplay implements Observer {
    private String name;

    public DesktopDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " received update: Temperature is " + temperature + "°C");
    }
}
