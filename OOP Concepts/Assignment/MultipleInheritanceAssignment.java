// MultipleInheritance Assignment
package Assignment;
//  Shape interface
interface Shape {
    void calculateArea();
}

// Square class implementing Shape interface
class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of square is " + (side * side));
    }
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of circle is " + (PI * radius * radius));
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle is " + (length * width));
    }
}

public class MultipleInheritanceAssignment {

    public static void main(String[] args) {
        Shape square = new Square(10);
        square.calculateArea();

        Shape circle = new Circle(20);
        circle.calculateArea();

        Shape rectangle = new Rectangle(30, 40);
        rectangle.calculateArea();
    }
}
