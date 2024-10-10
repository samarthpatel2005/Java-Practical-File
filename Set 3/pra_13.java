class Employee {
    String fname;
    String lname;
    double salary;

    public Employee(String f, String l, double s) {
        fname = f;
        lname = l;
        if (salary < 0) {
            salary = 0.0;
        } else {
            salary = s;
        }
    }

    double getYearlySalary() {
        return salary * 12;
    }

    void giveRaise(int percent) {
        salary = salary + (salary * percent / 100);
    }

    void displayname() {
        System.out.println(fname + " " + lname);
    }

    void displaysalary() {
        // getYearlySalary();
        System.out.println("Salary: " + salary);
    }
}

public class pra_13 {
    public static void main(String[] args) {

        Employee em1 = new Employee("Shubh", "patel", 4000.0);
        Employee em2 = new Employee("Mark", "patel", 5000.0);

        System.out.print("The name of the Employee 1 :");
        em1.displayname();
        System.out.println("Yearly salary of employee 1: " + em1.getYearlySalary());

        System.out.print("The name of the Employee 2 :");
        em2.displayname();
        System.out.println("Yearly salary of employee 2: " + em2.getYearlySalary());

        em1.giveRaise(10);
        em2.giveRaise(10);

        System.out.println("Yearly salary of employee 1 after raise: " + em1.getYearlySalary());
        System.out.println("Yearly salary of employee 2 after raise: " + em2.getYearlySalary());

        System.out.println("23DCS089_Samarth");
    }
}