// class Date {
//     private int day;
//     private int month;
//     private int year;

//         Date(int day, int month, int year) {
//         day = day;
//         month = month;
//         year = year;
//     }

//         int getDay() {
//         return day;
//     }

//         void setDay(int day) {
//         day = day;
//     }

//         int getMonth() {
//         return month;
//     }

//     void setMonth(int month) {
//         month = month;
//     }

//     int getYear() {
//         return year;
//     }

//     void setYear(int year) {
//         year = year;
//     }

//     void displayDate() {
//         System.out.println(month + "/" + day + "/" + year);
//     }
// }

// public class pra_14 {
//     public static void main(String[] args) {
//         Date d1 = new Date(10, 10, 2021);
//         Date d2 = new Date(11, 7, 2022);
//         d1.displayDate();
//         System.out.println("New date:");
//         d2.displayDate();
//         System.out.println("23DCS089_Samarth Patel");
//     }
// }
class date{
    private int day;
    private int month;
    private int year;
    date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }
    // void getdata(){
    //     System.out.println("Enter the day, month and year: ");
    //     // day = 10;
        //     // month = 10;
    //     // year = 2021;
    // }
    void display(){
        System.out.println(month + "/" + day + "/" + year);
    }
}

public class pra_14 {
    public static void main(String[] args) {
        date d1 = new date(10, 10, 2021);
        date d2 = new date(11, 7, 2022);
        System.out.print("Old date : ");
        d1.display();
        System.out.print("New date : ");
        d2.display();
        System.out.println("23DCS089_Samarth Patel");
    }
}
