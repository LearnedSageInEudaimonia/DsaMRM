
/*
Define a Polygon interface that has methods area() and perimeter(). Then implement classes for Triangle, Quadrilateral, Pentagon, Hexagon, and Octagon,
which implement this interface, with the obvious meanings for the area() and
perimeter() methods. Also implement classes, IsoscelesTriangle, EquilateralTriangle, Rectangle, and Square, which have the appropriate inheritance relationships. Finally, write a simple user interface, which allows users to create
polygons of the various types, input their geometric dimensions, and then output their area and perimeter. For extra effort, allow users to input polygons by
specifying their vertex coordinates and be able to test if two such polygons are
similar.
 */
import java.util.*;
interface Polygon{
    double area();
    double perimeter();

}
class Triangle implements Polygon{

    double base,height, side1,side2, side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double area(){
        double s = perimeter()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    public double perimeter(){
        return side1+side2+side3;

    }

}

class Quadrilateral implements Polygon{
    double length,breadth;

    public Quadrilateral(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area(){
        return length* breadth;
    }
    @Override
    public double perimeter(){
        return 2*(length+ breadth);
    }

}

class Pentagon implements Polygon{
    double side;

    public Pentagon(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side) / 4;
    }
    @Override
    public double perimeter(){
        return 5*side;
    }
}
class Hexagon implements Polygon{
    double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 6*side;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }
}
class Octagon implements Polygon{
    double side;

    public Octagon(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 2 * (1 + Math.sqrt(2)) * side * side;
    }

    @Override
    public double perimeter() {
        return 8*side;
    }
}

class IsocelsesTriangle extends Triangle{
    public IsocelsesTriangle(double base, double height, double side) {
        super(base, height, side, side, base);
    }
}
class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(double side) {
        super(side,side,side,side,side);
    }
}
class Square extends Quadrilateral{
    public Square(double side) {
        super(side,side);
    }
}
class Rectangle extends Quadrilateral{
    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }
}
public class PolygonDecider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPolygon Options:");
            System.out.println("1. Triangle");
            System.out.println("2. Quadrilateral");
            System.out.println("3. Pentagon");
            System.out.println("4. Hexagon");
            System.out.println("5. Octagon");
            System.out.println("6. Exit");
            System.out.print("Choose a polygon: ");
            int choice = scanner.nextInt();

            if (choice == 6) break;

            Polygon polygon = null;

            switch (choice) {
                case 1:
                    System.out.println("\nEnter base, height, and three sides:");
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double side3 = scanner.nextDouble();
                    polygon = new Triangle(base, height, side1, side2, side3);
                    break;
                case 2:
                    System.out.println("\nEnter length and breadth:");
                    double length = scanner.nextDouble();
                    double breadth = scanner.nextDouble();
                    polygon = new Rectangle(length, breadth);
                    break;
                case 3:
                    System.out.println("\nEnter side length:");
                    double pentagonSide = scanner.nextDouble();
                    polygon = new Pentagon(pentagonSide);
                    break;
                case 4:
                    System.out.println("\nEnter side length:");
                    double hexagonSide = scanner.nextDouble();
                    polygon = new Hexagon(hexagonSide);
                    break;
                case 5:
                    System.out.println("\nEnter side length:");
                    double octagonSide = scanner.nextDouble();
                    polygon = new Octagon(octagonSide);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            if (polygon != null) {
                System.out.println("Area: " + polygon.area());
                System.out.println("Perimeter: " + polygon.perimeter());
            }
        }
    }
}
