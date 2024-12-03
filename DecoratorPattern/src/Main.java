public class Main {
    public static void main(String[] args) {
        // Crear un café básico
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

        // Agregar leche al café
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

        // Agregar chocolate al café con leche
        coffee = new ChocolateDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

        // Agregar crema batida
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());
    }
}
