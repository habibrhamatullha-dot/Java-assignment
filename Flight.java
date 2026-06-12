class Flight {
    String flightId;
    int capacity;
    Airport departureFrom;
    Schedule departureTime;
    Airport flyingTo;
    Schedule arrivalTime;

    void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setDepartureFrom(Airport departureFrom) {
        this.departureFrom = departureFrom;
    }

    void setDepartureTime(Schedule departureTime) {
        this.departureTime = departureTime;
    }

    void setFlyingTo(Airport flyingTo) {
        this.flyingTo = flyingTo;
    }

    void setArrivalTime(Schedule arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    String getFlightId() {
        return flightId;
    }

    int getCapacity() {
        return capacity;
    }

    Airport getDepartureFrom() {
        return departureFrom;
    }

    Schedule getDepartureTime() {
        return departureTime;
    }

    Airport getFlyingTo() {
        return flyingTo;
    }

    Schedule getArrivalTime() {
        return arrivalTime;
    }
}