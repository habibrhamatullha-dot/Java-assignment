public class Start {
    public static void main(String[] args) {

        // Coordinate objects
        Coordinate c1 = new Coordinate();
        c1.setLongitude(90.41);
        c1.setLatitude(23.81);

        Coordinate c2 = new Coordinate();
        c2.setLongitude(88.36);
        c2.setLatitude(22.57);

        // Schedule objects
        Schedule s1 = new Schedule();
        s1.setHour(10);
        s1.setMinute(30);

        Schedule s2 = new Schedule();
        s2.setHour(12);
        s2.setMinute(15);

        // Airport objects
        Airport a1 = new Airport();
        a1.setName("Dhaka Airport");
        a1.setLocation(c1);

        Airport a2 = new Airport();
        a2.setName("Kolkata Airport");
        a2.setLocation(c2);

        // Flight object
        Flight f = new Flight();
        f.setFlightId("BG101");
        f.setCapacity(180);
        f.setDepartureFrom(a1);
        f.setDepartureTime(s1);
        f.setFlyingTo(a2);
        f.setArrivalTime(s2);

        // Display information
        System.out.println("Flight ID: " + f.getFlightId());
        System.out.println("Capacity: " + f.getCapacity());

        System.out.println("Departure From: " + f.getDepartureFrom().getName());
        System.out.println("Departure Time: " +
                f.getDepartureTime().getHour() + ":" +
                f.getDepartureTime().getMinute());

        System.out.println("Flying To: " + f.getFlyingTo().getName());
        System.out.println("Arrival Time: " +
                f.getArrivalTime().getHour() + ":" +
                f.getArrivalTime().getMinute());
    }
}