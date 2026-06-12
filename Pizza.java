public class Pizza extends FoodItem {

    private String size;

    // Default constructor
    public Pizza() {
        super();
        size = "Medium";
    }

    // Parameterized constructor
    public Pizza(String size, double price, String name) {
        super(price, name);
        this.size = size;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Size: " + size);
    }
}