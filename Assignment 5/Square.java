class Square extends Shape {
    double side;

    // Constructor to set side
    public Square(double s) {
        side = s;
    }

    // Method to calculate area of square
    public double calculateArea() {
        return side * side;
    }

    // Method to calculate perimeter of square
    public double calculatePerimeter() {
        return 4 * side;
    }
}