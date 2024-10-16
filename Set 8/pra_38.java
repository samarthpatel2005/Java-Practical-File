import java.awt.DisplayMode;
import java.util.*;

class Stack {

    ArrayList<Integer> Stack = new ArrayList<Integer>();

    public void push(int data) {
        Stack.add(data);
        System.out.println("Data added succesfully !");
    }

    public void pop() {
        if (!isempty()) {
            Stack.remove(Stack.size() - 1);
        } else {
            System.out.println("Stack is empty !");
        }
    }

    public int getSize() {
        return Stack.size();
    }

    public int peek() {
        if (!isempty()) {
            return Stack.get(Stack.size() - 1);
        } else {
            System.out.println("Stack is empty !");
            return 0;
        }
    }

    public boolean isempty() {

        return Stack.isEmpty();
    }

    public void display() {
        for (int i = Stack.size() - 1; i >= 0; i--) {
            System.out.println(Stack.get(i));
        }
    }
}

public class pra_38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
Stack stack=new Stack();
        while (true) {
            System.out.println("1.Push Element ");
            System.out.println("2.Pop Element ");
            System.out.println("3.Get size of Stack ");
            System.out.println("4.Peek ");
            System.out.println("5.isEmpty ?  ");
            System.out.println("6.Displays");
            System.out.println("7.exit");
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Data: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Size of the stack is :" + stack.getSize());
                    break;
                case 4:
                    int d = stack.peek();
                    System.out.println("top element is : " + d);
                    break;
                case 5:
                    boolean flag = stack.isempty();
                    if (flag) {
                        
                        System.out.println("The Stack is empty");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 6:
                stack.display();
                case 7:
                    break;

            }
            
            System.out.println("");
            if(ch==7)
            break;
        }
        System.out.println("23DCS089_Samarth");
    }
}


