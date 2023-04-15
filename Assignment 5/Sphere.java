class Sphere extends Shape implements Volume {
    double radius;

    // Constructor to set radius
    public Sphere(double r) {
        radius = r;
    }

    // Method to calculate surface area of sphere
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    // Method to calculate volume of sphere
    public double calculateVolume() {
        return 4/3 * Math.PI * radius * radius * radius;
    }
}