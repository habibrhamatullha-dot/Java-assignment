class Square {
    double side;

    Square() {
    }

    void setSide(double side) {
        this.side = side;
    }

    double getSide() {
        return side;
    }

    double getArea() {
        return side * side;
    }
}