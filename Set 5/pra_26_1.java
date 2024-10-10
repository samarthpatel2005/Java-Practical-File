class MyException extends Exception {
    public MyException() {
        System.out.println("Exepction created by user");
    }
}

public class pra_26_1 {

    static void checkValue(int value) throws MyException {
        if (value > 10) {
            throw new MyException();
        }
        System.out.println("Value is acceptable: " + value);
    }
    public static void main(String[] args) {
        try {
            checkValue(5); 
            checkValue(15);

        } catch (MyException e) {
            System.out.println("Caught exception: ");
        }

        System.out.println("23DCS089 Samarth Patel");
    }
}