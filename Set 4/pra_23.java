
interface Shape {

    double area();

    default void displayDetails() {
        System.out.println("This is a shape.");
    }
}

class Circle implements Shape {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void displayDetails() {
        System.out.println("This is a circle with radius " + radius + " and color " + color);
    }
}

class Rectangle implements Shape {

    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double area() {
        return length * width;
    }

    public void displayDetails() {
        System.out.println("This is a rectangle with length " + length + ", width " + width + ", and color " + color);
    }
}

class Sign {

    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void displaySign() {
        shape.displayDetails();
        System.out.println("Text: " + text);
    }
}

public class pra_23 {

    public static void main(String[] args) {

        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");

        Sign circleSign = new Sign(circle, "Hello, World!");
        Sign rectangleSign = new Sign(rectangle, "Welcome to the Campus Center!");

        circleSign.displaySign();
        rectangleSign.displaySign();
        System.out.println("23DCS089_Samarth");
    }
}
