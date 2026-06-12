public class Burger extends FoodItem {

    private int numberOfPatties;

    // Default constructor
    public Burger() {
        super();
        numberOfPatties = 1;
    }

    // Parameterized constructor
    public Burger(int numberOfPatties, double price, String name) {
        super(price, name);
        this.numberOfPatties = numberOfPatties;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Number of Patties: " + numberOfPatties);
    }
}