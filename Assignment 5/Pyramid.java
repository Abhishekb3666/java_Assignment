public class Pyramid extends Shape implements Volume {
    private double length;
    private double width;
    private double height;

    public Pyramid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double slantHeight = Math.sqrt(Math.pow(length/2, 2) + Math.pow(height, 2));
        double baseArea = length * width;
        double lateralArea = length * slantHeight / 2 + width * slantHeight / 2;
        double totalArea = baseArea + lateralArea;
        return totalArea;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        double baseArea = length * width;
        double volume = baseArea * height / 3;
        return volume;
    }

    @Override
    public void showShape(String shape) {
        System.out.println("Selected shape: " + shape);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}
