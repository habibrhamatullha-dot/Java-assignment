package task1;

public class Start {

    public static void main(String[] args) {

        AdvancedCalculator calc = new AdvancedCalculator();

        int a = 20;
        int b = 10;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiplication(a, b));
        System.out.println("Division: " + calc.division(a, b));
    }
}