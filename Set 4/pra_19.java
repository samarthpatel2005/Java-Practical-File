
class Rectangle {

    int width;
    int height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    int getArea() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {

    Square(int s) {
        super(s, s);
    }
}

public class pra_19 {

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(5, 10);
        rectangles[1] = new Square(5);

        for (Rectangle r : rectangles) {
            System.out.println("Area: " + r.getArea());
            System.out.println("Perimeter: " + r.getPerimeter());
            System.out.println();
        }
        System.out.println("23DCS089_Samarth");
    }
}
