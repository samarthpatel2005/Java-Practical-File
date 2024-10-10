class Parant{
    public void printp(){
        System.out.println("Parent");
    }
}
class Child extends  Parant{
    public void printc(){
        System.out.println("Child");
    }
}

public class pra_17{
    public static void main(String[] args){
        
        Parant p = new Parant();
        Child c = new Child();
        p.printp();
        c.printc();
        c.printp();
        System.out.println("23DCS089_Samarth");
    }

}