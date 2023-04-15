class Cylinder extends Shape implements Volume {
    double radius, height;

    // Constructor to set radius and height
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    // Method to calculate surface area of cylinder
    public double calculateArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    // Method to calculate volume of cylinder
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}