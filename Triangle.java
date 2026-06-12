class Triangle {
    double height;
    double base;

    Triangle() {
    }

    void setHeight(double height) {
        this.height = height;
    }

    void setBase(double base) {
        this.base = base;
    }

    double getHeight() {
        return height;
    }

    double getBase() {
        return base;
    }

    double getArea() {
        return 0.5 * base * height;
    }
}