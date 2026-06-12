public class Start {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);
        System.out.println("Rectangle Length: " + r.getLength());
        System.out.println("Rectangle Width: " + r.getWidth());
        System.out.println("Rectangle Area: " + r.getArea());

        System.out.println();

        Triangle t = new Triangle();
        t.setBase(6);
        t.setHeight(4);
        System.out.println("Triangle Base: " + t.getBase());
        System.out.println("Triangle Height: " + t.getHeight());
        System.out.println("Triangle Area: " + t.getArea());

        System.out.println();

        Circle c = new Circle();
        c.setRadius(7);
        System.out.println("Circle Radius: " + c.getRadius());
        System.out.println("Circle Area: " + c.getArea());

        System.out.println();

        Square s = new Square();
        s.setSide(8);
        System.out.println("Square Side: " + s.getSide());
        System.out.println("Square Area: " + s.getArea());
    }
}