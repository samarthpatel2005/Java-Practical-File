import java.util.*;
public class Pr9 {
    static void double_char(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            System.out.print(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s1 = "The";
        String s2 = "AAbb";
        String s3 = "Hi-There";
        double_char(s1);
        double_char(s2);
        double_char(s3);
        System.out.println("23DCS089_Samarth Patel");
    }
}