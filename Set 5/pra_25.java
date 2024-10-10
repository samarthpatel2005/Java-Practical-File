import java.lang.*;
public class pra_25 {
    public static void main(String[] args) {
        try {

            int[] numbers = {1, 2, 3};

            System.out.println("Accessing element at index 5: " + numbers[1]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
      
            System.out.println("Exception caught: Array index is out of bounds.");
        }
        System.out.println("23DCS089_Samarth");
    }
}
