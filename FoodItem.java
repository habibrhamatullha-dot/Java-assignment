public class FoodItem {
    protected double price;
    protected String name;

    // Default constructor
    public FoodItem() {
        price = 0;
        name = "Unknown";
    }

    // Parameterized constructor
    public FoodItem(double price, String name) {
        this.price = price;
        this.name = name;
    }

    // Method to show details
    public void showDetails() {
        System.out.println("Food Name: " + name);
        System.out.println("Price: " + price);
    }
}