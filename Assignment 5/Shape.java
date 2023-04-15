abstract class Shape {
    // Non-abstract method to show shape
    public void showShape(String shape) {
        System.out.println("Calculating area and volume of " + shape);
    }

    // Abstract method to calculate shape area
    public abstract double calculateArea();

    // Abstract method to calculate shape perimeter
    public abstract double calculatePerimeter();
}
