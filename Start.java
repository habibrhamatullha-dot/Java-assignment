public class Start {

    public static void main(String[] args) {

        Burger burger = new Burger(2, 250.0, "Beef Burger");
        Pizza pizza = new Pizza("Large", 500.0, "Cheese Pizza");

        System.out.println("Burger Details:");
        burger.showDetails();

        System.out.println("\nPizza Details:");
        pizza.showDetails();
    }
}