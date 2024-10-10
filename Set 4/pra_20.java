class shape{
    void print(){
        System.out.println("This is shape");
    }
}

class Rectangle extends shape{
    void print1(){
        System.out.println("This is Rectangle");
    }
}

class Circle extends shape{
    void print2(){
        System.out.println("This is Circle");
    }
}

class Squre extends Rectangle{
    void print3(){
        System.out.println("Squre is rectangle");
    }
}

public class pra_20 {
    public static void main(String[] args) {
        Squre s = new Squre();
        s.print();
        s.print1();
        s.print3();
        System.out.println("23DCS089_Samarth");
    }
}
