class Rectangle extends Shape {
    double length, breadth;

    // Constructor to set length and breadth
    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area of rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter of rectangle
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

