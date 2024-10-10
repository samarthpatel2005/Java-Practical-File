import java.util.*;

public class Pra3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter the distance in meters: ");
        float distance = sc.nextFloat();
        System.out.print("Enter the time (in hours): ");
        int hours = sc.nextInt();
        System.out.print("Enter the time (in minutes): ");
        int minutes = sc.nextInt();
        System.out.print("Enter the time (in seconds): ");
        int seconds = sc.nextInt();

        float totalSeconds;
        totalSeconds = seconds+(minutes*60)+(hours*3600);

        float speed1= distance / totalSeconds;
        float speed2= (distance / 1000) / (totalSeconds / 3600);
        float speed3= (distance / 1609) / (totalSeconds / 3600);

        System.out.println("Speed in meters/second: " + speed1);
        System.out.println("Speed in kilometers/hour: " + speed2);
        System.out.println("Speed in miles/hour: " + speed3);
        System.out.println("23DCS089_SAMARTH PATEL");
    }

    
}

