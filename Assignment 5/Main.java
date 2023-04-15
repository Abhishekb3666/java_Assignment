import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Pyramid\n7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.showShape("circle");
                    System.out.println("Area of circle: " + circle.calculateArea());
                    System.out.println("Perimeter of circle: " + circle.calculatePerimeter());
                    break;

                case 2:
                    System.out.print("Enter length of rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth of rectangle: ");
                    double breadth = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(length, breadth);
                    rectangle.showShape("rectangle");
                    System.out.println("Area of rectangle: " + rectangle.calculateArea());
                    System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
                    break;

                case 3:
                    System.out.print("Enter side of square: ");
                    double side = sc.nextDouble();
                    Square square = new Square(side);
                    square.showShape("square");
                    System.out.println("Area of square: " + square.calculateArea());
                    System.out.println("Perimeter of square: " + square.calculatePerimeter());
                    break;

                case 4:
                    System.out.print("Enter radius of sphere: ");
                    double sphereRadius = sc.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    sphere.showShape("sphere");
                    System.out.println("Surface area of sphere: " + sphere.calculateArea());
                    System.out.println("Volume of sphere: " + sphere.calculateVolume());
                    break;

                case 5:
                    System.out.print("Enter radius of cylinder: ");
                    double cylinderRadius = sc.nextDouble();
                    System.out.print("Enter height of cylinder: ");
                    double cylinderHeight = sc.nextDouble();
                    Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                    cylinder.showShape("cylinder");
                    System.out.println("Surface area of cylinder: " + cylinder.calculateArea());
                    System.out.println("Volume of cylinder: " + cylinder.calculateVolume());
                    break;

                case 6:
                    System.out.print("Enter length of base of pyramid: ");
                    double pyramidLength = sc.nextDouble();
                    System.out.print("Enter width of base of pyramid: ");
                    double pyramidWidth = sc.nextDouble();
                    System.out.print("Enter height of pyramid: ");
                    double pyramidHeight = sc.nextDouble();
                    Pyramid pyramid = new Pyramid(pyramidLength, pyramidWidth, pyramidHeight);
                    pyramid.showShape("pyramid");
                    System.out.println("Surface area of pyramid: " + pyramid.calculateArea());
                    System.out.println("Volume of pyramid: " + pyramid.calculateVolume());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println();
        }

        sc.close();
    }
}
