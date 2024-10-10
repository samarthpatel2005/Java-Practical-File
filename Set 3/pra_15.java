import java.util.*;
class Area {
    private int length;
    private int breadth;

    Area(int l, int b) {
        length = l;
        breadth = b;
    }

    int returnArea() {
        return length * breadth;
    }
}
public class pra_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        Area rectangle = new Area(length, breadth);
        System.out.println("Area of the rectangle: " + rectangle.returnArea());
        System.out.println("23DCS089_Samarth Patel");
    }
}
