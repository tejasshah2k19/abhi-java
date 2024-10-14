import java.util.Scanner;

public class Calculator2 {
    int n1 = 10;// instance variable
    int n2 = 20;// instance variable

    public static void main(String args[]) {

        // calling
        Calculator2 obj = new Calculator2();

        // using dot operator
        obj.add(25, 30);// parameter-argument
        obj.add(250, 300);

        obj.mul();

        obj.FtoC(250);

    }

    //
    void add(int x, int y) {
        int ans = x + y;// local variable
        System.out.println(ans);
    }

    void sub() {
        int ans = n1 - n2;// local variable
        System.out.println(ans);
    }

    void mul() {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter n1 : ");
        n1 = scr.nextInt();// integer read ->
        System.out.println("Enter n2 : ");
        n2 = scr.nextInt();

        int ans = n1 * n2;
        System.out.println(ans);
    }

    void FtoC(int f){//parameter->input 
        int c; 
        c = f*12;
        System.out.println(c);
    }
}
