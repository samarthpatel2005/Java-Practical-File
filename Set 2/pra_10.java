import java.util.Arrays;

public class pra_10 {
    public static void main(String[] args) {
        String str = "Hello World!";
        
        int length = str.length();
        System.out.println("Length of the string: " + length);

        String lowercase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercase);
        
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercase);
        
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Sorted string: " + sortedString);

        System.out.println("23DCS089_Samarth Patel");
    }
}