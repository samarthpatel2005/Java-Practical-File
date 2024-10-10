interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
public class pra_22 {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        int n = 12;
        System.out.println(my_calculator.divisor_sum(n));
        System.out.println("23DCS089_Samarth");
    }

}
