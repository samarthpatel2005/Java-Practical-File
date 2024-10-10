
class sumthread extends Thread{
    private int start, end;
    int sum = 0;

    public sumthread(int a,int b){
        start = a;
        end = b;
    }

    public void run(){
        for(int i = start; i < end; i++){
            sum += i;
        }
        System.out.println("Sum of start to end is: " + sum);
    }
}
public class pra_33 {
    public static void main(String[] args) {
        sumthread st = new sumthread(2,6);
        st.start();
        System.out.println("23DCS089_Samarth");
    }
}
