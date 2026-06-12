class Rectangle {
    double length;
    double width;

    Rectangle() {
    }

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    double getArea() {
        return length * width;
    }
}